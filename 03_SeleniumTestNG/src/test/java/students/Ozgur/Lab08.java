package students.Ozgur;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Lab08 {
//    1) Launch the web browser and open the site http://demo.guru99.com/test/delete_customer.php
//    Step 2) Enter Any Customer id.
//    Step 3) After entering the customer ID, Click on the “Submit” button.
//            Step 4) Reject/accept the alert.
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
    searchBox.sendKeys("oscar");
    driver.findElement(By.xpath("//input[@name='submit']")).click();
     Alert alert=driver.switchTo().alert();
     alert.accept();
     alert.accept();

}
}
