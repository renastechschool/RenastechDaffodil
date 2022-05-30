package students.Ulzana;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class lab1 {


    public static void main(String[] args) {

//    ##Task 1
//    Go to https://www.etsy.com/
//    Maximize window

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://etsy.com/");
        driver.manage().window().maximize();
        driver.close();


//     ##Task 2
//    Go to https://www.amazon.com/
//    get title and print out

        WebDriver driver1= new ChromeDriver();
        driver1.get("https://amazon.com/");
        String title=driver1.getTitle();
        System.out.println("Title: "+ title);
        driver1.close();


    }

}
