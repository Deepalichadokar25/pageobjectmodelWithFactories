package pages.actions;

import base.Page;
import org.openqa.selenium.support.PageFactory;
import pages.locators.HomePageLocator;
import pages.locators.SignInPageLocator;

public class SignInPage extends Page {

    public SignInPageLocator signinpage;

    public SignInPage(){

        this.signinpage =new SignInPageLocator();
        PageFactory.initElements(driver,this.signinpage);

    }

    public void doLogin(String username,String password)
    {
      //signinpage.Emailadd.sendKeys(username);
      //signinpage.Pwd.sendKeys(password);
      //signinpage.clicksignin.click();
      //or
        type(signinpage.Emailadd,username);
        type(signinpage.Pwd,password);

        click(signinpage.clicksignin);


    }
}
