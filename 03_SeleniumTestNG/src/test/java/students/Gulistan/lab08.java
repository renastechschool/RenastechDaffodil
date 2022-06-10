package students.Gulistan;

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
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/test/delete_customer.php");
    }
    @Test
    public void TC1() throws InterruptedException {
        WebElement customerId = driver.findElement(By.xpath("//input[@name = 'cusid']"));
        customerId.sendKeys("040404");
        driver.findElement(By.xpath("//input[@name='submit']")).click();
        driver.switchTo().alert().accept();
        driver.switchTo().alert().accept();
    }
    @AfterMethod
    public void closing() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }
    }

