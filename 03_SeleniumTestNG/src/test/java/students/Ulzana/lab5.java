package students.Ulzana;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class lab5 {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        System.out.println("****  before method executed   ****");

    }

    @Test
    public void TestCase1(){
        System.out.println("****  TestCase  ****");
        driver.get("https://www.amazon.ca/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Deck"+ Keys.ENTER);


        Assert.assertEquals(driver.getTitle(),"Amazon.ca : Deck","Verification Failed");
        Assert.assertTrue(driver.getCurrentUrl().contains("amazon"),"Verification failed");

    }



    @AfterMethod
    public void closeDriver(){
        System.out.println("****  After method executed   ****   Chrome closed   ****  ");
        driver.quit();
    }
}
