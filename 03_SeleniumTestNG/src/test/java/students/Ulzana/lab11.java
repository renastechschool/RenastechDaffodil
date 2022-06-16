package students.Ulzana;

import code.utilities.DriverUtil;
import code.utilities.WebDriverUtil;
import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class lab11 {
    WebDriver driver;

//    @Test
//    public void Task_1(){
//            driver.get("http://demo.guru99.com/test/delete_customer.php");
//
////Enter Any Customer id
//        Faker fakeID= new Faker();
//        String id=fakeID.idNumber().valid();
//        driver.findElement(By.name("cusid")).sendKeys(id);
//
////After entering the customer ID, Click on the “Submit” button.
//        driver.findElement(By.name("submit")).click();
//
////Reject/accept the alert.
//        Alert alert=driver.switchTo().alert();
//        alert.accept();
//        alert.accept();
//    }



    @Test
    public void Task_2() throws InterruptedException {
        driver.get("http://the-internet.herokuapp.com/hovers");

//move mouse to third image(you may use move to element method in actions)
        Actions actions = new Actions(driver);

        WebElement image3=driver.findElement(By.xpath("//div[@class=figure'][3]"));
        actions.moveToElement(image3).perform();

//verify text of image present on the screen
        String expected="name: user3";
        String actual=driver.findElement(By.xpath("//div[@class=figure'][3]")).getText();
        System.out.println(expected);
        System.out.println(actual);
        //Assert.assertEquals(expected,actual,"Verification failed");
    }



    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);    }

    @AfterClass
    public void close(){driver.quit();
    }

}
