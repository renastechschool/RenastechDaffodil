package students.hatice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab1 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        //create a driver instance
        WebDriver driver = new ChromeDriver();

        //navigate to chrome browser


        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        System.out.println("Title of Current page is =" + driver.getTitle());


    }
}
