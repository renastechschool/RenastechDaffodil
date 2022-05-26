package students.Kobraazizi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.System.*;
import static java.lang.Thread.sleep;

public class lab_02 {
    public static void main(String[] args) throws InterruptedException {
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
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        Thread.sleep(4000);
       // Go to https://www.facebook.com
        driver.navigate().to(" https://www.facebook.com");
        String expectedTitleWord="facebook";
        String actualTitle=driver.getTitle();
        String expectedTitle = null;

        if(expectedTitle.equals(actualTitle)){
            out.println("Faceebook title verification has log in ");
        }else {
            out.println("Faceebook title verification  faild");

        }
        out.println("Actual title is ="+actualTitle);
        driver.close();
        //Open Chrome Browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver1=new ChromeDriver();
        driver1.get("https://www.google.com/");
        driver1.manage().window().maximize();
        Thread.sleep(4000);
        //Navigate back
        driver1.navigate().back();
        Thread.sleep(4000);
        driver1.navigate().forward();
         //Navigate to https://www.amazon.com
          driver1.get("https://www.amazon.com");








    }
}
