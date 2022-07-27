package students.Ozgur;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab03 {

    public static void main(String[] args) throws InterruptedException {

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
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("apple");
        Thread.sleep(2000);
        driver.findElement(By.name("btnK")).click();

        String expectedTitleStartsWith="apple";
        String actualTitleStartsWith=driver.getTitle();
        if(expectedTitleStartsWith.startsWith(actualTitleStartsWith)){
            System.out.println("It matches,it passed");}else{
            System.out.println("It does not match,failed");}

        driver.navigate().back();

        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("cherry");
        String expectedTitleContains="cherry";
        String actualTitle= driver.getTitle();
        if(actualTitle.contains(expectedTitleContains)){
            System.out.println("It does,passed");}else{
            System.out.println("It does not contain,failed");}

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

        driver.navigate().to("https://google.com");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("apple");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='btnI']")).click();

        String expectedTitleContains2="Apple";
        String actualTitle2= driver.getTitle();

        if(actualTitle.contains(expectedTitleContains2)){
            System.out.println("It contains,it passed");}else{
            System.out.println("It does not contain,it failed");}

        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();

        }
}

