package students.Gulistan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class lab02 {
    //Task - 1
//Open Chrome Browser
//Go to https://www.facebook.com
//Verify title: Expected: "Facebook - Log In or Sign Up"

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(4000);

        String expectedTitle = "Facebook - Log in or Sign up";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitle)) {

            System.out.println("Title verified");
        } else {
            System.out.println("Title not verified");
        }

//Task - 2
//Open Chrome Browser
//Go to google
//Navigate back
//Navigate forward
//Navigate to https://www.amazon.com
//Verify title contains : Smile

        driver.get("https://www.google.com/");
        Thread.sleep(3000);
        driver.navigate().back();
        driver.navigate().forward();
        driver.get("https://www.amazon.com/");
        Thread.sleep(3000);

        String title = "Smile";
        String title1 = driver.getTitle();

        if(title.contains(expectedTitle)){
            System.out.println("Amazon title is Smile");
        }else
            System.out.println("Amazon title is not Smile");

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

        driver.get("https://www.etsy.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        String expectedWord = "Smile";
        String actualTitle1 = driver.getTitle();

        if (actualTitle1.contains(expectedWord)){
            System.out.println("Title doesn't contains Smile");
        }else{
            System.out.println("Title is contains Smile");
        }

        System.out.println(driver.getCurrentUrl());
        driver.get("https://www.amazon.com/");
        Thread.sleep(3000);
        driver.navigate().back();
        driver.navigate().refresh();
        driver.quit();

    }

}
