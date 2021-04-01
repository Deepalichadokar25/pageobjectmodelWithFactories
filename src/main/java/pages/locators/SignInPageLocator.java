package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPageLocator {

    @FindBy(xpath = "//input[@id='signin-loginid']")
    public WebElement Emailadd;

    @FindBy(xpath = "//input[@id='signin-password']")
    public WebElement Pwd;

    @FindBy(xpath = "//button[@id='submitButton']")
    public WebElement clicksignin;






}
