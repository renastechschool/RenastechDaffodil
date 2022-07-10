package students.Destyar;

//Go to Amazon
//enter Desk in search box
//Then search for desks
//(Use this task with TestNG framework)

import code.utilities.WebDriverUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class lab05 {

    WebDriver driver;
    @BeforeMethod
    public void setup() {

        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
    }
    @AfterMethod
    public void Wait (){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
    @Test
    public void Search(){
        driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("Desk");
        driver.findElement(By.id("nav-search-submit-button")).click();

    }


}
