package students.Gulistan;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
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
    public void setup(){
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/test/delete_customer.php");

    }
    @AfterMethod
    public void closing() throws InterruptedException {
        Thread.sleep(2000);
    }

    @Test()
    public void Test() throws InterruptedException {
        WebElement customerID = driver.findElement(By.name("cusid"));
        customerID.sendKeys("tester");
        WebElement submitButton = driver.findElement(By.name("submit"));
        submitButton.click();
        driver.switchTo().alert().dismiss();

        driver.get("http://the-internet.herokuapp.com/hovers");
        WebElement target   = driver.findElement(By.xpath("//div[@class='figure'][3]"));
        Actions    action   = new Actions(driver);
        action.moveToElement(target).perform();

        System.out.println(target.getText());
    }

}
