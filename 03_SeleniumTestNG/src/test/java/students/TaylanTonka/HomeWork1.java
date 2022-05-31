package students.TaylanTonka;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork1 {

    public static void main(String[] args) {
        System.out.println("Hello World");
        //set up chrome driver
        WebDriverManager.chromedriver().setup();

        //create a driver instance
        WebDriver driver = new ChromeDriver();

        //navigate to chrome browser


        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        System.out.println("Title of Current page is =" + driver.getTitle());


    }
}
