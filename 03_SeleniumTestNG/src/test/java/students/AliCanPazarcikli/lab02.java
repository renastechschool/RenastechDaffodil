package students.AliCanPazarcikli;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab02 {
    public static void main(String[] args) throws InterruptedException {
        /*
        TC #1: Facebook title verification/Task - 1
Open Chrome Browser
Go to https://www.facebook.com
Verify title: Expected: "Facebook - Log In or Sign Up"
//Task - 2
Open Chrome Browser
Go to google
Navigate back
Navigate forward
Navigate to https://www.amazon.com
Verify title contains : Smile
         */
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        System.out.println("Title is : "+driver.getTitle());
        Thread.sleep(3000);
        driver.close();

        ChromeDriver driver1= new ChromeDriver();
        driver1.get("https://www.google.com");
        Thread.sleep(2000);
        driver1.navigate().back();
        Thread.sleep(2000);
        driver1.navigate().forward();
        Thread.sleep(2000);
        driver1.navigate().to("https://www.amazon.com");

        String expectedTitle="Smile";
        String actualTitle=driver1.getTitle();
        if(actualTitle.contains(expectedTitle)){
            System.out.println("Amazon title contains Smile.Therefore, title verification has passed.");
        }else{
            System.out.println("Amazon title does not contain Smile.Therefore, title verification has failed.");
        }
        System.out.println("The actual title is : "+ actualTitle);
        driver1.close();

        //    Second Task:
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

        ChromeDriver driver2=new ChromeDriver();
        driver2.get("https://www.etsy.com/");
        driver2.manage().window().fullscreen();
        if(driver2.getTitle().contentEquals("Smile")){
            System.out.println("Title contains 'Smile' and title verification has failed.");
        }else{
            System.out.println("Title doesnt contain 'Smile' and title verification has passed.");
        }
        System.out.println(driver2.getTitle());
        System.out.println("current URL is : "+driver2.getCurrentUrl());
        driver2.get("https://www.amazon.com/");
        System.out.println("Current title is = " + driver2.getTitle());
        System.out.println("Current URL is : "+driver2.getCurrentUrl());
        Thread.sleep(2000);
        driver2.navigate().back();
        Thread.sleep(3000);
        driver2.navigate().refresh();
        Thread.sleep(2000);
        driver2.quit();




    }
}
