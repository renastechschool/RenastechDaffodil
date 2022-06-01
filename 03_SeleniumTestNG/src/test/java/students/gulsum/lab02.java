package students.gulsum;
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

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class lab02 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        String expectedTitle = "Facebook";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Facebook title verification has passed");

        } else {
            System.out.println("Facebook title verification has failed");
        }
        System.out.println("actual title is=" + actualTitle);

        driver.get("https://www.google.com");
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();

        driver.get("https://www.amazon.com");
        String expectedTitleWord = "Smile";
        String actualTitle1 = driver.getTitle();
        if (actualTitle1.contains(expectedTitleWord)) {
            System.out.println("Amazon title verification has passed");
        } else {
            System.out.println("Amazon title verification has failed");
        }
        System.out.println("Actual title is =" + actualTitle1);

        //Second Task:
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

        driver.get("https://www.etsy.com/");
        driver.manage().window().maximize();
        String expectedTitle1 = "Smile";

        String actualtitle2= driver.getTitle();
        if(!actualtitle2.contains(expectedTitle1)){
            System.out.println("Title doesn't contain smile");
        }else{
            System.out.println("contains smile");
        }
        System.out.println("actual title ="+actualtitle2);
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        driver.navigate().back();
        driver.navigate().refresh();
        driver.quit();




    }}