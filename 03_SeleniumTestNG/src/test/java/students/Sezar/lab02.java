package students.Sezar;

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
        //Open Chrome Browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //Go to https://www.facebook.com
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        //Verify title: Expected: "Facebook - Log In or Sign Up"
        String expectedTitle = "Facebook";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Facebook title verification has passed");

        } else {
            System.out.println("Facebook title verification has failed");
        }
        System.out.println("actual title is=" + actualTitle);
        //Open Chrome Browser
        //Go to google
        driver.get("https://www.google.com");
        //Navigate back
        driver.navigate().back();
        Thread.sleep(2000);
        //Navigate forward
        driver.navigate().forward();
        //Navigate to https://www.amazon.com
        driver.get("https://www.amazon.com");
        //Verify title contains : Smile
        String expectedTitleWord = "Smile";
        String actualTitle1 = driver.getTitle();
        if (actualTitle1.contains(expectedTitleWord)) {
            System.out.println("Amazon title verification has passed");
        } else {
            System.out.println("Amazon title verification has failed");
        }
        System.out.println("actual title is =" + actualTitle1);
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

        // Go to https://www.etsy.com/
        driver.get("https://www.etsy.com/");
        // Maximize window
        driver.manage().window().maximize();
        // Verify title doesnt contains "Smile"
        String expectedTitle3="Smile";
        // Verify title
        String actualTitle3=driver.getTitle();
        if (!actualTitle.contains(expectedTitle3)){
            System.out.println("Title doesnt contain smile");
        }else{
            System.out.println("contains smile");
        }
        System.out.println(actualTitle3);
        // Verify Current Url
        System.out.println("Driver.getCurrentUrl() = " + driver.getCurrentUrl());
        // Navigate Back
        driver.navigate().back();
        // Refresh
        driver.navigate().refresh();
        Thread.sleep(4000);
        // Quit browser
        driver.quit();
    }
}


