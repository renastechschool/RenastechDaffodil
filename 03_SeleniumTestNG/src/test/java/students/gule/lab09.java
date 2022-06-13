package students.gule;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

//website: http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target
//        Test Scenario:
//Go to the above URL.
//Get the current window’s handle and write to the console window. It must be the first window handle.
//Locate the “Visit W3Schools.com!” link and click it.
//Get all window handles and hold them in a list.
//Write to total window handle number to the console. It must be 2.
//Switch t the second window.
//Get the current window’s handle and write to the console window. It must be a second window handle.
//Check the upper left side logo in the second window.
//Go back (Switch) to the first window.
//Get the current window’s handle and write to the console window. It must be the first window handle.
//Check the See Run Button Text. It must contain “Run >” text.
public class lab09 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
        System.out.println("Current Window Handle : "+ driver.getWindowHandle());
        driver.findElement(By.id("iframeResult"));
        driver.switchTo().frame("iframeResult");

    }

}
