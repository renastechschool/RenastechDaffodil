package students.gule;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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
    public void lunch(){

        WebDriverManager.chromedriver().setup();

        driver=new ChromeDriver();

        driver.get("http://demo.guru99.com/test/delete_customer.php");
    }

    @Test
    public void Test() {
        WebElement searchBox = driver.findElement(By.xpath("//input[@name='cusid']"));
        searchBox.sendKeys("Selenium");
        driver.findElement(By.xpath("//input[@name='submit']")).click();
        Alert alert=driver.switchTo().alert();
        alert.accept();

    }

    @Test
    public void Test2(){

        driver.get("http://the-internet.herokuapp.com/hovers");
//move mouse to third image(you may use move to element method in actions)
//verify text of image present on the screen
        //div[@class='figure'][3]

        Actions act=new Actions(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);

        WebElement user3=driver.findElement(By.xpath("//div[@class='figure'][3]"));
        act.moveToElement(user3).perform();

        String expected="user3";
        String actual=driver.findElement(By.xpath("//div//div[3]//h5")).getText();
        Assert.assertTrue(actual.contains(expected));
        System.out.println("expected = " + expected);
        System.out.println("actual = " + actual);


    }

}
