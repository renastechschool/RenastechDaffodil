package students.Mukaddes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab01 {
    //Go to https://www.etsy.com/
    //Maximize window

    //##Task 2
    // Go to https://www.amazon.com/
    // get title and print out
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        System.out.println("Page title is "+driver.getTitle());
        System.out.println("********************");

        WebDriverManager.chromedriver().setup();
        WebDriver driver1=new ChromeDriver();
        driver1.get("https://www.etsy.com/");
        driver1.manage().window().maximize();
    }
}
