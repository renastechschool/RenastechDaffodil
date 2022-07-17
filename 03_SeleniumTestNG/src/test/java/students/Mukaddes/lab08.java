package students.Mukaddes;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class lab08 {
   // 1) Launch the web browser and open the site http://demo.guru99.com/test/delete_customer.php
   // Step 2) Enter Any Customer id.
   // Step 3) After entering the customer ID, Click on the “Submit” button.
          //  Step 4) Reject/accept the alert.

    WebDriver driver;
    @BeforeClass
    public void setup(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/test/delete_customer.php");
    }
    @AfterClass
    public void closing() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public void TC1(){
        // Step 2) Enter Any Customer id.
        driver.findElement(By.name("cusid")).sendKeys("apple");

        // Step 3) After entering the customer ID, Click on the “Submit” button.
        driver.findElement(By.name("submit")).click();
        driver.switchTo().alert().accept();


    }

}
