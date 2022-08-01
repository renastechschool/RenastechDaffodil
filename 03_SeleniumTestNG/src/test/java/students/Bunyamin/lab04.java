package students.Bunyamin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab04 {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.etsy.com/");
        String actualTitle = driver.getTitle();
        String expectedWord = "Smile";

        if (actualTitle.contains(expectedWord)){
            System.out.println("Title contais 'Smile' ..");
        }else {
            System.out.println("Title doesn't contais 'Smile' ..");
        }
        System.out.println(driver.getCurrentUrl());
        driver.navigate().to("https://www.amazon.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.navigate().back();
        driver.close();



    }


}
