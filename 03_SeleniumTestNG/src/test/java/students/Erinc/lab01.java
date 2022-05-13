package students.Erinc;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab01 {
    //Go to https://www.etsy.com/
    //Maximize window


    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.etsy.com/");

        driver.manage().window().maximize();

        //Go to https://www.amazon.com/
       //get title and print out

        WebDriver driver2=new ChromeDriver();
        driver2.get("https://www.amazon.com/");
        System.out.println(driver2.getTitle());








    }
}
