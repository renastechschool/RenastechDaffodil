package students.Destyar;

import code.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab02Task1 {
    //TC #1: Facebook title verification
//Task - 1
//Open Chrome Browser
//Go to https://www.facebook.com
//Verify title: Expected: "Facebook - Log In or Sign Up"
//Task - 2
//Open Chrome Browser
//Go to google
//Navigate back
//Navigate forward
//Navigate to https://www.amazon.com
//Verify title contains : Smile


    public static void main(String[] args) {

        //Open Chrome Browser
        WebDriverManager.chromedriver().setup();
        WebDriver chrome=new ChromeDriver();
        chrome.manage().window().maximize();
        //Go to https://www.facebook.com
        chrome.get("https://www.facebook.com");

        //Verify title: Expected: "Facebook - Log In or Sign Up"
        String expectedTitle="Facebook - Log In or Sign Up";
        String actualTitle= chrome.getTitle();


        System.out.println("actualTitle= " + actualTitle);
        if (actualTitle.equalsIgnoreCase(expectedTitle)) {
            System.out.println("Title verification has passed successfully");

        }else {
            System.out.println("Title verification has failed, try again");

            System.out.println("++++++++++++++++++++++++++++++++++++++");


        }

        BrowserUtils.wait(4);
        //Open Chrome Browser
        chrome.get("https://www.google.com/");

        //Navigate back
        chrome.navigate().back();

        BrowserUtils.wait(3);

        //Navigate forward
        chrome.navigate().forward();

        chrome.get("https://www.amazon.com");

        //Verify title contains : Smile
        chrome.getTitle().contains("Smile");

        String ExpectedTitle="Smile";
        String ActualTitle= chrome.getTitle();

        if (ActualTitle.contains(ExpectedTitle)){
            System.out.println("Passed");
        }else{
            System.out.println("failllllll");
        }



    }
}
