package students.engin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class lab06 {
//go to http://demo.guru99.com/test/newtours/register.php
// click on country dropdown and select Barbados with Select Method
//Use 3 different Select Method (visible text,index,value)
//and switch to another countries as you wish

    WebDriver driver;
    WebElement countryDropDown;
    Select selectSpesificCountry;

    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("setup OK");
    }
    @Test(priority = 1)
    public void TC1_findCountrydROPdOWN() throws InterruptedException {
        driver.get("http://demo.guru99.com/test/newtours/register.php");
        countryDropDown = driver.findElement(By.xpath("//select[@name='country']"));
//        System.out.println("find country dropdown OK");
//        Thread.sleep(2000);

    }
    @Test(priority = 2, dependsOnMethods = "TC1_findCountrydROPdOWN")
    public void TC2_findSpesicifCountry() throws InterruptedException {

        selectSpesificCountry = new Select(countryDropDown);
        Thread.sleep(2000);
        selectSpesificCountry.selectByValue("BARBADOS");
        System.out.println("Barbados selected");

        Thread.sleep(2000);
        selectSpesificCountry.selectByIndex(1);
        System.out.println("ALGERIA selected");

        Thread.sleep(2000);
        selectSpesificCountry.selectByVisibleText("CANADA");
        System.out.println("CANADA selected");


    }


}
