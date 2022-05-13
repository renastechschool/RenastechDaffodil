package students.EgeGunege;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class lab01 {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.get("https://www.etsy.com/");
        driver.manage().window().maximize();
        driver.get("https://www.amazon.ca/");
        System.out.println("driver.getTitle() = " + driver.getTitle());
    }
}
