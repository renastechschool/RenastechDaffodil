package students.Suleyman;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab02 {

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

    public static void main(String[] args) throws InterruptedException {

       // Open Chrome Browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        //Go to https://www.facebook.com
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();

        //Verify title: Expected: "Facebook - Log In or Sign Up"
        String expectedTitle="Facebook - log in or sign up";
        String actualTitle= driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title Verification has Passed ");
        }else {
            System.out.println("Title Verification has failed");
        }

        System.out.println("Title is : " + driver.getTitle());
        driver.close();


        System.out.println("-------------------------------------------------------");
        //Task - 2
        //Open Chrome Browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver1=new ChromeDriver();

        //Go to google
        driver1.get("https://www.google.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver1.navigate().back();

        Thread.sleep(4000);
        //Navigate forward
        driver1.navigate().forward();

        //Navigate to https://www.amazon.com
        driver1.navigate().to("https://www.amazon.com");

        //Verify title contains : Smile
        String expectedTitle1="Smile";
        String actualTitle1= driver1.getTitle();

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title verification has Passed");
        }else {
            System.out.println("Title Verification has Failed");
        }
        System.out.println("Title is :" + driver1.getTitle());
        driver1.close();
    }

}
