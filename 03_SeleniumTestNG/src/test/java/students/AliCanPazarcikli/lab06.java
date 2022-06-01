package students.AliCanPazarcikli;

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
    /*go to http://demo.guru99.com/test/newtours/register.php
       click on country dropdown and select Barbados with Select Method
       Use 3 different Select Method (visible text,index,value)
       and switch to another countries as you wish
     */

   WebDriver driver;

    @BeforeMethod
    void setup(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demo.guru99.com/test/newtours/register.php");

    }
    @Test
    void dropDown() throws InterruptedException {
        WebElement DropDownBox=driver.findElement(By.xpath("//select[@name='country']"));
        DropDownBox.click();
        Select dropdown=new Select(DropDownBox);
        dropdown.selectByVisibleText("BARBADOS");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        Thread.sleep(2000);
        dropdown.selectByValue("DOMINICA");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        Thread.sleep(2000);
        dropdown.selectByIndex(10);
        System.out.println(dropdown.getFirstSelectedOption().getText());

    }
    @AfterMethod
    void endTest(){
        driver.quit();
    }
}
