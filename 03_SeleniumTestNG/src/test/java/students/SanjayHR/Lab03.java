package students.SanjayHR;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.security.krb5.internal.TGSRep;

public class Lab03 {
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
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver chrome=new ChromeDriver();
        chrome.manage().window().maximize();
        chrome.get("https://google.com");
        //Thread.sleep(5000);
        WebElement searchBox=chrome.findElement(By.name("q"));
        searchBox.sendKeys("apple");
        Thread.sleep(3000);
        WebElement searchButton=chrome.findElement(By.name("btnK"));
        searchButton.click();
        String expectedTitle="apple";
        String actualTitle= chrome.getTitle();
        System.out.println("Actual Title = "+actualTitle);
        if(actualTitle.startsWith(expectedTitle)){
            System.out.println("Title verification has passed. Starts with apple");
        }else{
            System.out.println("Title verification has failed. Does not start with apple");
        }
        Thread.sleep(2000);
        chrome.navigate().back();
        WebElement searchBox2=chrome.findElement(By.name("q"));
        searchBox2.sendKeys("cherry");
        Thread.sleep(3000);
        WebElement searchButton2=chrome.findElement(By.name("btnK"));
        searchButton2.click();
        String expectedTitle2="cherry";
        String actualTitle2= chrome.getTitle();
        System.out.println("Actual Title = "+actualTitle2);
        if(actualTitle2.contains(""+expectedTitle2)){
            System.out.println("Title verification has passed. Contains cherry.");
        }else{
            System.out.println("Title verification has failed. Does not contain cherry.");
        }
        //chrome.close();
//TASK2: Google Feeling lucky button
//1- Open a chrome browser
//2- Go to: https://google.com
//3- Write "apple" in search box
//click i am feeling lucky button
//Verify title contains Apple
        chrome.get("https://google.com");
        chrome.findElement(By.name("q")).sendKeys("apple");
        Thread.sleep(2000);
        chrome.findElement(By.xpath("//input[@name='btnI']")).click();
        String expectedTitle3="Apple";
        String actualTitle3= chrome.getTitle();
        System.out.println("Actual Title = "+actualTitle3);
        if(actualTitle3.contains(""+expectedTitle3)){
            System.out.println("Title verification has passed. Contains Apple.");
        }else{
            System.out.println("Title verification has failed. Does not contain Apple.");
        }
//go to https://opensource-demo.orangehrmlive.com/
//locate user name and send user name, (username=Admin)
//locate user password and send password (password=admin123)
//click on the login button
        chrome.get("https://opensource-demo.orangehrmlive.com/");
        chrome.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
        chrome.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
        Thread.sleep(2000);
        chrome.findElement(By.xpath("//input[@type='submit']")).click();
        //chrome.close();
    }














//go to https://opensource-demo.orangehrmlive.com/
//locate user name and send user name, (username=Admin)
//locate user password and send password (password=admin123)
//click on the login button
}
