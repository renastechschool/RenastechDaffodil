package students.Suleyman;

import code.utilities.BrowserUtils;
import code.utilities.WebDriverUtil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class lab07 {


    //
//    1) Launch the web browser and open the site http://demo.guru99.com/test/delete_customer.php
//    Step 2) Enter Any Customer id.
//    Step 3) After entering the customer ID, Click on the “Submit” button.
//            Step 4) Reject/accept the alert.

    WebDriver driver;
    @BeforeMethod
    public void setup(){

        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/test/delete_customer.php");
    }

    @Test
    public void TC1(){

        driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("Suleyman");
        WebElement submit=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]"));
        submit.click();
        Alert alert=driver.switchTo().alert();

        BrowserUtils.wait(4);
        alert.accept();
        BrowserUtils.wait(4);
        alert.dismiss();


    }
}
