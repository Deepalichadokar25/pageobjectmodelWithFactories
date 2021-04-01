package rough;

import base.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.actions.HomePage;

public class FlightSearchTest {

    public static void main(String[] args) {

        Page.initConfiguration();
        HomePage home= new HomePage();
        home.gotoFlight().bookAFlight("Delhi (DEL - Indira Gandhi Intl.)","London (LHR - Heathrow)","12/04/21");
        //Page.quitBrowser();/
    }

}
