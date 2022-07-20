package students.Suleyman;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task10 {

    /*
    Prerequisites= Create username and password for guru99
     //navigate to http://demo.guru99.com/V4/
     //Login to Guru99 with username and password
      //Use JavaScript executer to click on login
      //Verify that you login to page
     */


    @Test
    public void TC1(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/V4/");

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Suleyman");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("yildiz");
       WebElement login= driver.findElement(By.xpath("//input[@type='submit']"));

        JavascriptExecutor java=(JavascriptExecutor) driver;
        String script="arguments[0].click();";
        java.executeScript(script,login);

        String script2="return document.title;";
        String actualTitle= (String) java.executeScript(script2);
        String expectedTitle="Guru99 Bank Manager HomePage";
        Assert.assertEquals(actualTitle,expectedTitle,"Title verification has passed..");
        System.out.println(actualTitle);
        System.out.println(expectedTitle);

    }
}
