package students.engin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class lab08 {
    /*
    1) Launch the web browser and open the site http://demo.guru99.com/test/delete_customer.php
Step 2) Enter Any Customer id.
Step 3) After entering the customer ID, Click on the “Submit” button.
Step 4) Reject/accept the alert.
     */

    WebDriver driver;

    @Test
    public void TC1() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.get("http://demo.guru99.com/test/delete_customer.php");
        driver.findElement(By.name("cusid")).sendKeys("aaa");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='submit']")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println("alert.getText() = " + alert.getText());
        Thread.sleep(2000);
        alert.accept();
        Alert alert1 = driver.switchTo().alert();
        Assert.assertEquals("Customer Successfully Delete!", alert.getText());
        Thread.sleep(2000);
        alert1.accept();
        driver.close();

    }

}
