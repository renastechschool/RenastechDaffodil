package students.Inci;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab02 {
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
        //        Second Task:
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

        String domain = "https://www.facebook.com/", domain1 = "https://www.google.com", domain2 = "https://www.amazon.com/", domain3 = "https://www.etsy.com/";
        String expectedTitle = "Facebook - Log In or Sign Up", expectedTitleWord = "Smile";
        int waitTime = 4000;
        String stars="------------------------------------------------------------------------------";

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(domain);
        System.out.println(stars);
        String actualTitle = driver.getTitle();
        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Facebook title matches, verification status: PASS\n" + "Title is: " + actualTitle);
        } else {
            System.out.println("Facebook title does not match, verification status: FAIL\nExpected title was: "+expectedTitle+"\nActual title is: "+actualTitle);
        }
        Thread.sleep(waitTime);
        driver.navigate().to(domain1);
        driver.navigate().back();
        Thread.sleep(waitTime);
        driver.navigate().forward();
        Thread.sleep(waitTime);
        driver.navigate().to(domain2);
        System.out.println(stars);
        String actualAmazonTitle = driver.getTitle();
        if (actualAmazonTitle.contains(expectedTitleWord)) {
            System.out.println("Amazon title contains the word Smile, test has passed\nActual title is: " + actualAmazonTitle);
        } else {
            System.out.println("Amazon title does NOT contain he word Smile, test has failed\nActual title is " + actualAmazonTitle);
        }
        Thread.sleep(waitTime);
        driver.navigate().to(domain3);
        driver.manage().window().maximize();
        System.out.println(stars);
        String etsyTitle = driver.getTitle(), etsyURL = driver.getCurrentUrl();
        if (etsyTitle.contains(expectedTitleWord)) {
            System.out.println("Etsy title contains the word Smile, test has failed.\nActual title: " + etsyTitle);
        } else {
            System.out.println("Etsy does not contain the word Smile, test has failed\nActual title: " + etsyTitle);
        }
        if (etsyURL.equals(domain3)) {
            System.out.println("Expected Etsy url was: " + domain3 + "\nCurrent URL is: " + etsyURL + "\nTest has passed");
        } else {
            System.out.println("The Expected and Actual URL's do not match.\nExpected URL: " + domain3 + "\nCurrent URL: " + etsyURL);
        }
        Thread.sleep(waitTime);
        driver.navigate().to(domain2);
        System.out.println(stars);
        System.out.println("Amazon Title: "+driver.getTitle());
        System.out.println("Amazon URL: "+driver.getCurrentUrl());
        driver.navigate().back();
        driver.navigate().refresh();
        driver.close();

    }

}

