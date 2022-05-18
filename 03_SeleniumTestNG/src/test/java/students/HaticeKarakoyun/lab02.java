package students.HaticeKarakoyun;

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

    //Second Task:
    // Go to https://www.etsy.com/
    // Maximize window
    // Verify title doesn't contains "Smile"
    // Verify Current Url
    // Go to https://www.amazon.com/
    // Verify title
    // Verify Current Url
    // Navigate Back
    // Refresh
    // Quit browser

    public static void main(String[] args) throws InterruptedException {

        //Open Chrome Browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //Go to https://www.facebook.com
        Thread.sleep(400);
        driver.get("https://www.facebook.com");

        //Verify title: Expected: "Facebook - Log In or Sign Up"
        String exceptedTitle = "Facebook - Log In or Sign Up";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(exceptedTitle)) {
            System.out.println("Facebook - Log In or Sign Up title verification has passed");

        }else{
            System.out.println("Facebook - Log In or Sign Up title verification has failed");
        }

        System.out.println("actual title is="+actualTitle);
        driver.close();

        //Task - 2
        //Open Chrome Browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver2 = new ChromeDriver();

        //Go to google
        Thread.sleep(200);
        driver.get("https://www.google.com");

        //Navigate back
        driver.navigate().back();

        //navigate forward
        Thread.sleep(4000);
        driver.navigate().forward();

        //Navigate to https://www.amazon.com
        Thread.sleep(4000);
        driver.navigate().to("https://www.amazon.com");

        //Verify title contains : Smile
        String expectedTitleWord="Smile";
        String actual=driver.getTitle();

        if(actualTitle.contains(expectedTitleWord)){
            System.out.println("Amazon title contains Smile and title verification has passed");
        }else {
            System.out.println("Amazon title does not contains Smile and title verification has failed");
        }
        System.out.println("Actual title is ="+actualTitle);
        driver.close();

        //Second Task:
        // Go to https://www.etsy.com/
        driver.get("https://www.etsy.com");

        // Maximize window
        driver.manage().window().maximize();
        Thread.sleep(4000);

        // Verify title doesn't contains "Smile"






    }
}
