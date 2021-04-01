package Testcases;

import base.Page;
import errorcollectors.ErrorCollector;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pages.actions.HomePage;
import utilities.Utilities;

import java.util.Hashtable;

public class FlightSearchTest {

    @Test(dataProviderClass = Utilities.class,dataProvider = "dp")
    public void flightSearchTest(Hashtable<String,String> data) {

       /* if(data.get("runmode").equalsIgnoreCase("N")){

            throw  new SkipException("skipping test as a rummode is No");

        }*/

        Page.initConfiguration();
        HomePage home= new HomePage();
        //Assert.assertEquals(home.findTabCount(),5);
        //Example of soft assertion present in errorcollector pkg
        //ErrorCollector.verifyEquals(home.findTabCount(),6);

        home.gotoFlight().bookAFlight(data.get("fromCity"),data.get("toCity"),data.get("Date"));
        //Page.quitBrowser();/
    }

    @AfterMethod
    public void teardown() {
        if (Page.driver != null) {
            Page.quitBrowser();
        }
    }

}
