package students.Omer;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class lab2 {


        public static void main(String[] args) throws InterruptedException {

            //Second Task: // Go to https://www.etsy.com/
            // Maximize window
            // Verify title doesn't contain "Smile"
            // Verify Current Url
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();

            driver.get("https://www.etsy.com/");
            driver.manage().window().fullscreen();
            Thread.sleep(1500);

            String expectedTitle = "Smile";
            String actualTitle = driver.getTitle();
            String url = "https://www.etsy.com/";

            System.out.println(driver.getTitle());
            if (actualTitle.contains(expectedTitle)){
                System.out.println("it contains smile");
            }else {
                System.out.println("it does not smile");
            }
            System.out.println("Verify current URL :" +actualTitle);
            driver.get(url);

            System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());


        }
    }

