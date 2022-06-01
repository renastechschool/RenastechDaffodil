package students.gulsum;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
public class lab03 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("apple");
        Thread.sleep(2000);
        WebElement searchButton = driver.findElement(By.name("btnK"));
        searchButton.click();
        String expectedTitle="apple";
        String actualTitle= driver.getTitle();
        if(actualTitle.startsWith(expectedTitle)){
            System.out.println("Title verification has passed");
        }else{
            System.out.println("Title verification has failed");
        }
        Thread.sleep(2000);
        driver.navigate().back();
        driver.findElement(By.name("q")).sendKeys("cherry");
        Thread.sleep(2000);
        WebElement searchButton1=driver.findElement(By.name("btnK"));
        searchButton1.click();
        String containsTitle="cherry";
        String actualTitle1= driver.getTitle();
        if(actualTitle1.contains(containsTitle)){
            System.out.println("Title contains cheery and verification has passed");
        }else{
            System.out.println("title contains not cherry and verification has failed");
        }
        System.out.println(actualTitle1);
        Thread.sleep(2000);

        //TASK2: Google Feeling lucky button
//1- Open a chrome browser
//2- Go to: https://google.com
//3- Write "apple" in search box
//click i am feeling lucky button
//Verify title contains Apple
        WebDriver driver1=new ChromeDriver();
        driver1.get("https://google.com");
        driver1.findElement(By.name("q")).sendKeys("apple");
        Thread.sleep(2000);
        WebElement feelingLucky=driver1.findElement(By.name("btnI"));
        feelingLucky.click();
        String expectedTitle2="Apple";
        String actualTitle2= driver1.getTitle();
        if(actualTitle2.contains(expectedTitle2)){
            System.out.println("title verification has passed");
        }else{
            System.out.println("title verification has failed");
        }
        System.out.println("Actual title ="+actualTitle2);
        Thread.sleep(4000);

        //go to https://opensource-demo.orangehrmlive.com/
//locate user name and send user name, (username=Admin)
//locate user password and send password (password=admin123)
//click on the login button
        driver1.get("https://opensource-demo.orangehrmlive.com/");
        driver1.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver1.findElement(By.id("txtPassword")).sendKeys("admin123");
        WebElement loginbutton=driver1.findElement(By.name("Submit"));
        loginbutton.click();




    }
}
