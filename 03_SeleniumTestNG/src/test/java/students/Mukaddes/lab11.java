package students.Mukaddes;


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

public class lab11 {
    //Launch the web browser and open the site http://demo.guru99.com/test/delete_customer.php
//Enter Any Customer id
//After entering the customer ID, Click on the “Submit” button.
//Reject/accept the alert.


   // Task 2:
//go to http://the-internet.herokuapp.com/hovers
//move mouse to third image(you may use move to element method in actions)
//verify text of image present on the screen

   @Test (priority = 1)
    public void TC1() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/test/delete_customer.php");

        //Enter Any Customer id
        driver.findElement(By.name("cusid")).sendKeys("apple");

        //After entering the customer ID, Click on the “Submit” button.
        driver.findElement(By.name("submit")).click();

        //Reject/accept the alert.
        Thread.sleep(4000);
        Alert alert=driver.switchTo().alert();
        alert.accept();
    }
    // Task 2:
//go to http://the-internet.herokuapp.com/hovers
//move mouse to third image(you may use move to element method in actions)
//verify text of image present on the screen

    @Test (priority = 2)
    public void TC2(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/hovers");

        //move mouse to third image(you may use move to element method in actions)
        Actions action=new Actions(driver);
        WebElement move=driver.findElement(By.xpath("//div[@class='figure'][3]"));
        action.moveToElement(move).build().perform();

        //verify text of image present on the screen
        System.out.println(move.getText());
        Assert.assertTrue(move.isDisplayed(),"text of image not present on the screen");

    }

    }

