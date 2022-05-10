package students.Sezar;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab01 {
    public static void main(String[] args) {
        /* Task1
        Go to https://www.etsy.com/
        Maximize window*/
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.etsy.com/");
        driver.manage().window().maximize();
        System.out.println("==========================");
       /* ##Task 2
        Go to https://www.amazon.com/
        get title and print out*/
        WebDriverManager.chromedriver().setup();
        WebDriver driver1 = new ChromeDriver();
        driver1.get("https://www.amazon.com/");
        System.out.println("Title is  : " + driver1.getTitle());
        driver1.close();
    }
}
