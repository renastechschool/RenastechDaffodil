package students.Destyar;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab03Task02 {
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
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");
        Thread.sleep(2000);
        WebElement SearchBox=driver.findElement(By.name("q"));
        Thread.sleep(2000);
        SearchBox.sendKeys("apple");
        WebElement LuckyButton= driver.findElement(By.name("btnI"));
        LuckyButton.click();

        String expectedTitle="Apple";
        String actualTitle=driver.getTitle();

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Actual title contains : " +actualTitle + "Passed");
        }else{
            System.out.println("Actual title does not contain : " +actualTitle + "Failed");
            Thread.sleep(4000);


        }
        driver.get("https://opensource-demo.orangehrmlive.com");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        Thread.sleep(3000);
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        Thread.sleep(3000);
        driver.findElement(By.name("Submit")).click();

    }
}
