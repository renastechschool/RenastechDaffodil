package students.Destyar;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
        //go to http://demo.guru99.com/test/newtours/register.php
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/test/newtours/register.php");

    }
    @Test
    public void TC1() throws InterruptedException {
        // click on country dropdown and select Barbados with Select Method
        WebElement DropDownBox=driver.findElement(By.xpath("//select[@name='country']"));
        DropDownBox.click();
        Select Dropdown=new Select(DropDownBox);
        Thread.sleep(2000);
        Dropdown.selectByVisibleText("BARBADOS");
        Thread.sleep(2000);
        System.out.println("country selected is Barbados");

        //Use 3 different Select Method (visible text,index,value)
        // and switch to another countries as you wish
       Dropdown.selectByValue("CANADA");
        Thread.sleep(2000);
       Dropdown.selectByIndex(20);
       Thread.sleep(2000);
       Dropdown.selectByVisibleText("BOLIVIA");

    }
    @AfterMethod
    public void closing() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();

    }

}
