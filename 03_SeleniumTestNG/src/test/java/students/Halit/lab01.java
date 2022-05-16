package students.Halit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class lab01 {

    public static void main(String[]args){
        //  ##Task 1
      //  Go to https://www.etsy.com/
       // Maximize window
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://etsy.com/");
        driver.manage().window().maximize();

//##Task 2
//    Go to https://www.amazon.com/
//    get title and print out

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver1=new FirefoxDriver();
        driver1.get("https://amazon.com/");
        String amazontitle= driver1.getTitle();
        System.out.println("Amazon Title will print below:");
        System.out.println(amazontitle);
        driver1.close();

    }






}
