package students.Gulistan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab03 {


public static void main(String[] args) throws InterruptedException {
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();

    task1(driver);
    task2(driver);
}
   public static void task1(WebDriver driver) throws InterruptedException {
       driver.get("https://google.com");
       driver.manage().window().maximize();
       WebElement searchBox = driver.findElement(By.name("q"));
       searchBox.sendKeys("apple");
       Thread.sleep(2000);

       WebElement searchButton = driver.findElement(By.name("btnK"));
       searchButton.click();

       String expectedTitle = "apple";
       String actualTitle = driver.getTitle();
       if (actualTitle.startsWith(expectedTitle)) {
           System.out.println("Title verify is passed");
       } else
           System.out.println("Title verify is not passed");

       driver.navigate().back();
       WebElement search = driver.findElement(By.name("q"));
       search.sendKeys("cherry", Keys.ENTER);
       String titleContains = "cherry";
       String title = driver.getTitle();

       if (title.contains(titleContains)) {
           System.out.println("Title is verify");
       } else
           System.out.println("Title is not verify");
   }
   public static void task2(WebDriver driver) throws InterruptedException {
       driver.get("https://google.com");
       driver.manage().window().maximize();
       WebElement searchBox2 = driver.findElement(By.name("q"));
       searchBox2.sendKeys("Apple");
       Thread.sleep(2000);

       WebElement luckyButton = driver.findElement(By.xpath("(//input[@name='btnI'])[1]"));
       luckyButton.click();
       String titleContains1 = "Apple";
       String title1 = driver.getTitle();
       if (title1.contains(titleContains1)) {
           System.out.println("Title has been verify");
       } else {
           System.out.println("Title has not been verify");
       }

       driver.navigate().back();
       driver.get("https://opensource-demo.orangehrmlive.com");
       WebElement userName = driver.findElement(By.id("txtUsername"));
       userName.sendKeys("Admin");
       WebElement password = driver.findElement(By.id("txtPassword"));
       password.sendKeys("admin123");
       WebElement loginButton = driver.findElement(By.id("btnLogin"));
       loginButton.click();
   }
}



