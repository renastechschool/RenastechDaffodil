package students.SanjayHR;

import code.utilities.BrowserUtils;
import code.utilities.WebDriverUtil;
import com.github.javafaker.Faker;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Lab10 {
//    Prerequisites= Create username and password for guru99
//    navigate to http://demo.guru99.com/V4/
//    Login to Guru99 with username and password
//    Use JavaScript executer to click on login
//    Verify that you login to page
WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/V4/");
    }
    @Test
    public void TestCase1() throws InterruptedException {
        WebElement hereOption=driver.findElement(By.xpath("//a[.='here']"));
        hereOption.click();
        Thread.sleep(2000);
        WebElement emailID=driver.findElement(By.xpath("//input[@name='emailid']"));
        emailID.click();
        Thread.sleep(2000);
        Faker data=new Faker();
        emailID.sendKeys(data.internet().emailAddress());
        WebElement submit= driver.findElement(By.xpath("//input[@name='btnLogin']"));
        submit.click();
        Thread.sleep(2000);
        driver.navigate().back();
        driver.navigate().back();
        Thread.sleep(2000);
        WebElement userID=driver.findElement(By.xpath("//input[@type='text']"));
        userID.click();
        userID.sendKeys("mngr422073");
        WebElement passWord=driver.findElement(By.xpath("//input[@type='password']"));
        passWord.click();
        passWord.sendKeys("pAvyhEr");
        WebElement login=driver.findElement(By.xpath("//input[@type='submit']"));
        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", login);
        String expectedTitle="Guru99 Bank Manager HomePage";
        String actualTitle= driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }
    @AfterMethod
    public void closeDriver(){
        BrowserUtils.wait(2);
        //driver.quit();
    }
}
