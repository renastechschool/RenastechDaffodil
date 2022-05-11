package src.test.java.students.gule;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//##Task 1
//        Go to https://www.etsy.com/
//        Maximize window
//        ##Task 2
//        Go to https://www.amazon.com/
//        get title and print out
public class day01_homework {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();
        chrome.get("https://www.etsy.com/");
        chrome.manage().window().maximize();

        chrome.get("https://www.amazon.com/");
        System.out.println("chrome.getTitle"+chrome.getTitle());
    }
}
