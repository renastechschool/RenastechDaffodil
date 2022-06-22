package students.Gulistan;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class lab09 {

    WebDriver driver;
    @BeforeMethod
    public void setup() {
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @AfterMethod
    public void closing() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }
    @Test
    public void getWindows() throws InterruptedException {
        driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
        System.out.println(driver.getWindowHandle());
        driver.findElement(By.xpath("//a[@href='https://www.w3schools.com']")).click();

        Set<String>  windows = driver.getWindowHandles();
        List<String> listWindows = new ArrayList<>(windows);

        System.out.println(windows.size());

        driver.switchTo().window(listWindows.get(1));
        System.out.println(driver.getWindowHandle());

        Assert.assertTrue(driver.findElement(By.xpath("//i[@class='fa fa-logo']")).isDisplayed());
        driver.switchTo().window(listWindows.get(0));

        System.out.println(driver.getTitle());
        System.out.println(driver.getWindowHandle());

        Assert.assertTrue(driver.findElement(By.id("runbtn")).getText().contains("Run ❯"));
    }
}