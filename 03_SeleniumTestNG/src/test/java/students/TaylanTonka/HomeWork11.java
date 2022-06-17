package students.TaylanTonka;

import code.utilities.WebDriverUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class HomeWork11 {
    WebDriver driver;

    @BeforeMethod
    public void setupDriver()
    {
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }

    @Test(priority = 0)
    public void Task1()
    {
        driver.get("https://demo.guru99.com/test/delete_customer.php");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("1994");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        alert.accept();
    }

    @Test(priority = 1)
    public void Task2()
    {
        driver.get("http://the-internet.herokuapp.com/hovers");
        WebElement thirdImage = driver.findElement(By.xpath("(//div[@class='figure'])[3]"));
        Actions action = new Actions(driver);
        action.moveToElement(thirdImage).perform();
        Assert.assertTrue(driver.findElement(By.xpath("(//h5)[3]")).isDisplayed(),"text of image present on the screen for third image");

    }

}
