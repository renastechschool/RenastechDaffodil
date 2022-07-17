package students.SanjayHR;

import code.utilities.BrowserUtils;
import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Lab05 {
    //Go to Amazon
    //enter Desk in search box
    //Then search for desks
    //(Use this task with TestNG framework)
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com/");
    }
    @Test
    public void TestCase1(){
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchBox.sendKeys("desks");
        WebElement searchButton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
        searchButton.click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }
    @AfterMethod
    public void closeDriver() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

}
