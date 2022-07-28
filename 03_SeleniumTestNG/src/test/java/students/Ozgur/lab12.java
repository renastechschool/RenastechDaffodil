package students.Ozgur;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
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

public class lab12 {

    WebDriver driver;
    String expectedText;
    String actualTitle;
    String parentPage;
    String childPage;

    @BeforeClass
    public void lunch() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
        driver.manage().window().maximize();
    }


    @Test(priority = 0)
    public void switchToFrame() {
        driver.switchTo().frame(1);
    }

    @Test(priority = 1,dependsOnMethods ="switchToFrame")
    public void clickTryIt() {

        driver.findElement(By.xpath("//button[text()='Try it']")).click();
    }

    @Test(priority = 2,dependsOnMethods = "clickTryIt")
    public void handleAlert() {

        Alert alert = driver.switchTo().alert();
        expectedText = "eagles";
        alert.sendKeys(expectedText);
        alert.accept();
    }


    @Test(priority = 3,dependsOnMethods = "handleAlert")
    public void verify() {
        actualTitle = driver.findElement(By.id("demo")).getText();
        System.out.println(actualTitle);
        System.out.println(expectedText);
        Assert.assertTrue(actualTitle.contains(expectedText));
    }


    @Test(priority = 4,dependsOnMethods = "verify")
    public void switchBack() {

        driver.switchTo().defaultContent();
    }

    @Test(priority = 5,dependsOnMethods = "switchBack")
    public void clickHome() {
        driver.findElement(By.id("tryhome")).click();
    }


    @Test(priority = 6,dependsOnMethods = "clickHome")
    public void switchWindows() {
        Set<String> windowHandle = driver.getWindowHandles();
        Iterator<String> iterator = windowHandle.iterator();
        parentPage = iterator.next();
        childPage = iterator.next();
        driver.switchTo().window(childPage);
    }


    @Test(priority = 7,dependsOnMethods = "switchWindows")
    public void logIn() {
        driver.findElement(By.id("w3loginbtn")).click();
        driver.findElement(By.id("modalusername")).sendKeys("eagles");
        driver.findElement(By.id("current-password")).sendKeys("12456");
        driver.findElement(By.cssSelector("span[class='PasswordInput_show_pwd_btn__Ncc9S']")).click();
        driver.findElement(By.cssSelector("button[class='Button_button__URNp+ Button_primary__d2Jt3 Button_fullwidth__0HLEu']")).click();
    }

    @Test(priority = 8,dependsOnMethods = "logIn")
    public void switchToParentWindow() {
        driver.switchTo().window(parentPage);
    }

    @AfterClass
    public void close(){
        driver.close();
    }

}