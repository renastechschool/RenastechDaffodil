package students.Gulistan;

import code.utilities.BrowserUtils;
import code.utilities.WebDriverUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.sdk.autoconfigure.spi.ConfigProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class lab10 {
    //Prerequisites= Create username and password for guru99
    //navigate to http://demo.guru99.com/V4/
    //Login to Guru99 with username and password
    //Use JavaScript executer to click on login
    //Verify that you login to page
    WebDriver driver;
    @BeforeMethod
    public void setup() {
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/V4/");
    }
    @AfterMethod
    public void closing() throws InterruptedException {
        Thread.sleep(2000);
        //driver.close();
    }

    @Test(dataProvider = "Data")
    public void TC2(String username,String password) {
        WebElement userID = driver.findElement(By.name("uid"));
        userID.sendKeys(username);
        WebElement userPassword = driver.findElement(By.name("password"));
        userPassword.sendKeys(password);
        WebElement login = driver.findElement(By.name("btnLogin"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", login);

        String exceptedTitle ="Guru99 Bank Manager HomePage";
        String actualTitle =driver.getTitle();
        Assert.assertEquals(exceptedTitle,actualTitle);

    }
    @DataProvider(name = "Data")
    public static Object[][] userCredentials() {
        return new Object[][]{{"mngr414023","YhAjEbU"} };
    }
}
