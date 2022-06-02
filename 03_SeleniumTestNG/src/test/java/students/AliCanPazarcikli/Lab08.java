package students.AliCanPazarcikli;

import code.utilities.BrowserUtils;
import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Lab08 {
    WebDriver driver;
    @BeforeMethod
    void setUp() {
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/test/delete_customer.php ");
    }
    @Test
    void TC_AlertHandling() {
        driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("ali123");
        BrowserUtils.wait(2);
        driver.findElement(By.cssSelector("input[name='submit']")).click();
        BrowserUtils.wait(4);
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();

    }
    @AfterMethod
    public void teardown(){
        BrowserUtils.wait(2);
        driver.quit();
    }


}
