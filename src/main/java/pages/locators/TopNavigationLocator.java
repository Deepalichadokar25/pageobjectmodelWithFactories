package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class TopNavigationLocator {

    /*@FindBy(xpath = "//div[contains(text(),'Sign in')]")
    public WebElement signIn;*/

    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    public WebElement signInbtn;

    @FindBy(xpath = "//span[contains(text(),'Create a free account')]")
    public WebElement createaccount;

  /*  @FindBy(xpath = "//div[contains(text(),'Sign in')]")
    public WebElement signIn;*/

    @FindAll({
            @FindBy(xpath="//div[contains(text(),'Sign in')]  "),
            @FindBy(css="body.uitk-no-outline:nth-child(2) div.app-layer-base--active div.uitk-grid.pageWhiteBackground:nth-child(1) header.page-header section.header-region.no-stripe div.site-header.all-l-padding-six.all-r-padding-two.global_navigation__header__default__max_width.all-l-padding-six.all-r-padding-two.s-y-margin-one.m-y-margin-three.l-y-margin-three.xl-y-margin-three nav.navigation-bar.uitk-grid.uitk-flex-align-items-center div.uitk-menu.uitk-menu-mounted button.uitk-button.uitk-button-small.uitk-button-has-text.uitk-menu-icon-trigger.uitk-menu-trigger > div.uitk-type-300 ")
    })
    public  WebElement signIn;




}
