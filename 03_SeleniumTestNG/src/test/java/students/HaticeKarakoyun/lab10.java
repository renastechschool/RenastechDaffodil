package students.HaticeKarakoyun;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class lab10 {

    // Prerequisites= Create username and password for guru99
    //navigate to http://demo.guru99.com/V4/
    //Login to Guru99 with username and password
    //Use JavaScript executer to click on login
    //Verify that you login to page

    WebDriver driver;
    @BeforeMethod
    public void SetUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(" http://demo.guru99.com/V4/");
        driver.manage().window().maximize();
    }
    @Test
    public void TC1(){

        WebElement hereButton = driver.findElement(By.linkText("here"));
        hereButton.click();

        WebElement userName = driver.findElement(By.name("emailid"));
        userName.sendKeys("batch5@gmail.com", Keys.ENTER);
        String userID = driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td[2]")).getText();
        String passWord = driver.findElement(By.xpath("/html/body/table/tbody/tr[5]/td[2]")).getText();
        for (int i = 0; i < 2; i++){
            driver.navigate().back();
        }
        JavascriptExecutor Gul=(JavascriptExecutor) driver;
        Gul.executeScript("window.scrollBy(0,1000)");


        WebElement userIdBox = driver.findElement(By.xpath("//input[@name='uid']"));
        userIdBox.sendKeys(userID);
        WebElement passwordBox = driver.findElement(By.xpath("//input[@name='password']"));
        passwordBox.sendKeys(passWord);
        WebElement button = driver.findElement(By.name("btnLogin"));
        button.click();
        String verify=driver.findElement(By.xpath("//marquee[@behavior='alternate']")).getText();
        String expected="Welcome To Manager's Page of Guru99 Bank";

        Assert.assertTrue(verify.equals(expected),"failed");


    }
}
