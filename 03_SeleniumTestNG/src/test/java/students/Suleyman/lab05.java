package students.Suleyman;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab05 {

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

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://google.com");

        driver.findElement(By.name("q")).sendKeys("apple");
        Thread.sleep(4000);
        driver.findElement(By.name("btnI")).click();
        driver.getTitle();

        if (driver.getTitle().contains("Apple")){
            System.out.println("Title verification has Passed");
        }else {
            System.out.println("Title verification has Failed");
            System.out.println("Title is : "+ driver.getTitle());
        }
        driver.quit();
        WebDriverManager.chromedriver().setup();
        WebDriver driver1=new ChromeDriver();
        driver1.manage().window().maximize();
        driver1.get("https://opensource-demo.orangehrmlive.com/");

        WebElement userName=driver1.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");
        WebElement passWord=driver1.findElement(By.id("txtPassword"));
        passWord.sendKeys("admin123");

        WebElement loginButton=driver1.findElement(By.id("btnLogin"));

        loginButton.click();


    }
}
