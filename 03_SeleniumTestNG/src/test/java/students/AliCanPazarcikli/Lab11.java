package students.AliCanPazarcikli;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Lab11 {
      /* Launch the web browser and open the site http://demo.guru99.com/test/delete_customer.php
       Enter Any Customer id
       After entering the customer ID, Click on the “Submit” button.
       Reject/accept the alert.
    go to http://the-internet.herokuapp.com/hovers
    move mouse to third image(you may use move to element method in actions)
    verify text of image present on the screen

     */


    @Test(priority = 1)
    void customerLogin() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/delete_customer.php");
        WebElement cusId = driver.findElement(By.cssSelector("input[name='cusid']"));
        cusId.sendKeys("123456");
        driver.findElement(By.xpath("//input[@name='submit']")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        System.out.println(alert.getText());

    }

    @Test(priority = 2)
    void imgVerification() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/hovers");

        Actions a = new Actions(driver);
        WebElement move = driver.findElement(By.xpath("//div[@class='figure'][3]"));
        a.moveToElement(move).build().perform();
        System.out.println(move.getText());
        Assert.assertTrue(move.isDisplayed(), "text of image is not present");

    }
}