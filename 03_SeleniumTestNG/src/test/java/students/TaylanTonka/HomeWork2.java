package students.TaylanTonka;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HomeWork2 {
    WebDriver driver;
    String expectedValue;
    String actualValue;
    String actualURL;
    String expectedURL;
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        HomeWork2 hw2 = new HomeWork2();
        hw2.task1();
        hw2.task2();
    }

    public void task1() throws InterruptedException {
        driver= new ChromeDriver();
        driver.get("https://www.facebook.com");
         expectedValue = "Facebook - log in or sign up";
         actualValue = driver.getTitle();
        Assert.assertEquals(expectedValue,actualValue);
        driver.close();
        driver= new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().forward();
        Thread.sleep(1000);
        driver.get("https://www.amazon.com");

        expectedValue = "Smile";
        actualValue = driver.getTitle();

        if(actualValue.contains(expectedValue))
        {
            System.out.printf("Task 1 passed");
        }



    }

    public void task2() throws InterruptedException {
        driver= new ChromeDriver();
        driver.get("https://www.etsy.com/");
        driver.manage().window().maximize();
        expectedValue = "Smile";
        actualValue = driver.getTitle();

        if(!actualValue.contains(expectedValue))
        {
            System.out.println("etsy title doesn't contains Smile");
        }
        actualURL = driver.getCurrentUrl();
        expectedURL = "https://www.etsy.com/";

        Assert.assertEquals(actualURL,expectedURL);

        Thread.sleep(3000);
        driver.navigate().to("https://www.amazon.ca/");
        actualValue = driver.getTitle();
        expectedValue = "Amazon.ca: Low Prices – Fast Shipping – Millions of Items";
        Assert.assertEquals(actualValue,expectedValue);


        actualURL = driver.getCurrentUrl();
        expectedURL = "https://www.amazon.ca/";
        Assert.assertEquals(actualURL,expectedURL);

        driver.navigate().back();
        driver.navigate().refresh();

        driver.quit();

        System.out.println("Task 2 passed");

    }


}
