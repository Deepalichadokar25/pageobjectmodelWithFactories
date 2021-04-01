package base;

import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebElement;
import utilities.ExcelReader;
import utilities.ExtentManager;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.actions.TopNavigation;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Page {

    public static WebDriver driver;
    public static Logger log = Logger.getLogger("devpinoyLogger");
    public static ExcelReader excel = new ExcelReader(System.getProperty("user.dir") + "\\src\\test\\java\\excel\\testdata.xlsx");
    public static WebDriverWait wait;
    public ExtentReports rep = ExtentManager.getInstance();
    public static ExtentTest test;
    public static String browser;
    public static TopNavigation topNav;
   public  static  void initConfiguration() {

       if (Constants.browser.equals("firefox")) {

           // System.setProperty("webdriver.gecko.driver", "gecko.exe");
           driver = new FirefoxDriver();

       } else if (Constants.browser.equals("chrome")) {

           System.setProperty("webdriver.chrome.driver","F:\\PageObjectWithFactories\\src\\test\\java\\executable\\chromedriver.exe");
           Map<String, Object> prefs = new HashMap<String, Object>();
           prefs.put("profile.default_content_setting_values.notifications", 2);
           prefs.put("credentials_enable_service", false);
           prefs.put("profile.password_manager_enabled", false);
           ChromeOptions options = new ChromeOptions();
           options.setExperimentalOption("prefs", prefs);
           options.addArguments("--disable-extensions");
           options.addArguments("--disable-infobars");

           driver = new ChromeDriver();
           log.debug("Chrome Launching");
       }else if (Constants.browser.equals("ie")) {

           System.setProperty("webdriver.ie.driver",
                   System.getProperty("user.dir") + "\\src\\test\\java\\executables\\IEDriverServer.exe");
           driver = new InternetExplorerDriver();
           log.debug("IE Launching");
       }
       driver.get(Constants.testurl);
       driver.manage().window().maximize();
      // driver.manage().timeouts().implicitlyWait(Constants.implicitwait, TimeUnit.SECONDS);
       //wait=new WebDriverWait();
       topNav=new TopNavigation(driver);
   }
    //To write in a log file
   public static  void click(WebElement element){
     element.click();
     log.debug("Clicking on element:"+element);
     test.log(LogStatus.INFO,"clicking on :"+element);


   }
   public static  void type( WebElement element,String value){
      element.sendKeys(value);
       log.debug("Typing in Element :" +element+ "entered value is"+value);
       test.log(LogStatus.INFO,"Typing in :"+element+" entered value is :" +value);
   }


   public  static void quitBrowser(){


   }

}
