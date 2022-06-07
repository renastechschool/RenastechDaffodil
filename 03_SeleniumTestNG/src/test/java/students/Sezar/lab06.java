package students.Sezar;

import code.utilities.BrowserUtils;
import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class lab06 {
    // go to http://demo.guru99.com/test/newtours/register.php
    // click on country dropdown and select Barbados with Select Method
    // Use 3 different Select Method (visible text,index,value)
    // and switch to another countries as you wish
    WebDriver driver;

    @BeforeClass
    public void beforeClass(){

        System.out.println("Test is starting");
    }

    @BeforeMethod
    public void setUp() throws InterruptedException {
        // go to http://demo.guru99.com/test/newtours/register.php
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/test/newtours/register.php");
    }
    // Use 3 different Select Method (visible text,index,value)
    // and switch to another countries as you wish
    @Test
    public void TC1_guru99_Dropdown() throws InterruptedException {

        System.out.println("TC1 is running");
        // click on country dropdown and select Barbados with Select Method
        driver.findElement(By.xpath("//select[@name='country']")).click();
        WebElement DropDownBox=driver.findElement(By.name("country"));
        // Use 3 different Select Method (visible text,index,value)
        Thread.sleep(2000);
        Select dropdown=new Select(DropDownBox);
        dropdown.selectByVisibleText("BARBADOS");
        dropdown.selectByIndex(19);
        dropdown.selectByValue("BARBADOS");
        // and switch to another countries as you wish
        Thread.sleep(3000);
        dropdown.selectByVisibleText("CANADA");

    }
    @AfterMethod
    public void closing () {
        System.out.println("The test is has completed");
    }

}