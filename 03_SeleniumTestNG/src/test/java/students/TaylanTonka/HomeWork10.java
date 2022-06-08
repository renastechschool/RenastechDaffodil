package students.TaylanTonka;

import code.utilities.BrowserUtils;
import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HomeWork10 {
    WebDriver driver;


    @BeforeClass
    public void setup()
    {
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
    }

    @AfterClass
    public void teardown()
    {
        BrowserUtils.wait(1);
        driver.quit();
    }

    @Test(priority = 1)
    public void goToURL()
    {
        driver.get("https://demo.guru99.com/V4/");
    }

    @Test(dataProvider = "credentials",priority = 2,dependsOnMethods = "goToURL")
    public void inputCredentials(String username,String passwd)
    {
        WebElement UserID = driver.findElement(By.xpath("//input[@name='uid']"));
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        WebElement loginButton = driver.findElement(By.xpath("//input[@name='btnLogin']"));
        UserID.sendKeys(username);
        password.sendKeys(passwd);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        BrowserUtils.wait(1);
        js.executeScript("arguments[0].click();", loginButton);


    }
    @Test(priority = 3,dependsOnMethods = "inputCredentials")
    public void verifySuccessfullyLogin()
    {
        String expectedTitle = "Guru99 Bank Manager HomePage";
        System.out.println(driver.getTitle());
        Assert.assertEquals(expectedTitle,driver.getTitle(),"It couldn't login successfully");
    }

    @DataProvider(name = "credentials")
    public Object[][] credentials()
    {
        return new Object[][] {{"mngr414023","YhAjEbU"}};
    }





}
