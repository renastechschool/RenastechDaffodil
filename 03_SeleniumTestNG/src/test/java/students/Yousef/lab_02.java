package students.Yousef;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class lab_02 {
    public static void main(String[] args) throws InterruptedException {
        //TC #1: Facebook title verification

//Task - 1
//Open Chrome Browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
 //Go to https://www.facebook.com

        driver .get("https://www.facebook.com");
        Thread.sleep(4000);
 //Verify title: Expected: "Facebook - Log In or Sign Up"
        String expectedTitle="Facebook";
        String actualTitle=driver.getTitle();
        if (actualTitle.equals(expectedTitle)){
            System.out.println(" Facebook title verification has passed ");
        }else {
            System.out.println(" Facebook title verification has failed ");}

//Task - 2
//Open Chrome Browser
        WebDriver driver1 = new ChromeDriver();
//Go to google
        driver1. get("https://www.google.com/");
//Navigate back
        driver1.navigate().back();
        Thread.sleep(4000);
//Navigate forward
        driver1.navigate().forward();
        Thread.sleep(4000);
//Navigate to https://www.amazon.com
        driver1.get("https://www.amazon.com");
        Thread.sleep(4000);
//Verify title contains : Smile
        String expectedTitleWord="Smile";
        String actulTitle=driver1.getTitle();
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Amazon title contains Smile ");
        }else {
            System.out.println("Amazon title doesn't contains Smile ");
        }




     //   Second Task:
        // Go to https://www.etsy.com/
        WebDriverManager.chromedriver();
        WebDriver driver2=new ChromeDriver();
        driver2.get("https://www.etsy.com/");
        // Maximize window
        driver2.manage().window().maximize();

        // Verify title doesn't contains "Smile"
        String expectedTitle2 = "No Smile";
        String actualTitle2 = driver2.getTitle();
        if(actualTitle2== expectedTitle2){
            System.out.println("Title doesn't contains Smile");}
        else {
            System.out.println("Title contains Smile");}

        // Verify Current Url
        // Go to https://www.amazon.com/
        WebDriverManager.safaridriver();
        WebDriver driver3 = new SafariDriver();
        driver3.get("https://www.amazon.com/");
        // Verify title
        driver3.getTitle();
        // Verify Current Url
        // Navigate Back
        driver3.navigate().back();
        // Refresh
        driver3.navigate().refresh();
        // Quit browser
        driver3.quit();

    }

}
