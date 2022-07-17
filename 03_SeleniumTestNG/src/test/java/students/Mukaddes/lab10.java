package students.Mukaddes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class lab10 {
   // Prerequisites= Create username and password for guru99
//navigate to http://demo.guru99.com/V4/
//Login to Guru99 with username and password
//Use JavaScript executer to click on login
//Verify that you login to page

    WebDriver driver;

    @Test
    public void TC1(){
     /*   WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/V4/");
       driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("elma");
      driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123Mu!123");
       WebElement login= driver.findElement(By.xpath("//input[@type='submit']"));



        //Use JavaScript executer to click on login
       JavascriptExecutor js=(JavascriptExecutor) driver;
        String script="arguments[0].click();";
      // driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("armut");
      // driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123Mu!124");
        js.executeScript(script,login);

        //Verify that you login to page
        String script2="return document.title;";// this script will return the page title
        String actualTitle= (String) js.executeScript(script2);
        String expectedTitle= "Guru99 Bank Manager HomePage";
        Assert.assertEquals(actualTitle,expectedTitle,"test passed");

        System.out.println(actualTitle);
        System.out.println(expectedTitle);

      */

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/V4/");

        // login credentials
        driver.findElement(By.cssSelector("input[name='uid']")).sendKeys("mngr414566");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("bypazyt");
        // login button
        WebElement login= driver.findElement(By.name("btnLogin"));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        //performing click on login button
        String script1="arguments[0].click();";// this is the syntax
        js.executeScript(script1,login);

        String script2="return document.title;";// this script will return the page title
        String actualTitle= (String) js.executeScript(script2);
        String expectedTitle="Guru99 Bank Manager HomePage";
        Assert.assertEquals(actualTitle,expectedTitle,"Title verification has passed..");
        System.out.println(actualTitle);
        System.out.println(expectedTitle);


    }

    }







