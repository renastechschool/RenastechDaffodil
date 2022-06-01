package students.TaylanTonka;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomeWork6 {

    WebDriver driver;
    WebElement country;
    Select select;
    @BeforeClass
    public void setupDriver()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    @AfterClass
    public void tearDown()
    {

        driver.close();
    }

    @Test(priority = 1)
    public void goToURL()
    {
        driver.get("http://demo.guru99.com/test/newtours/register.php");
        System.out.println("Landing to Page");

    }
    @Test(priority = 2)
    public void handleWebElement()
    {
        country = driver.findElement(By.xpath("//select[@name='country']"));
    }

    @Test(priority = 3,dependsOnMethods = {"handleWebElement"} )
    public void selectBarbados() throws InterruptedException {
        select = new Select(country);
        select.selectByValue("BARBADOS");
        System.out.println("Barbados is selected");
        Thread.sleep(2000);
    }
    @Test(priority = 4,dependsOnMethods = {"handleWebElement","selectBarbados"} )
    public void selectMethods() throws InterruptedException {
        select.selectByIndex(0);
        System.out.println("First element is selected");
        Thread.sleep(2000);
        select.selectByVisibleText("TURKEY");
        System.out.println("Turkey is selected by visibleTextMethod");
        Thread.sleep(2000);
    }





}
