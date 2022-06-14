package students.Destyar;

import code.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab02Task2 {

    //  Second Task:
    // Go to https://www.etsy.com/
    // Maximize window
    // Verify title doesnt contains "Smile"
    // Verify Current Url
    // Go to https://www.amazon.com/
    // Verify title
    // Verify Current Url
    // Navigate Back
    // Refresh
    // Quit browser

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver chrome=new ChromeDriver();
        // Maximize window
        chrome.manage().window().maximize();
        chrome.get("https://www.etsy.com/");
        System.out.println("Current url : " +chrome.getCurrentUrl());

        String expectedTitle="Smile";
        String actualTitle=chrome.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Verification has failed ");
        }else{
            System.out.println("Verification has passed");
        }
        BrowserUtils.wait(4);

        chrome.manage().window().maximize();
        chrome.get("https://www.amazon.com/");
        System.out.println("Current url : " +chrome.getCurrentUrl());
        System.out.println("Title : " +chrome.getTitle());

        chrome.navigate().back();
        chrome.navigate().refresh();
        chrome.quit();




    }
}
