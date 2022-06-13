package students.Gulistan;

import code.utilities.BrowserUtils;
import code.utilities.WebDriverUtil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class lab12 {
    //Navigate to "https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt"
//Click on the "Try it" button
//Enter Your name on the Alert Box and Accept alert
//Verify that your name shown on the page
//Click on the 'home sign' (it is on the left side of page)
//Switch to second window tab
//Click on the "log in" button
//Enter your credentials
//Enter the show password button
//Switch to first tab

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
    }
    @AfterMethod
    public void closing() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void Test() throws InterruptedException {
        driver.switchTo().frame("iframeResult");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4,2));
        WebElement tryButton = driver.findElement(By.xpath("//button[@onclick='myFunction()']"));
        wait.until(ExpectedConditions.visibilityOf(tryButton));
        tryButton.click();
        driver.switchTo().alert().sendKeys("Gulistan");
        driver.switchTo().alert().accept();
        BrowserUtils.wait(2);
        WebElement demo = driver.findElement(By.id("demo"));
        System.out.println(demo.getText());

        driver.switchTo().defaultContent();
        WebElement homePage = driver.findElement(By.xpath("//a[@id='tryhome']"));
        homePage.click();
        Set<String> windows = driver.getWindowHandles();
        List<String> windowList = new ArrayList<>(windows);
        driver.switchTo().window(windowList.get(1));

        WebElement login = driver.findElement(By.id("w3loginbtn"));
        login.click();


        WebElement email = driver.findElement(By.id("modalusername"));
        email.sendKeys("Bazit");
        WebElement password = driver.findElement(By.id("current-password"));
        password.sendKeys("040404");
        BrowserUtils.wait(2);
        driver.findElement(By.xpath("//span[@class = 'PasswordInput_show_pwd_btn__Ncc9S']")).click();
        BrowserUtils.wait(2);
        driver.switchTo().window(windowList.get(0));

    }

}
