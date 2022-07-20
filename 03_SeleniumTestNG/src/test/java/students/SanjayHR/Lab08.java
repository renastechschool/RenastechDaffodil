package students.SanjayHR;

import code.utilities.BrowserUtils;
import code.utilities.WebDriverUtil;
import com.github.javafaker.Faker;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Lab08 {
    /*1) Launch the web browser and open the site http://demo.guru99.com/test/delete_customer.php
    Step 2) Enter Any Customer id.
    Step 3) After entering the customer ID, Click on the “Submit” button.
    Step 4) Reject/accept the alert.
    */
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/test/delete_customer.php");
    }
    @Test
    public void TestCase1(){
        WebElement customerID=driver.findElement(By.xpath("//input[@name='cusid']"));
        BrowserUtils.wait(2);
        customerID.click();
        Faker generatedData=new Faker();
        customerID.sendKeys(generatedData.idNumber().valid());
        WebElement submit=driver.findElement(By.xpath("//input[@type='submit']"));
        submit.click();
        BrowserUtils.wait(1);
        Alert alert=driver.switchTo().alert();
        alert.accept();
        BrowserUtils.wait(2);
        alert.dismiss();
    }
    @AfterMethod
    public void closeDriver(){
        BrowserUtils.wait(2);
        driver.quit();
    }
}
