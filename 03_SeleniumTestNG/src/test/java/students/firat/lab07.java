package students.firat;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class lab07 {

//    1) Launch the web browser and open the site http://demo.guru99.com/test/delete_customer.php
////    Step 2) Enter Any Customer id.
////    Step 3) After entering the customer ID, Click on the “Submit” button.
////     Step 4) Reject/accept the alert.


    @Test
    public void sumbit() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/delete_customer.php");
        Faker faker = new Faker();
        WebElement id =driver.findElement(By.cssSelector("input[type='text']"));
        id.sendKeys(faker.idNumber().valid().replaceAll("-",""));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//form[@action='delete_customer.php']/table/tbody/tr[3]/td[2]/input[1]")).click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        alert.accept();




    }






}
