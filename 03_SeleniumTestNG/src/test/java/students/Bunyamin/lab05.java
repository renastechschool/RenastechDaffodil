package students.Bunyamin;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class lab05 {
    //Go to Amazon
    //enter Desk in search box
    //Then search for desks
    //Use this task with TestNG framework

    @Test(priority = 1)
    void setup(){
        WebDriver driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.amazon.ca/");
        driver.close();
    }
    @Test(priority = 2)
    void search(){
        WebDriver driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.ca/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Desk");
        driver.findElement(By.id("nav-search-submit-button")).click();

    }
}
