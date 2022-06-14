package students.firat;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

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

    @Test
    public void TC1() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.switchTo().frame(1);
        driver.findElement(By.cssSelector("button[onclick='myFunction()']")).click();
        Alert alert = driver.switchTo().alert();
        String expectedText = "eagles";
        alert.sendKeys(expectedText);
        alert.accept();
        String actualTitle = driver.findElement(By.id("demo")).getText();
        System.out.println(actualTitle);
        System.out.println(expectedText);
        Assert.assertTrue(actualTitle.contains(expectedText));
        driver.switchTo().defaultContent();
        driver.findElement(By.id("tryhome")).click();
        Set<String> windowHandle = driver.getWindowHandles();
        Iterator<String> iterator = windowHandle.iterator();
        String parentPage = iterator.next();
        String childPage = iterator.next();
        driver.switchTo().window(childPage);
        driver.findElement(By.id("w3loginbtn")).click();
        driver.findElement(By.id("modalusername")).sendKeys("eagles");
        driver.findElement(By.id("current-password")).sendKeys("12456");
        driver.findElement(By.cssSelector("span[class='PasswordInput_show_pwd_btn__Ncc9S']")).click();
        driver.findElement(By.cssSelector("button[class='Button_button__URNp+ Button_primary__d2Jt3 Button_fullwidth__0HLEu']")).click();
        driver.switchTo().window(parentPage);

    }

}
