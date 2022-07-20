package students.Mukaddes;

import code.utilities.WebDriverUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class lab06 {
    //go to http://demo.guru99.com/test/newtours/register.php
// click on country dropdown and select Barbados with Select Method
//Use 3 different Select Method (visible text,index,value)
//and switch to another countries as you wish

    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/test/newtours/register.php");
    }
    @AfterMethod
    public void closing() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void TC1() throws InterruptedException {
        // click on country dropdown and select Barbados with Select Method
        WebElement country= driver.findElement(By.xpath("//select[@name='country']"));
        country.click();
        Select dropdown=new Select(country);
        dropdown.selectByVisibleText("BARBADOS");

        //Use 3 different Select Method (visible text,index,value)
        Thread.sleep(2000);
        dropdown.selectByValue("BARBADOS");
        Thread.sleep(2000);
        dropdown.selectByIndex(19);

        //and switch to another countries as you wish
        Thread.sleep(2000);
        dropdown.selectByIndex(3);
        Thread.sleep(2000);
        dropdown.selectByVisibleText("AUSTRIA");
    }

}

