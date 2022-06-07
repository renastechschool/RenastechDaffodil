package students.AliCanPazarcikli;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Lab09 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
        System.out.println("Current window handle is: " + driver.getWindowHandle());
        driver.findElement(By.id("iframeResult"));
        driver.switchTo().frame("iframeResult");
        WebElement link = driver.findElement(By.linkText("Visit W3Schools.com!"));
        link.click();
        Set<String> allWindowHandles = driver.getWindowHandles();
        List<String> windowsList = new ArrayList<>(allWindowHandles);
        System.out.println("total windows number is : " + windowsList.size());

        driver.switchTo().window(windowsList.get(1));

        System.out.println("Current window handle is: " + driver.getWindowHandle());

        WebElement logo = driver.findElement(By.xpath("//i[@class='fa fa-logo']"));
        Assert.assertTrue(logo.isDisplayed(), "logo is not displayed.");

        driver.switchTo().window(windowsList.get(0));
        System.out.println("current window handle is :" + driver.getWindowHandle());

        WebElement runButton = driver.findElement(By.id("runbtn"));
        System.out.println(runButton.getText());
        Assert.assertFalse(runButton.getText().contains("Run >"), "it contains the 'Run >' text ");

    }
}