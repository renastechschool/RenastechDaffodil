package students.gule;

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
//1) Launch the web browser and open the site http://demo.guru99.com/test/delete_customer.php
//Step 2) Enter Any Customer id.
//Step 3) After entering the customer ID, Click on the “Submit” button.
//Step 4) Reject/accept the alert.
WebDriver driver;
    @BeforeMethod
    public void setup(){
        //go to http://demo.guru99.com/test/delete_customer.php
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/test/delete_customer.php");
    }

    @Test
    public void customerId(){

        driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("212121");
        driver.findElement(By.name("submit")).submit();

        Alert alert = driver.switchTo().alert();
        String alertMessage = driver.switchTo().alert().getText();
        System.out.println("Alert Message : "+ alertMessage);
        BrowserUtils.wait(3);
        alert.accept();
        //alert.dismiss();
    }

    @AfterMethod
    public void closing() {
        BrowserUtils.wait(3);
        driver.close();
    }

}
