package students.AslihanB;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab01 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver =new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        System.out.println(driver.getTitle());
    }

}