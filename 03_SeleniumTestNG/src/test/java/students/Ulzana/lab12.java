package students.Ulzana;

import code.utilities.PropertiesReadingUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class lab12 {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);    }

    @AfterMethod    public void close(){driver.quit();}


    @Test
    public void TC1() throws InterruptedException {

//Navigate to "https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt"
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");

//Click on the "Try it" button
        driver.switchTo().frame(1);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[onclick='myFunction()']")));
        driver.findElement(By.cssSelector("button[onclick='myFunction()']")).click();

//Enter Your name on the Alert Box and Accept alert
        Alert alert = driver.switchTo().alert();
        String expectedText = "Team222";
        alert.sendKeys(expectedText);
        alert.accept();

//Verify that your name shown on the page
        String actualTitle = driver.findElement(By.id("demo")).getText();
        Assert.assertTrue(actualTitle.contains(expectedText));

//Click on the 'home sign' (it is on the left side of page)
        driver.switchTo().defaultContent();

//Switch to second window tab
        driver.findElement(By.id("tryhome")).click();
        Set<String> windowHandle = driver.getWindowHandles();
        Iterator<String> iterator = windowHandle.iterator();
        String parentPage = iterator.next();
        String childPage = iterator.next();
        driver.switchTo().window(childPage);

//Click on the "log in" button
        driver.findElement(By.id("w3loginbtn")).click();

//Enter your credentials
        driver.findElement(By.id("modalusername")).sendKeys(PropertiesReadingUtil.getProperties("InvalidUserName"));
        driver.findElement(By.id("current-password")).sendKeys(PropertiesReadingUtil.getProperties("InvalidPassword"));
//Enter the show password button
        driver.findElement(By.cssSelector("span[class='PasswordInput_show_pwd_btn__Ncc9S']")).click();
        driver.findElement(By.cssSelector("button[class='Button_button__URNp+ Button_primary__d2Jt3 Button_fullwidth__0HLEu']")).click();
//Switch to first tab
        driver.switchTo().window(parentPage);
    }

}

