package students.gule;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class lab05 {
//Go to Amazon
//enter Desk in search box
//Then search for desks
//(Use this task with TestNG framework)
    WebDriver driver;

    @Test(priority = 1)
    public void setUp() {
        //go to google
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com");
    }
    @Test(priority = 2)
    public void search(){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Desk");
        driver.findElement(By.id("nav-search-submit-button")).click();
    }
}
