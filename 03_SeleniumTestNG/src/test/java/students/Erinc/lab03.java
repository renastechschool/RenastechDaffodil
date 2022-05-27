package students.Erinc;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab03 {
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

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();

        driver.findElement(By.name("q")).sendKeys("apple");
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        if (driver.getTitle().startsWith("apple")){
            System.out.println("Title has been verified");
        }else{
            System.out.println("Title has not been verified");
        }
        Thread.sleep(4000);
        driver.navigate().back();
        driver.findElement(By.name("q")).sendKeys("cherry");
        Thread.sleep(4000);
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        if (driver.getTitle().contains("cherry")){
            System.out.println("Title has been verified");
        }else{
            System.out.println("Title has not been verified");
        }

        WebDriver driver2=new ChromeDriver();
        driver2.get("https://google.com");
        driver2.manage().window().maximize();

        driver2.findElement(By.name("q")).sendKeys("apple");
        Thread.sleep(4000);
        driver2.findElement(By.cssSelector("input[jsaction='trigger.kWlxhc']")).click();
        if (driver2.getTitle().contains("apple")){
            System.out.println("Title has been verified");
        }else{
            System.out.println("Title has not been verified");
        }


        //task3
        WebDriver driver3=new ChromeDriver();
        driver3.get("https://opensource-demo.orangehrmlive.com/");
        driver3.manage().window().maximize();

        driver3.findElement(By.id("txtUsername")).sendKeys("Admin");
        Thread.sleep(4000);
        driver3.findElement(By.id("txtPassword")).sendKeys("admin123");
        Thread.sleep(4000);
        driver3.findElement(By.id("btnLogin")).click();



    }
}
