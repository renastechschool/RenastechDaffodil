package students.Suleyman;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Task08 {

    /*
    1) Launch the web browser and open the site http://demo.guru99.com/test/delete_customer.php
    Step 2) Enter Any Customer id.
     Step 3) After entering the customer ID, Click on the “Submit” button.
      Step 4) Reject/accept the alert.
     */


    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/test/delete_customer.php");

        WebElement customerId=driver.findElement(By.xpath("//input[@type='text']"));
        customerId.sendKeys("Suleyman",Keys.ENTER);
        Thread.sleep(4000);
        Alert alert=driver.switchTo().alert();
        alert.accept();
        alert.dismiss();


    }
}
