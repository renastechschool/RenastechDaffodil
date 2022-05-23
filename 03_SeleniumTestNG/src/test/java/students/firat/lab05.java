package students.firat;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab05 {
    public static void main(String[] args) throws InterruptedException {
        //TASK: Google search
//1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
//2- Go to: https://google.com
        driver.get("https://google.com");
        driver.manage().window().maximize();
//3- Write “apple” in search box
        driver.findElement(By.cssSelector("input[type='text']")).sendKeys("apple");
        Thread.sleep(2000);
//4- Click google search button
      WebElement seachButton = driver.findElement(By.name("btnK"));
      seachButton.click();
//5- Verify title:
//Expected: Title should start with "apple" word
        String expectedTitle = "apple";
        String actualTitle= driver.getTitle();
        if (actualTitle.startsWith(expectedTitle)){
            System.out.println("Title is verified.");
        }else {
            System.out.println("Title is not verifed.");
        }
//6-navigate back
        driver.navigate().back();
//7-write cherry in search box
        driver.findElement(By.cssSelector("input[type='text']")).sendKeys("cherry");
        Thread.sleep(2000);
        seachButton.click();
//8-verify title contains cherry.
        String expectedTitle2 = "cherry";
        String actualTitle2= driver.getTitle();
        if (actualTitle2.contains(expectedTitle2)){
            System.out.println("Title is verified.");
        }else {
            System.out.println("Title is not verifed.");
        }
        driver.navigate().back();
//TASK2: Google Feeling lucky button
//1- Open a chrome browser
//2- Go to: https://google.com
//3- Write "apple" in search box
        driver.findElement(By.cssSelector("input[type='text']")).sendKeys("apple");
//click i am feeling lucky button
        driver.findElement(By.className("RNmpXc")).click();
//Verify title contains Apple
        String expectedTitle3 = "apple";
        String actualTitle3= driver.getTitle();
        if (actualTitle.contains(expectedTitle3)){
            System.out.println("Title is verified.");
        }else {
            System.out.println("Title is not verifed.");
        }

//go to https://opensource-demo.orangehrmlive.com/
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
//locate user name and send user name, (username=Admin)
        driver.findElement(By.name("txtUsername")).sendKeys("Admin");
//locate user password and send password (password=admin123)
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//click on the login button
        driver.findElement(By.className("button")).click();


    }
}
