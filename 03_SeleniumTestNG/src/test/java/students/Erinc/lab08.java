package students.Erinc;

import code.utilities.BrowserUtils;
import code.utilities.WebDriverUtil;
import com.github.javafaker.Faker;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class lab08 {

    //1) Launch the web browser and open the site http://demo.guru99.com/test/delete_customer.php
   // Step 2) Enter Any Customer id.
    //Step 3) After entering the customer ID, Click on the “Submit” button.
    // Step 4) Reject/accept the alert.

    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/test/delete_customer.php");
    }
    @Test
    public void TC1(){
        WebElement customerID= driver.findElement(By.name("cusid"));
        customerID.click();
        Faker faker=new Faker();
        customerID.sendKeys(faker.idNumber().valid());

        driver.findElement(By.xpath("//input[@value='Submit']")).click();
        Alert alert=driver.switchTo().alert();
        alert.accept();

    }



}
