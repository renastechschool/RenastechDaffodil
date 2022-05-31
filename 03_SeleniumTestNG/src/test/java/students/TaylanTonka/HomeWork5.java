package students.TaylanTonka;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class HomeWork5 {
    WebDriver driver;

    @BeforeClass
    public void setupDriver()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Driver is created");

    }

    @Test(priority = 1)
    public void goToAmazon()
    {
        driver.get("https://www.amazon.ca/");
        String expectedTitle = "Amazon.ca: Low Prices – Fast Shipping – Millions of Items";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
        System.out.println("Landing to Amazon.ca");
    }
    @Test(priority = 2,dataProvider ="data-provider" )
    public void searchDesk(String key)
    {
        System.out.println(key+" is searching on Amazon");
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(key);
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();


    }

    @Test(priority = 3,enabled = false)
    public void testInProgress()
    {
        System.out.println("This test is not ready");
    }

    @Test(dependsOnMethods = {"searchDesk"})
    public void dependsMethod()
    {
        System.out.println("Search Desk is successfully tested");
    }




    @AfterClass
    public void tearDown()
    {
        driver.close();
        System.out.println("Driver is closed");
    }
    @DataProvider(name = "data-provider")
    public Object[][] dpMethod()
    {
        return new Object[][]{{"desk"}};
    }





}
