package students.Mukaddes;

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
//Verify title contains : Smile.git


    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        String expectedTitle="Facebook - Log In or Sign Up";
        String actualTitle=driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Facebook - Log In or Sign Up has passed.");
        }else{
            System.out.println("Facebook - Log In or Sign Up has failed.");
        }
        System.out.println("actual title is: "+actualTitle);
        Thread.sleep(3000);
        driver.close();

        //Task - 2
//Open Chrome Browser
//Go to google
//Navigate back
//Navigate forward
//Navigate to https://www.amazon.com
//Verify title contains : Smile
        WebDriverManager.chromedriver().setup();
        WebDriver driver2=new ChromeDriver();
        driver2.get("https://google.com");
        Thread.sleep(2000);
        driver2.navigate().back();
        Thread.sleep(2000);
        driver2.navigate().forward();
        Thread.sleep(2000);
        driver2.get("https://www.amazon.com");
        String expectedTitle2="Smile";
        String actualTitle2=driver2.getTitle();
        if(expectedTitle2.contains(actualTitle2)){
            System.out.println("Amazon title verification has passed");
        }else{
            System.out.println("Amazon title verification has failed");
        }
        System.out.println("Actual title2 is: "+actualTitle2);
        Thread.sleep(2000);
        driver2.close();

        // Second Task:
        // Go to https://www.etsy.com/
        // Maximize window
        // Verify title doesnt contains "Smile"
        // Verify Current Url
        // Go to https://www.amazon.com/
        // Verify title
        // Verify Current Url
        // Navigate Back
        // Refresh
        // Quit browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver3=new ChromeDriver();
        driver3.get("https://www.etsy.com/");
        driver3.manage().window().maximize();
        String expectedTitle3="Smile";
        String actualTitle3=driver3.getTitle();
        if(!actualTitle3.contains(expectedTitle3)){
            System.out.println("Title does not contain smile");
        }else{
            System.out.println("Title contains smile");
        }
        System.out.println("current URL: "+driver3.getCurrentUrl());
        Thread.sleep(2000);
        driver3.get("https://www.amazon.com/");
        Thread.sleep(2000);
        System.out.println("title: "+driver3.getTitle());
        System.out.println("current URL: "+driver3.getCurrentUrl());
        Thread.sleep(2000);
        driver3.navigate().back();
        Thread.sleep(2000);
        driver3.navigate().refresh();
        Thread.sleep(2000);
        driver3.quit();



    }
}
