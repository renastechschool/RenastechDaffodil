package students.AhmetFerat;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab01 {
        public static void main(String[] args) {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.etsy.com/");
            driver.manage().window().maximize();
            WebDriverManager.chromedriver().setup();
            WebDriver driver1 = new ChromeDriver();
            driver1.get("https://www.amazon.com/");
            System.out.println("The Title of the website is   : " + driver1.getTitle());
            driver1.close();
        }
    }
