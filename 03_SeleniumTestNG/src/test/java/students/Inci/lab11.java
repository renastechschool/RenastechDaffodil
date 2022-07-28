package students.Inci;

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


    //Task 2:

//go to http://the-internet.herokuapp.com/hovers
//move mouse to third image(you may use move to element method in actions)
//verify text of image present on the screen
@Test
public void TC1(){
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("http://demo.guru99.com/test/delete_customer.php");
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("36446373");
    driver.findElement(By.xpath("//input[@type='submit']")).click();
    Alert alert=driver.switchTo().alert();
    alert.accept();

}
    //go to http://the-internet.herokuapp.com/hovers
//move mouse to third image(you may use move to element method in actions)
//verify text of image present on the screen
    @Test
    public void TC2(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("http://the-internet.herokuapp.com/hovers");

        Actions act=new Actions(driver);
        WebElement move = driver.findElement(By.xpath("//div[@class='figure'][3]"));
        act.moveToElement(move).build().perform();
        System.out.println(move.getText());
        Assert.assertTrue(move.isDisplayed(),"text of image not present on the screen");


    }


}
