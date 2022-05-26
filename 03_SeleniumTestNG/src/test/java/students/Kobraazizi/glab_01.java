package students.Kobraazizi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class glab_01 {
    public static void main(String[] args) {
        //  Go to https://www.etsy.com/
        // Maximize window

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.etsy.com/");
        driver.manage().window().maximize();
        WebDriverManager.chromedriver().setup();
        WebDriver driver1=new ChromeDriver();
        driver1.get("https://www.amazon.com/");
        System.out.println(driver1.getTitle());
        driver1.close();


    }
}
 