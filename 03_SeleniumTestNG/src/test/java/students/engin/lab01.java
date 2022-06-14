package students.engin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class lab01 {
    /*
    ##Task 1

Go to https://www.etsy.com/
Maximize window

##Task 2
Go to https://www.amazon.com/
get title and print out
     */

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.etsy.com/");
        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
        driver.get("https://www.amazon.com/");
        System.out.println("driver.getTitle() = " + driver.getTitle());
        driver.close();
    }

}
