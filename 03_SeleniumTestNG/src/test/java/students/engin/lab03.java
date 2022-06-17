package students.engin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class lab03 {
    /*
    //TASK: Google search
//1- Open a chrome browser
//2- Go to: https://google.com
//3- Write “apple” in search box
//4- Click google search button
//5- Verify title:
//Expected: Title should start with "apple" word
//6-navigate back
//7-write cherry in search box
//8-verify title contains cherry.

//TASK2: Google Feeling lucky button
//1- Open a chrome browser
//2- Go to: https://google.com
//3- Write "apple" in search box
//click i am feeling lucky button
//Verify title contains Apple

//go to https://opensource-demo.orangehrmlive.com/
//locate user name and send user name, (username=Admin)
//locate user password and send password (password=admin123)
//click on the login button
     */

    @Test
    public void TC1_appleSearch(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("apple", Keys.ENTER);
        System.out.println("driver.getTitle() = " + driver.getTitle());
        driver.navigate().back();
        driver.findElement(By.name("q")).sendKeys("cherry", Keys.ENTER);
        System.out.println(driver.getTitle().contains("cherry"));
    }
    @Test
    public void TC2_GoogleFeelingLucky(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.get("https://www.google.com");
//        driver.findElement(By.name("q")).sendKeys("apple");
//        driver.findElement(By.xpath("(//input[@class='RNmpXc'])[2]")).click();
//        boolean B= driver.getTitle().contains("Apple");
//        System.out.println("Title contains Apple is " + B);

        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        WebElement userPassword = driver.findElement(By.xpath("//input[@name='txtPassword']"));
        WebElement submitButton = driver.findElement(By.id("btnLogin"));

        username.sendKeys("Admin");
        userPassword.sendKeys("admin123");
        submitButton.click();


    }


}
