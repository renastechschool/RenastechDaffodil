package students.SanjayHR;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Lab01 {
    public static void main(String[] args) {
        //Go to https://www.etsy.com/ Maximize window
        WebDriverManager.chromedriver().setup();
        WebDriver chrome=new ChromeDriver();
        chrome.get("https://www.etsy.com/");
        chrome.manage().window().maximize();
        //Go to https://www.amazon.com/ get title and print out
        chrome.get("https://www.amazon.com/");
        System.out.println("Title = "+chrome.getTitle());
    }
}
