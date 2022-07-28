package students.Inci;

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
    //1) Launch the web browser and open the site http://demo.guru99.com/test/delete_customer.php
//        Step 2) Enter Any Customer id.
//        Step 3) After entering the customer ID, Click on the “Submit” button.
//        Step 4) Reject/accept the alert.

    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/test/delete_customer.php");
    }
    @Test
    public void Tc1() throws InterruptedException {

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("123456");
        Thread.sleep(2000);
        driver.findElement(By.name("submit")).click();
        Alert alert = driver.switchTo().alert();
        String alertMessage = driver.switchTo().alert().getText();
        BrowserUtils.wait(3);
        alert.accept();
    }
    @AfterMethod
    public void close(){
        BrowserUtils.wait(3);
        driver.close();
    }

}
