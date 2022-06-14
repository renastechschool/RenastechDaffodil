package students.firat;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class lab10 {
//    Prerequisites= Create username and password for guru99
//navigate to http://demo.guru99.com/V4/
//Login to Guru99 with username and password
//Use JavaScript executer to click on login
//Verify that you login to page


    @Test
    public void TC1() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
        driver.get("http://demo.guru99.com/V4/");
        driver.findElement(By.name("uid")).sendKeys("mngr415326");
        driver.findElement(By.name("password")).sendKeys("rytadyr");
        WebElement loginButton = driver.findElement(By.name("btnLogin"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()",loginButton);
        WebElement managerId = driver.findElement(By.cssSelector("td[style='color: green']"));
        if (managerId.isDisplayed()){
            System.out.println("Sigin succecful");
        }else {
            System.out.println("not");
        }



    }


}
