package students.Yousef;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab_03 {
    public static void main(String[] args) throws InterruptedException {
        //TASK: Google search
//1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
//2- Go to: https://google.com
        driver.get("https://google.com");
//3- Write “apple” in search box
        Thread.sleep(3000);
        driver.findElement(By.name("q")).sendKeys("apple");
//4- Click google search button
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@value='Google Search']")).click();
//5- Verify title:
        Thread.sleep(3000);
        driver.findElement(By.name("q")).click();
//Expected: Title should start with "apple" word
        String expectedTitle= "apple";
        String actualTitle=driver.getTitle();
        if(actualTitle.startsWith(expectedTitle)){
            System.out.println("Title verification has passed");}
        else {
            System.out.println("Title verification has failed");}
//6-navigate back
        Thread.sleep(300);
        driver.navigate().back();

//7-write cherry in search box
        driver.findElement(By.name("q")).sendKeys("cherry");
        driver.findElement(By.xpath("//input[@name='btnK']")).click();

//8-verify title contains cherry.
        String expectedTitle2="cherry";
        String actualTitle2=driver.getTitle();
        if(actualTitle2.contains(expectedTitle2)){
            System.out.println("Title verification has passed");}
        else {System.out.println("Title verification has failed");}





//TASK2: Google Feeling lucky button
//1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver1=new ChromeDriver();

//2- Go to: https://google.com
        Thread.sleep(3000);
        driver1.get(" https://google.com");
//3- Write "apple" in search box
        driver1.findElement(By.name("q")).sendKeys("apple");
//click i am feeling lucky button
        Thread.sleep(3000);
        driver1.findElement(By.id("gbqfbb")).click();
//Verify title contains Apple
        Thread.sleep(3000);
        String expectedTitle3="Apple";
        String actualTitle3= driver1.getTitle();
        if(actualTitle3.contains(expectedTitle3)){
            System.out.println("Title verification has passed");}else {
            System.out.println("Title verification has failed");}
        Thread.sleep(3000);
        driver1.navigate().back();
 //go to https://opensource-demo.orangehrmlive.com/
        driver1.findElement(By.xpath("//input[@name='btnK']")).sendKeys("https://opensource-demo.orangehrmlive.com/");
//locate user name and send user name, (username=Admin)
//locate user password and send password (password=admin123)
//click on the login button
    }


}
