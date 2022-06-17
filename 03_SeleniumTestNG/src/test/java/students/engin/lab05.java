package students.engin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class lab05 {
 //Go to Amazon
//enter Desk in search box
//Then search for desks
// (Use this task with TestNG framework)
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        System.out.println("Chrome driver setup completed with 3 seconds implicitly wait");
    }
    @Test(dataProvider = "data-provider")
    public void TC1(String key){
        driver.get("https://www.amazon.com");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(key + Keys.ENTER);
    }
    @DataProvider(name = "data-provider")
    public Object[][] DataPool(){
        return new Object[][]{{"desk"},{"hat"},{"basketball"}};
    }
    @AfterMethod
    public void close(){
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
     //   driver.close();
        System.out.println("After 3 seconds implicitly wait driver closed");
    }


}
