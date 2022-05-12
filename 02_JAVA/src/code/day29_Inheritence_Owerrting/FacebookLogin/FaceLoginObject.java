package code.day26_StaticBloc_Constructor.day29_Inheritence_Owerrting.FacebookLogin;

import code.MyUtils.GenericUtils;

public class FaceLoginObject {

    public static void main(String[] args) {
        FacebookLogin obj1 = new FacebookLogin();
       // obj1.userName="Java"; it is priavate
        obj1.setUserName("Hello");
        obj1.setPassword("java");

        System.out.println("obj1.getUserName() = " + obj1.getUserName());
        System.out.println("obj1.getPassword() = " + obj1.getPassword());

        FacebookChrome chrome=new FacebookChrome();
        chrome.openBrowser();
        chrome.goToUrl();
        chrome.passingCredentials("java123" , "hello123");
        System.out.println("chrome.getUserName() = " + chrome.getUserName());
        System.out.println("chrome.getPassword() = " + chrome.getPassword());
        chrome.closeBrowser();

        GenericUtils.Stars();

        FacebookFirefox firefox=new FacebookFirefox();
        firefox.openBrowser();
        firefox.goToUrl();
        firefox.passingCredentials("python123" , "world 123");
        System.out.println("firefox.getUserName() = " + firefox.getUserName());
        System.out.println("firefox.getPassword() = " + firefox.getPassword());
        firefox.closeBrowser();

    }
}
