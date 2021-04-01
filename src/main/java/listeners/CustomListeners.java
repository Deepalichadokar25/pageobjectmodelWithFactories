package listeners;

import base.Page;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.*;
import utilities.MonitoringMail;
import utilities.TestConfig;
import utilities.Utilities;
//import utilities.Utilities;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class CustomListeners extends Page implements ITestListener, ISuiteListener {

    public 	String messageBody;

    @Override
    public void onStart(ISuite arg0) {

    }

    @Override
    public void onFinish(ISuite arg0) {

        MonitoringMail mail = new MonitoringMail();

        try {
            messageBody = "http://" + InetAddress.getLocalHost().getHostAddress()
                    + ":8080/job/LiveProject-PageObjectWithFactories/Extent_Report/";
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
            mail.sendMail(TestConfig.server, TestConfig.from, TestConfig.to, TestConfig.subject, messageBody);
        } catch (AddressException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (MessagingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    @Override
    public void onTestStart(ITestResult arg0) {

        test = rep.startTest(arg0.getName().toUpperCase());


    }

    @Override
    public void onTestSuccess(ITestResult arg0) {

        test.log(LogStatus.PASS, arg0.getName().toUpperCase()+" PASS");
        rep.endTest(test);
        rep.flush();


    }

    @Override
    public void onTestFailure(ITestResult arg0) {
        System.setProperty("org.uncommons.reportng.escape-output","false");
        try {
            Utilities.captureScreenshot();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        test.log(LogStatus.FAIL, arg0.getName().toUpperCase()+" Failed with exception : "+arg0.getThrowable());
        test.log(LogStatus.INFO, test.addScreenCapture(Utilities.screenshotName));



        Reporter.log("Click to see Screenshot");
        Reporter.log("<a target=\"_blank\" href="+Utilities.screenshotName+">Screenshot</a>");
        Reporter.log("<br>");
        Reporter.log("<br>");
        Reporter.log("<a target=\"_blank\" href="+Utilities.screenshotName+"><img src="+Utilities.screenshotName+" height=200 width=200></img></a>");
        rep.endTest(test);
        rep.flush();

    }



    @Override
    public void onTestSkipped(ITestResult arg0) {

        test.log(LogStatus.SKIP, arg0.getName().toUpperCase()+" Skipped the test as the Run mode is NO");
        rep.endTest(test);
        rep.flush();

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext arg0) {

    }

    @Override
    public void onFinish(ITestContext arg0) {

    }
}
