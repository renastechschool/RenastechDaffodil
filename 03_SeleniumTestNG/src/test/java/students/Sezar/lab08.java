package students.Sezar;

import code.utilities.BrowserUtils;
import code.utilities.WebDriverUtil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class lab08 {
    //Launch the web browser and open the site http://demo.guru99.com/test/delete_customer.php
    // Step 2) Enter Any Customer id.
    // Step 3) After entering the customer ID, Click on the “Submit” button.
    // Step 4) Reject/accept the alert.
    WebDriver driver;

    @BeforeMethod
    public void setUp() throws InterruptedException {
        //Launch the web browser and open the site http://demo.guru99.com/test/delete_customer.php
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/test/delete_customer.php");
    }
    @Test
    public void TC1_GoToAmazonAndSearchForDesk() throws InterruptedException {
        System.out.println("TC1 is running");
        // Step 2) Enter Any Customer id.
        driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("472536");
        // Step 3) After entering the customer ID, Click on the “Submit” button.
        driver.findElement(By.xpath("//input[@name='submit']")).click();
        // Step 4) Reject/accept the alert.
        Alert alert=driver.switchTo().alert();
        BrowserUtils.wait(4);
        alert.accept();
    }
    @AfterMethod
    public void closing() {

        driver.quit();
}}