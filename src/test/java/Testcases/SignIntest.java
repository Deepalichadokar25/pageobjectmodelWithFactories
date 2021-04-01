package Testcases;

import base.Page;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pages.actions.SignInPage;
import utilities.Utilities;

import java.util.Hashtable;

public class SignIntest {

    @Test(dataProviderClass = Utilities.class,dataProvider = "dp")
    public void signInTest(Hashtable<String,String> data) {

        if(data.get("runmode").equalsIgnoreCase("N")){

            throw  new SkipException("skipping test as a rummode is No");

        }
        Page.initConfiguration();
        SignInPage signin=Page.topNav.gotosign();
        signin.doLogin(data.get("username"),data.get("password"));
    }
   @AfterMethod
    public void teardown() {
       if (Page.driver != null) {
           Page.quitBrowser();
       }
   }

}
