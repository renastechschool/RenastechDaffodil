package students.Inci;

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
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
    }
    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
    @Test()
    public void TC1() {
        //Click on the "Try it" button

        driver.switchTo().frame("iframeResult");
        driver.findElement(By.xpath("//button[text()='Try it']")).click();
        //Enter Your name on the Alert Box and Accept alert
        Alert box = driver.switchTo().alert();
        box.sendKeys("hello");
        box.accept();
        //Verify that your name shown on the page
        WebElement text = driver.findElement(By.xpath("//p[@id='demo']"));
        String expectedtext = "Hello hello! How are you today?";
        String actultext = text.getText();
        Assert.assertEquals(expectedtext, actultext, "verification failed");
    }

    @Test()
    public void TC2(){
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
    @Test()
    public void TC3() throws InterruptedException {
        driver.findElement(By.id("modalusername")).sendKeys("inci.2003@hotmail.com");
        driver.findElement(By.id("current-password")).sendKeys("123456");
        driver.findElement(By.cssSelector(".PasswordInput_show_pwd_btn__Ncc9S")).click();
        Thread.sleep(2000);
        Set<String> allwindows=driver.getWindowHandles();
        Iterator<String > itr=allwindows.iterator();
        String parentWindow= itr.next();
        driver.switchTo().window(parentWindow);


    }

}
