package students.Suleyman;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class lab006 {

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
    @Test
    public void TC2() throws InterruptedException {

        WebElement dropdownBox=driver.findElement(By.xpath("//select[@name='country']"));
        dropdownBox.click();

        Select country=new Select(dropdownBox);

        country.selectByVisibleText("BARBADOS");
        Thread.sleep(5000);
        country.selectByIndex(20);
        Thread.sleep(5000);
        country.selectByValue("TURKEY");


    }
}
