package code.day29_Inheritence_Owerrting.FacebookLogin;

public class FacebookChrome extends FacebookLogin {

    //belows are been inherited from FacebookLogin
    //username,password
    //getters /seetters method
    //openbrowser,gotourl,closebrowser,passcredantials

    @Override
    public void openBrowser(){
        System.out.println("Chrome browser is started");
    }
}
