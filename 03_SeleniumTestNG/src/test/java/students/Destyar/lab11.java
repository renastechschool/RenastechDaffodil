package students.Destyar;

import code.utilities.BrowserUtils;
import code.utilities.WebDriverUtil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class lab11 {

    //Launch the web browser and open the site http://demo.guru99.com/test/delete_customer.php
//Enter Any Customer id
//After entering the customer ID, Click on the “Submit” button.
//Reject/accept the alert.


   //Task 2:

//go to http://the-internet.herokuapp.com/hovers
//move mouse to third image(you may use move to element method in actions)
//verify text of image present on the screen

    WebDriver driver;

    @BeforeMethod
    public void Browser(){

        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/test/delete_customer.php");

    }
    @Test
    public void TC1(){
        WebElement ID= driver.findElement(By.cssSelector("input[name='cusid']"));
        ID.sendKeys("7384");
        WebElement SubmitButton= driver.findElement(By.cssSelector("input[name='submit']"));
        SubmitButton.click();
        Alert alert = driver.switchTo().alert();
        BrowserUtils.wait(3);
        alert.accept();
    }
    @Test
    public void TC2(){
        driver.get("http://the-internet.herokuapp.com/hovers");
        WebElement ThirdPic= driver.findElement(By.xpath("//div[@class='figure'][3]"));
       Actions act=new Actions(driver);
       act.moveToElement(ThirdPic).perform();
       Assert.assertTrue(driver.findElement(By.xpath("(//h5)[3]")).isDisplayed(),"Text text of image present on the screen");
    }
}
