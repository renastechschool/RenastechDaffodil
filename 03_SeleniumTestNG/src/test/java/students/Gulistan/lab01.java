package students.Gulistan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab01 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.etsy.com/");
        driver.manage().window().maximize();

        //##Task 2
// Go to https://www.amazon.com/
// get title and print out

        driver.get("https://www.amazon.com/");

        System.out.println("Title is " + driver.getTitle());
    }
}
