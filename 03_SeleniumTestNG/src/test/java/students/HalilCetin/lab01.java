package students.HalilCetin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//##Task 1
//
//        Go to https://www.etsy.com/
//        Maximize window
//
//        ##Task 2
//        Go to https://www.amazon.com/
//        get title and print out
public class lab01 {
    public static void main(String[] args) {
        //Task1

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.etsy.com/");
        driver.manage().window().maximize();

        //Task2

        driver.navigate().to("https://www.amazon.com/");
        String title=driver.getTitle();
        System.out.println(title);


        driver.close();


    }
}
