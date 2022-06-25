package students.Ulzana;

import code.utilities.BrowserUtils;
import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class lab10   {

    private String username="mngr415257";
    private String password="ahYrery";
    protected WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void closing() throws InterruptedException {
        BrowserUtils.wait(3);
        driver.close();
    }

    @Test
    public void TestCase() {

        driver.get("http://demo.guru99.com/V4/");

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);

        JavascriptExecutor  jS= (JavascriptExecutor) driver;
        WebElement logButtom=driver.findElement(By.xpath("//input[@type='submit']"));
        jS.executeScript("arguments[0].click();", logButtom);

        String expected=driver.findElement(By.cssSelector("marquee.heading3")).getText();
        String actual="Welcome To Manager's Page of Guru99 Bank";
        Assert.assertEquals(expected,actual);


        String actualText=driver.findElement(By.xpath("//table/tbody/tr[3]/td")).getText();
        Assert.assertTrue(actualText.contains(username),"Username---Verification failed");

        String actualTitle=driver.getTitle();
        String expectedTitle="Guru99 Bank Manager HomePage";
        Assert.assertEquals(expectedTitle,actualTitle,"Title---Verification failed");

        String actualURL=driver.getCurrentUrl();
        Assert.assertTrue(actualURL.startsWith("https://demo.guru99.com/V4/manager/Managerhomepage"),
                "Url---Verification failed");
    }


}
