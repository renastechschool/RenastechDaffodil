package students.Yousef;

import code.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class lab_06 {
    //1) Launch the web browser and open the site http://demo.guru99.com/test/delete_customer.php
   // Step 2) Enter Any Customer id.
    //Step 3) After entering the customer ID, Click on the “Submit” button.
          //  Step 4) Reject/accept the alert.

    WebDriver driver;
    @AfterMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        BrowserUtils.wait(4);
        driver.get("http://demo.guru99.com/test/delete_customer.php");
    }
    @Test
    public void TC1_Customer(){

        WebElement  customerID =driver.findElement(By.name("cusid"));
        BrowserUtils.wait(3);
        customerID.sendKeys("5432");


    }
}
