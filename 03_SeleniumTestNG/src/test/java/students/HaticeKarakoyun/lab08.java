package students.HaticeKarakoyun;

import code.utilities.BrowserUtils;
import code.utilities.WebDriverUtil;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
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
    public void setUp(){
        //Step 1) Launch the web browser and open the site http://demo.guru99.com/test/delete_customer.php
        driver= WebDriverUtil.getDriver("chrome") ;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/test/delete_customer.php");
    }
    @Test
    public void TC1_Lab08(){
        //Step 2) Enter Any Customer id.
        driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("Ronya123");
        BrowserUtils.wait(3);
        //Step 3) After entering the customer ID, Click on the “Submit” button.
        driver.findElement(By.cssSelector("input[name='submit']")).click();
        BrowserUtils.wait(3);
        //Step 4) Reject/accept the alert.
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();

    }

    @AfterMethod
    public void teardown(){
        BrowserUtils.wait(3);
        driver.quit();
    }




}
