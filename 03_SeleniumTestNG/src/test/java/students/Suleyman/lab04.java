package students.Suleyman;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab04 {

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
        WebDriver driver=new ChromeDriver();
        driver.get("https://google.com");

        driver.findElement(By.name("q")).sendKeys("apple");
        Thread.sleep(4000);
        driver.findElement(By.name("btnK")).click();

        String expectedTitle="apple";
        String actualTitle=driver.getTitle();

        if (actualTitle.startsWith(expectedTitle)){
            System.out.println("Title verification has Passed");
        }else {
            System.out.println("Title verification has Failed");
            System.out.println("Title is : "+ driver.getTitle());

        }
        driver.navigate().back();
        driver.findElement(By.name("q")).sendKeys("cherry");
        Thread.sleep(4000);
        driver.findElement(By.name("btnK")).click();

        driver.getTitle();

        if (driver.getTitle().contains("cherry")){
            System.out.println("Title verification has Passed");
        }else {
            System.out.println("Title verification has Failed");
        }

    }
}

