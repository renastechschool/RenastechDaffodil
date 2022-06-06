package students.Sezar;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class lab05 {
    //Go to Amazon
    //enter Desk in search box
    //Then search for desks
    // (Use this task with TestNG framework)
    WebDriver driver;

    @BeforeMethod
    public void setUp() throws InterruptedException {
        //Go to Amazon
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com/");
    }
       @Test
       public void TC1_GoToAmazonAndSearchForDesk() throws InterruptedException {
           System.out.println("TC1 is running");
           //enter Desk in search box
           //Then search for desks
           driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("desks");
           driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
           Thread.sleep(2000);
       }
           @AfterMethod
           public void closing() {

               driver.quit();
           }}