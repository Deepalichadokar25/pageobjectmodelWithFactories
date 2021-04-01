package pages.actions;

import base.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import pages.locators.TopNavigationLocator;

public class TopNavigation  {

    public TopNavigationLocator topNavigation;
    public TopNavigation(WebDriver driver){

     this.topNavigation =new TopNavigationLocator();
        AjaxElementLocatorFactory factory=new AjaxElementLocatorFactory(driver,10);
        PageFactory.initElements(factory,this.topNavigation);
    }

    public SignInPage gotosign(){

       // topNavigation.signIn.click();
        //topNavigation.signInbtn.click();
       Page.click(topNavigation.signIn);
       Page.click(topNavigation.signInbtn);


       return  new SignInPage();
    }

    public void createAccount(){


    }
    public void gotoSupport(){


    }
    public void gotoTrip(){



    }
    //Top navigation bar
    public void gotoHotels(){


    }public void gotoFlights(){


    }
    public void gotoCras(){


    }
    public void gotoHolidaypkg(){


    }
    public void HolidayActivities(){



    }
    public void Deals(){


    }
}
