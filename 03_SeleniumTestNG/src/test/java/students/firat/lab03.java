package students.firat;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab03 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        String actualTitle = driver.getTitle();
        String expectedWord = "Smile";

        if (actualTitle.contains(expectedWord)){
            System.out.println("Title contais 'Smile' ..");
        }else {
            System.out.println("Title doesn't contais 'Smile' ..");
        }


    }
}
