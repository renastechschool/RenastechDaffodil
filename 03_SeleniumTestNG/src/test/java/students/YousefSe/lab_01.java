package students.Yousef;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class lab_01 {
    public static void main(String[] args) {
// ##Task 1

  //  Go to https://www.etsy.com/
 // Maximize window
        WebDriverManager.chromedriver ().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.etsy.com/");
        driver.manage().window().maximize();



//##Task 2
  //Go to https://www.amazon.com/
 //get title and print out

        WebDriverManager.chromedriver();
        WebDriver driver1 = new ChromeDriver();
        driver1 .get(" https://www.amazon.com/");
        driver1.getTitle();
        System.out.println("get title");
    }
}
