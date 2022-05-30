package students.gule;
//TC #1: Facebook title verification
//Task - 1
//Open Chrome Browser
//Go to https://www.facebook.com
//Verify title: Expected: "Facebook - Log In or Sign Up"
//Task - 2
//Open Chrome Browser //Go to google //Navigate back //Navigate forward
//Navigate to https://www.amazon.com
//Verify title contains : Smile

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab02Task1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        Thread.sleep(1000);
        driver.get("https://www.facebook.com");
        Thread.sleep(3000);

        String exceptedTitle="Facebook - Log In or Sign Up";
        String actualTitle=driver.getTitle();
        if(actualTitle.equalsIgnoreCase(exceptedTitle)){
            System.out.println("Facebook title verification has passed.");
        }
        else{
            System.out.println("Facebook title verification has not passed.");
        }
        System.out.println("Actual Facebook title is : "+actualTitle);
        System.out.println("*******************************************************");
        driver.get("https://www.google.com");
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(4000);
        boolean b1 = driver.getTitle().contains("Smile");
        String actualTitleAmazon=driver.getTitle();
        if(b1){
            System.out.println("Amazon title contains Smile and title verification has passed.");
        }
        else {
            System.out.println("Amazon title does not contains Smile and title verification has failed.");
        }
        System.out.println("Actual Amazon title is ="+actualTitleAmazon);
    }
}
