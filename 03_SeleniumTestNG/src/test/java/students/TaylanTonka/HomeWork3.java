package students.TaylanTonka;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HomeWork3 {
    WebDriver driver;
    String actualTitle;
    String expectedTitle;

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        HomeWork3 hw3 = new HomeWork3();
        hw3.task1();
        hw3.task2();
    }

    public void task1() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("apple");
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(Keys.ESCAPE);
        driver.findElement(By.xpath("(//input[@class='gNO89b'])[1]")).click();
        actualTitle = driver.getTitle();
        expectedTitle = "apple";

        Assert.assertTrue(actualTitle.contains(expectedTitle));
        driver.navigate().back();
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("cherry");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(Keys.ESCAPE);
        driver.findElement(By.xpath("(//input[@class='RNmpXc'])[2]")).click();
        actualTitle = driver.getTitle();
        expectedTitle = "Cherry";

        Assert.assertTrue(actualTitle.contains(expectedTitle));

        driver.close();
        System.out.println("Task 1 passed");
    }

    public void task2()
    {
        driver = new ChromeDriver();

        driver.get("https://google.com");
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("apple");
        driver.findElement(By.xpath("(//input[@class='gNO89b'])[2]")).click();
        actualTitle = driver.getTitle();
        expectedTitle = "apple";

        Assert.assertTrue(actualTitle.contains(expectedTitle));

        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        driver.close();

        System.out.println("Task 2 passed");
    }


}
