package students.gule;
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

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab03Task2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("apple");
        driver.findElement(By.xpath("(//input[@class='RNmpXc'])[2]")).click();
        //driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        String expectedTitle = "Apple";
        String actualTitle = driver.getTitle();
        System.out.println("Actual Title : " + driver.getTitle());
        if(actualTitle.contains(expectedTitle)){
            System.out.println("Title verification has passed");
        }
        else{
            System.out.println("Title verification has not passed");
        }
        Thread.sleep(1000);
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
    }
}
