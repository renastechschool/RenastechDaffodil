package students.Erinc;

import code.base.TestBase2;
import code.utilities.BrowserUtils;
import code.utilities.DriverUtil;
import com.github.javafaker.Faker;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class lab11 extends TestBase2 {

    //Launch the web browser and open the site http://demo.guru99.com/test/delete_customer.php
//Enter Any Customer id
//After entering the customer ID, Click on the “Submit” button.
//Reject/accept the alert.

   // Task 2:

//go to http://the-internet.herokuapp.com/hovers
//move mouse to third image(you may use move to element method in actions)
//verify text of image present on the screen
Actions actions;
    @Test
    public void AlertHandling(){
        DriverUtil.getDriver().get("http://demo.guru99.com/test/delete_customer.php");
        Faker faker=new Faker();
        DriverUtil.getDriver().findElement(By.xpath("//input[@name='cusid']")).sendKeys(faker.idNumber().valid().replaceAll("-",""));
        BrowserUtils.wait(3);
        DriverUtil.getDriver().findElement(By.xpath("//input[@value='Submit']")).click();
        BrowserUtils.wait(3);
        Alert alert=DriverUtil.getDriver().switchTo().alert();
        alert.accept();
    }

    @Test
    public void ImageVerification(){
        DriverUtil.getDriver().get("http://the-internet.herokuapp.com/hovers");
        actions=new Actions(DriverUtil.getDriver());
        actions.moveToElement(DriverUtil.getDriver().findElement(By.xpath("//*[@id=\"content\"]/div/div[3]/img"))).perform();
        WebElement image=DriverUtil.getDriver().findElement(By.xpath("//*[@id=\"content\"]/div/div[3]/img"));
        Assert.assertTrue(image.isDisplayed());


    }








}
