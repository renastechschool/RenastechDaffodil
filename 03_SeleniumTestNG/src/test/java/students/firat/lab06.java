package students.firat;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class lab06 {
    //go to http://demo.guru99.com/test/newtours/register.php
// click on country dropdown and select Barbados with Select Method
//Use 3 different Select Method (visible text,index,value)
//and switch to another countries as you wish

    @Test
    public void dropdown() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/newtours/register.php");
        WebElement dropdown = driver.findElement(By.cssSelector("select[name='country']"));
        Select select = new Select(dropdown);
        Actions act = new Actions(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        select.getFirstSelectedOption().getText();
        Thread.sleep(4000);
        select.selectByVisibleText("AUSTRALIA");
        Thread.sleep(4000);
        select.selectByIndex(3);
        Thread.sleep(4000);
        select.selectByValue("CANADA");


    }

}
