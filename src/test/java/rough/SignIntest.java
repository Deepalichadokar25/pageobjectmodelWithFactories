package rough;

import base.Page;
import pages.actions.SignInPage;

public class SignIntest {


    public static void main(String[] args) {

        Page.initConfiguration();
        SignInPage signin=Page.topNav.gotosign();
        signin.doLogin("deepali@gmail.com","12345");
    }
}
