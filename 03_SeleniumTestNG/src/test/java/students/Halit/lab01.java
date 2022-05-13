package students.Halit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class lab01 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.etsy.com/");
        driver.manage().window().maximize();
        String title=driver.getTitle();

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver1=new FirefoxDriver();
        driver1.get("https://www.amazon.com/");
        String amazontitle=driver1.getTitle();
        driver1.close();

        System.out.println("Etsy title is going to print below:");
        System.out.println(title);
        System.out.println("\n*******************************************\n");
        System.out.println("Amazon title will print below:");
        System.out.println(amazontitle);

    }
}
