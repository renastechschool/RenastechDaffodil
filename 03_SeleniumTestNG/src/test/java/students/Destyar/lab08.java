package students.Destyar;


import code.utilities.BrowserUtils;
import code.utilities.WebDriverUtil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class lab08 {

    //Step 1) Launch the web browser and open the site http://demo.guru99.com/test/delete_customer.php
//Step 2) Enter Any Customer id.
//Step 3) After entering the customer ID, Click on the “Submit” button.
//Step 4) Reject/accept the alert.

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        //Step 1) Launch the web browser and open the site http://demo.guru99.com/test/delete_customer.php
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/test/delete_customer.php");
    }

    @Test
    public void HandleAlert() {
        //Step 2) Enter Any Customer id.
        driver.findElement(By.cssSelector("Input[type='text']")).sendKeys("DB123");
        //Step 3) After entering the customer ID, Click on the “Submit” button.
        driver.findElement(By.name("submit")).click();
        Alert alert = driver.switchTo().alert();
        BrowserUtils.wait(3);
        System.out.println(alert.getText());
        alert.accept();
        BrowserUtils.wait(3);
        System.out.println(alert.getText());
        alert.dismiss();

    }
    @AfterMethod
    public void closing(){
        BrowserUtils.wait(3);
        driver.quit();

    }




}
