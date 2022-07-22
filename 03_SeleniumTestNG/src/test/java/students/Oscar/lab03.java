package students.Oscar;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class lab03 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("apple");
        searchBox.sendKeys(Keys.ENTER);
        //driver.findElement(By.name("btnK")).click();
        String titleContains = "apple";
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(titleContains), "Title verification failed");
        driver.navigate().back();
        searchBox.sendKeys("cherry");
        searchBox.sendKeys(Keys.ENTER);
        String titleContains2 = "cherry";
        String actualTitle2 = driver.getTitle();
        System.out.println(actualTitle2);
        Assert.assertTrue(actualTitle2.contains(titleContains2), "Second title verification failed");
        driver.navigate().back();
        //searchBox.sendKeys("apple");
        //driver.findElement(By.id("gbqfbb")).click();


        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebElement userNameBox = driver.findElement(By.id("txtUsername"));
        userNameBox.sendKeys("Admin");
        WebElement passWordBox = driver.findElement(By.id("txtPassword"));
        passWordBox.sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();






    }
}
