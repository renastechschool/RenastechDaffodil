package students.gule;
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

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab03Task1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("apple");
        driver.findElement(By.xpath("(//input[@class='gNO89b'])[2]")).click();
        //driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(Keys.ENTER);

        String expectedTitle="apple";
        String actualTitle=driver.getTitle();
        if(actualTitle.startsWith(expectedTitle)){
            System.out.println("Title verification has passed");
        }else {
            System.out.println("Title verification has failed");
        }
        System.out.println("Actual title is = "+actualTitle);
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("cherry");
        driver.findElement(By.xpath("(//input[@class='gNO89b'])[2]")).click();
        //driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(Keys.ENTER);
        String expectedTitleC = "cherry";
        String actualTitleC = driver.getTitle();
        if(actualTitleC.contains(expectedTitleC)){
            System.out.println("Title contains cherry");
        }
        else{
            System.out.println("Title does not contain cherry");
        }
    }
}
