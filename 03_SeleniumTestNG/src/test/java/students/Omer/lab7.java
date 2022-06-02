package students.Omer;

import code.utilities.BrowserUtils;
import code.utilities.WebDriverUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class lab7 {
    //go to http://demo.guru99.com/test/newtours/register.php
    // click on country dropdown and select Barbados with Select Method
    //Use 3 different Select Method (visible text,index,value)
    //and switch to another countries as you wish

    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/test/newtours/register.php");


    }

    @Test
    public void TC1() throws InterruptedException {
        WebElement country = driver.findElement(By.xpath("//select[@name='country']"));
        country.click();
        BrowserUtils.wait(3);
        Select options = new Select(country);
        options.selectByVisibleText("TURKEY");
        System.out.println("Selected Turkey");
        Thread.sleep(3000);
        options.selectByIndex(76);
        options.selectByValue("CANADA");
    }



}
