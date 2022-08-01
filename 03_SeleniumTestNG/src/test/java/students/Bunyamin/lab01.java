package students.Bunyamin;

import code.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab01 {


//    Go to https://www.etsy.com/
//    Maximize window
//


//    ##Task 2

//    Go to https://www.amazon.com/
//    get title and print out

    public static void main(String[] args) {

    WebDriverManager.chromedriver().setup();
    WebDriver chrome =new ChromeDriver();
    //Maximize window
    chrome.manage().window().maximize();
    //Go to https://www.etsy.com/
    chrome.get("https://www.etsy.com/");

    BrowserUtils.wait(4);

    chrome.get("https://www.amazon.com/");
    System.out.println("Title" +chrome.getTitle());

}
}
