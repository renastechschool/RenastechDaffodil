package students.HaticeKarakoyun;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
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
        public void setUp(){
            //go to http://demo.guru99.com/test/newtours/register.php
            driver= WebDriverUtil.getDriver("chrome");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("http://demo.guru99.com/test/newtours/register.php");
        }

        @Test
                public void TC1() throws InterruptedException {
            // click on country dropdown and select Barbados with Select Method
            WebElement DropDownBox=driver.findElement(By.xpath("//select[@name='country']"));
            DropDownBox.click();
            Select dropdown=new Select(DropDownBox);
            dropdown.selectByVisibleText("BARBADOS");
            System.out.println(dropdown.getFirstSelectedOption().getText());
            Thread.sleep(3000);
            dropdown.selectByValue("SWITZERLAND");
            System.out.println(dropdown.getFirstSelectedOption().getText());
            Thread.sleep(3000);
            dropdown.selectByIndex(10);
            System.out.println(dropdown.getFirstSelectedOption().getText());
        }

        @AfterTest

        public void closing() throws InterruptedException {
            Thread.sleep(3000);
            driver.quit();
        }
}
