package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePageLocator {

    //Define Web Element
    @FindBy(xpath = "//*[@id=\"uitk-tabs-button-container\"]/li[2]/a")
    public WebElement flightTab;

    //Locators for flight
    @FindBy(xpath = "//*[@id=\"uitk-tabs-button-container\"]/div[1]/li[2]/a/span")
    public  WebElement Oneway;


    @FindBy(xpath = "//*[@id=\"location-field-leg1-origin-menu\"]/div[1]/button")
    public WebElement LeavingFrom;

    @FindBy(xpath= "//*[@id=\"location-field-leg1-destination-menu\"]/div[1]/button")
    public WebElement GoingTo;

    @FindBy(css= "#d1-btn")
    public WebElement Depaturing;

   // @FindBy(css= ".uitk-flex uitk-flex-align-items-flex-end uitk-flex-justify-content-flex-end uitk-spacing uitk-spacing-margin-blockend-six")
   // public WebElement block;



    // @FindBy(xpath="#d2-btn")
    //public  WebElement returning;

    @FindBy(xpath= "//*[@id=\"wizard-flight-pwa-1\"]/div[3]/div[2]/button")
    public WebElement searchbtn;


    @FindBy(css ="ul[role='tablist']" )
    public List<WebElement> tabcount;
}
