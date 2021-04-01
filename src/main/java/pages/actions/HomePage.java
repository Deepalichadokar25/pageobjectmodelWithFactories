package pages.actions;

import base.Page;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.locators.HomePageLocator;

public class HomePage extends Page {

    //home page constructor
    public HomePageLocator home;

    //constructor of HomePage
    public HomePage() {

        this.home = new HomePageLocator();

        PageFactory.initElements(driver, this.home);

    }

    public HomePage gotoFlight() {

        //home.flightTab.click();
        click(home.flightTab);
        return this;

    }

    public void gotoHotel() {


    }

    public void gotoCars() {


    }

    public int findTabCount() {

        return home.tabcount.size();
    }


    public void bookAFlight(String From, String To, String Departure) {

        home.Oneway.click();
        type(home.LeavingFrom,From);
        //home.LeavingFrom.sendKeys(From);
        Actions action = new Actions(driver);
        action.sendKeys(Keys.ENTER).perform();
        //home.GoingTo.sendKeys(To);
        type(home.GoingTo,To);
        Actions action1 = new Actions(driver);
        action1.sendKeys(Keys.ENTER).perform();
        //home.Depaturing.sendKeys(Departure);
        //home.returning.sendKeys(ReturnTo);
        //home.searchbtn.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /*home.block.click();
        Actions action2=new Actions(driver);
        action2.sendKeys(Keys.ENTER).perform();*/
        // home.searchbtn.click();
        click(home.searchbtn);

    }
}
