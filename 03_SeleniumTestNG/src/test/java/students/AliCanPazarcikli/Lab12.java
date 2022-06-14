package students.AliCanPazarcikli;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Lab12 {

    WebDriver driver;

    @BeforeClass
    void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
    }
    @AfterClass
    void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
    @Test(priority = 1)
    void verifyName() {
        driver.switchTo().frame("iframeResult");
        WebElement tryIt = driver.findElement(By.xpath("//button[text()='Try it']"));
        tryIt.click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Ali");
        alert.accept();
        WebElement text = driver.findElement(By.id("demo"));
        System.out.println(text.getText());
        String expectedText = "Hello Ali! How are you today?";
        String actualText = text.getText();
        Assert.assertEquals(actualText, expectedText, "Name verification has passed.");
    }
    @Test(priority = 2)
    void switchWindow(){
        driver.switchTo().defaultContent();
        driver.findElement(By.id("tryhome")).click();

        Set<String> allwindows=driver.getWindowHandles();
        List<String> windowsList=new ArrayList<>();
        for(String newWindow:allwindows){
            windowsList.add(newWindow);
            driver.switchTo().window(newWindow);
        }
        driver.findElement(By.id("w3loginbtn")).click();
    }
    @Test(priority = 3,dependsOnMethods = "switchWindow")
    void login() throws InterruptedException {
        driver.findElement(By.id("modalusername")).sendKeys("abc@gmail.com");
        driver.findElement(By.id("current-password")).sendKeys("abc123");

        driver.findElement(By.cssSelector(".PasswordInput_show_pwd_btn__Ncc9S")).click();
        Thread.sleep(2000);
        Set<String> allwindows=driver.getWindowHandles();
        Iterator<String > itr=allwindows.iterator();
        String parentWindow= itr.next();
        driver.switchTo().window(parentWindow);


    }

}
