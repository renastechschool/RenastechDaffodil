package students.HaticeKarakoyun;

import code.utilities.WebDriverUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class lab05 {

    //Go to Amazon
    //enter Desk in search box
    // Then search for desks
    //(Use this task with TestNG framework)

    WebDriver driver;
    @BeforeMethod
    public void setUp(){

    }
    @Test
    public void TC1_searchForDesk(){
        WebDriverManager.chromedriver().setup();
        driver= WebDriverUtil.getDriver("chrome");
        driver.get("https://www.amazon.com");

        WebElement searchBox= driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("desk");
        WebElement searchButton= driver.findElement(By.xpath("//input[@value='Go']"));
        searchButton.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String expectedUrlContains="desk";
        String actualUrl=driver.getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(expectedUrlContains));
    }


    }

