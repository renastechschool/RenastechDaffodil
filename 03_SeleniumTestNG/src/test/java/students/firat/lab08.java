package students.firat;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class lab08 {
//    1) Launch the web browser and open the site http://demo.guru99.com/test/delete_customer.php
//    Step 2) Enter Any Customer id.
//    Step 3) After entering the customer ID, Click on the “Submit” button.
//            Step 4) Reject/accept the alert.

    @Test
    public void TC1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
        driver.get("http://demo.guru99.com/test/delete_customer.php");
        WebElement customerId = driver.findElement(By.name("cusid"));
        customerId.sendKeys("BESIKTAS");
        WebElement submitButton = driver.findElement(By.name("submit"));
        submitButton.click();
        driver.switchTo().alert().accept();




    }





}
