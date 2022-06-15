package students.HaticeKarakoyun;

import code.utilities.BrowserUtils;
import code.utilities.WebDriverUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class lab11 {
    //Tas 1:

    //Launch the web browser and open the site http://demo.guru99.com/test/delete_customer.php
    //Enter Any Customer id
    //After entering the customer ID, Click on the “Submit” button.
    //Reject/accept the alert.


    //Task 2:

    //go to http://the-internet.herokuapp.com/hovers
    //move mouse to third image(you may use move to element method in actions)
    // verify text of image present on the screen_

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        //Step 1) Launch the web browser and open the site http://demo.guru99.com/test/delete_customer.php
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/test/delete_customer.php");
    }

    @Test
    public void TC1_Task1() {
        //Step 2) Enter Any Customer id.
        driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("Ronya123");
        BrowserUtils.wait(3);
        //Step 3) After entering the customer ID, Click on the “Submit” button.
        driver.findElement(By.cssSelector("input[name='submit']")).click();
        BrowserUtils.wait(3);
        //Step 4) Reject/accept the alert.
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();


    }

    @Test
    public void TC_Task2() throws InterruptedException {
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





