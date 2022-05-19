package students.esra;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab01 {
   /* #Task 1

    Go to https://www.etsy.com/
    Maximize window

##Task 2
    Go to https://www.amazon.com//

    */

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver chrome=new ChromeDriver();
        chrome.get("https://www.etsy.com/ca/");
        chrome.manage().window().maximize();

        chrome.get("https://www.google.ca/");
        System.out.println("chrome .getTitle"+chrome.getTitle());

    }

}
