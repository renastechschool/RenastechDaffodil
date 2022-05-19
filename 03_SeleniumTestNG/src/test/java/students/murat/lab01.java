package students.murat;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab01 {

/*
        ## Task 1
        Go to https://www.etsy.com/
        Maximize
        Minimize

 */


    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();
        chrome.get("https://www.etsy.com/");
        chrome.manage().window().maximize();
        chrome.manage().window().minimize();


        /*
        ## Task 2
        Go to "https://www.amazon.com/"
        get title and print out

         */

            System.out.println("****************");

            chrome.get("https://www.amazon.com/");
            String title = chrome.getTitle();
            System.out.println("Title of current page is = " + title);
        }
    }


