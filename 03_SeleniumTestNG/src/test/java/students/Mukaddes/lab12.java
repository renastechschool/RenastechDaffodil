package students.Mukaddes;

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

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");

    }

    @AfterClass
    public void closing() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();
    }

    @Test
    public void TC1() throws InterruptedException {
        //Click on the "Try it" button
        driver.switchTo().frame("iframeResult");
        driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();

        //Enter Your name on the Alert Box and Accept alert
        Alert box = driver.switchTo().alert();
        box.sendKeys("Princess");
        box.accept();

        //Verify that your name shown on the page
        WebElement text = driver.findElement(By.id("demo"));
        String expectedText = "Hello Princess! How are you today?";
        String actualText = text.getText();
        Assert.assertEquals(actualText, expectedText, "name verification has passed");

        //Click on the 'home sign' (it is on the left side of page)
        driver.switchTo().defaultContent();
        driver.findElement(By.id("tryhome")).click();

        //Switch to second window tab
        Set<String> tabs2 = driver.getWindowHandles();
        List<String> windowsList = new ArrayList<>();
        for (String window : tabs2) {
            driver.switchTo().window(window);
        }

        //Click on the "log in" button
        driver.findElement(By.id("w3loginbtn")).click();

        //Enter your credentials
        driver.switchTo().defaultContent();
        driver.findElement(By.id("modalusername")).sendKeys("apple@gmail.com");
        driver.findElement(By.id("current-password")).sendKeys("1234M");

        //Enter the show password button
        driver.findElement(By.xpath("//span[@class='PasswordInput_show_pwd_btn__Ncc9S']")).click();

        //Switch to first tab
        Set<String> tabs = driver.getWindowHandles();
        Iterator<String> itr = tabs.iterator();
        String parentWindow = itr.next();
        driver.switchTo().window(parentWindow);

    }
}