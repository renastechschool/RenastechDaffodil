package students.gulsum;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

//go to http://demo.guru99.com/test/newtours/register.php
// click on country dropdown and select Barbados with Select Method
//Use 3 different Select Method (visible text,index,value)
//and switch to another countries as you wish
public class lab06 {
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        //go to http://demo.guru99.com/test/newtours/register.php
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/test/newtours/register.php");

    }

    // click on country dropdown and select Barbados with Select Method
    //Use 3 different Select Method (visible text,index,value)
    @Test
    public void TC1() throws InterruptedException {
        WebElement country=driver.findElement(By.xpath("//select[@name='country']"));
        country.click();
        Select dropdown=new Select(country);
        Thread.sleep(2000);
        dropdown.selectByVisibleText("BARBADOS");
        Thread.sleep(2000);
        dropdown.selectByIndex(19);
        Thread.sleep(2000);
        dropdown.selectByValue("BARBADOS");

        //and switch to another countries as you wish

        Thread.sleep(2000);
        dropdown.selectByVisibleText("ARGENTINA");
        Thread.sleep(2000);
        dropdown.selectByIndex(8);
        Thread.sleep(2000);
        dropdown.selectByValue("ARGENTINA");


    }
    @AfterMethod
    public void closing() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();

    }
}
