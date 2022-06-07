package students.Ulzana;

import code.utilities.BrowserUtils;
import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class lab8 {

    WebDriver driver;

    @BeforeMethod
    public void setup(){

//    1. Launch the web browser and open the site  http://demo.guru99.com/test/delete_customer.php
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/test/delete_customer.php");
    }

    @AfterMethod
    public void close(){
        driver.close();
    }

    @Test(priority = 1)
    public void TestCase_Accept(){
        WebElement customerID=driver.findElement(By.cssSelector("input[type='text']"));
        customerID.click();
        Faker fakeID=new Faker();

//    2. Enter Any Customer id.
        BrowserUtils.wait(3);
        customerID.sendKeys(fakeID.idNumber().valid());

//    3. after entering the customer ID, Click on the “Submit” button.
        WebElement submitButton=driver.findElement(By.xpath("//input[@type='submit']"));
        submitButton.click();

//    4. Reject/accept the alert.
        Alert alert=driver.switchTo().alert();
        alert.accept();
        alert.accept();
    }

    @Test (priority = 2, dependsOnMethods ="TestCase_Accept")
    public void TestCase_Dismiss() {
        driver.navigate().to("http://demo.guru99.com/test/delete_customer.php");
        WebElement customerID = driver.findElement(By.cssSelector("input[type='text']"));
        customerID.click();
        Faker fakeID = new Faker();

//    2. Enter Any Customer id.
        BrowserUtils.wait(3);
        customerID.sendKeys(fakeID.idNumber().valid());

//    3. after entering the customer ID, Click on the “Submit” button.
        driver.findElement(By.xpath("//input[@type='submit']")).click();

//    4. Reject/accept the alert.
        Alert alert = driver.switchTo().alert();
        BrowserUtils.wait(3);
        alert.dismiss();
    }
}
