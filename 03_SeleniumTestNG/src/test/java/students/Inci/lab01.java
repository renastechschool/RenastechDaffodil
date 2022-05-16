package students.Inci;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab01 {

   /* Go to https://www.etsy.com/
    Maximize window

##Task 2
    Go to https://www.amazon.com/
    get title and print out */

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver chrome=new ChromeDriver();
        chrome.get(" https://www.etsy.com/");
        chrome.manage().window().maximize();
        chrome.get("https://www.amazon.com/");
        System.out.println("chrome.getTitle() = " + chrome.getTitle());

    }
}
