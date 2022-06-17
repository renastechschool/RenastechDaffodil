package students.Ozgur;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class lab06 {
    //go to http://demo.guru99.com/test/newtours/register.php
// click on country dropdown and select Barbados with Select Method
//Use 3 different Select Method (visible text,index,value)
//and switch to another countries as you wish

    WebDriver driver;

    @BeforeMethod
    public void lunch(){

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

        driver.get("http://demo.guru99.com/test/newtours/register.php");
    }

    @Test
    public void Test () throws InterruptedException {

        WebElement dropdown=driver.findElement(By.name("country"));
        dropdown.click();

        Select country=new Select(dropdown);
        country.selectByVisibleText("BARBADOS");
        Thread.sleep(2000);
        country.selectByIndex(3);
        Thread.sleep(1500);
        country.selectByValue("VIETNAM");
        Thread.sleep(1500);
        country.selectByVisibleText("ZAMBIA");


    }


}
