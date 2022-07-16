package students.SanjayHR;

import code.utilities.BrowserUtils;
import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Lab06 {
    //go to http://demo.guru99.com/test/newtours/register.php
    // click on country dropdown and select Barbados with Select Method
    //Use 3 different Select Method (visible text,index,value)
    //and switch to another countries as you wish
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/test/newtours/register.php");
    }
    @Test
    public void TestCase1(){
        WebElement countryDropDown= driver.findElement(By.xpath("//select[@name='country']"));
        Select dropDown=new Select(countryDropDown);
        BrowserUtils.wait(2);
        dropDown.selectByVisibleText("BARBADOS");
        BrowserUtils.wait(2);
        dropDown.selectByValue("BARBADOS");
        BrowserUtils.wait(2);
        dropDown.selectByIndex(10);
    }
    @AfterMethod
    public void closeDriver(){
        BrowserUtils.wait(2);
        driver.quit();
    }
}
