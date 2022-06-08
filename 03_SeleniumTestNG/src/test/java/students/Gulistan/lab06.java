package students.Gulistan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import code.utilities.WebDriverUtil;

import java.util.concurrent.TimeUnit;

public class lab06 {
    //go to http://demo.guru99.com/test/newtours/register.php
// click on country dropdown and select Barbados with Select Method
//Use 3 different Select Method (visible text,index,value)


    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/test/newtours/register.php");
    }
    @Test
    public void TC1() throws InterruptedException {
        WebElement country = driver.findElement(By.xpath("//select[@name='country']"));
        country.click();
        Select dropDown = new Select(country);
        dropDown.selectByVisibleText("BARBADOS");
        Thread.sleep(1000);
        dropDown.selectByIndex(19);
        Thread.sleep(1000);
        dropDown.selectByValue("BARBADOS");
        Thread.sleep(1000);

        //and switch to another countries as you wish
        dropDown.selectByVisibleText("ARMENIA");
        Thread.sleep(1000);
        dropDown.selectByIndex(9);
        Thread.sleep(1000);
        dropDown.selectByValue("ARMENIA");
        Thread.sleep(1000);

    }
    @AfterMethod
    public void closing() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }
    }


