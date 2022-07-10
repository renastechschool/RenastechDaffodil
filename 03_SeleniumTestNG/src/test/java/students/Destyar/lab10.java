package students.Destyar;

import code.utilities.BrowserUtils;
import code.utilities.SmartBearUtils;
import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class lab10 {

    // Prerequisites= Create username and password for guru99
//navigate to http://demo.guru99.com/V4/
//Login to Guru99 with username and password
//Use JavaScript executer to click on login
//Verify that you login to page

    WebDriver driver;


    @BeforeMethod
    public void setup() {
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.navigate().to("http://demo.guru99.com/V4/");
        //BrowserUtils.wait(2);

    }

    @Test(dataProvider = "TestData")
    public void TC1LoginTest(String username, String password) {
        LoginForGuru99(driver, username, password);

    }

    @DataProvider(name = "TestData")
    public static Object[][] LoginCredentials() {
        return new Object[][]{
                {"mngr414242", "vyvevyr"}
        };
    }

    public static void LoginForGuru99(WebDriver driver, String username, String password) {

        WebElement UserName = driver.findElement(By.cssSelector(" input[name='uid']"));
        UserName.sendKeys(username);

        WebElement PassWord = driver.findElement(By.cssSelector("input[name='password']"));
        PassWord.sendKeys(password);

        WebElement Login = driver.findElement(By.cssSelector("input[name='btnLogin']"));
        JavascriptExecutor Js = (JavascriptExecutor) driver;
        Js.executeScript("arguments[0].click();", Login);

        String verify=driver.findElement(By.xpath("//marquee[@behavior='alternate']")).getText();
        String expected="Welcome To Manager's Page of Guru99 Bank";

        Assert.assertTrue(verify.equals(expected),"failed");


    }

    @AfterMethod
    public void closingMethod() {
        BrowserUtils.wait(5);
        driver.close();
    }
}


