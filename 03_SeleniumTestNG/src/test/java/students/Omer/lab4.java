package students.Omer;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab4 {

    public static void main(String[] args) throws InterruptedException {

        //TASK: Google search

        //1- Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        //2- Go to: https://google.com
        WebDriver driver = new ChromeDriver();
        //3- Write “apple” in search box
        driver.get("https://www.google.com/");
        Thread.sleep(2500);
        //4- Click google search button
        //5- Verify title:
        //Expected: Title should start with "apple" word
        //6-navigate back
        //7-write cherry in search box
        //8-verify title contains cherry.
        driver.findElement(By.name("q")).sendKeys("Cherry");
        String containTitle="Cherry";
        String actualTitle=driver.getTitle();

















    }
}
