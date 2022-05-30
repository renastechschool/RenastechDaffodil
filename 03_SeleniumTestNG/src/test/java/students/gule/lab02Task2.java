package students.gule;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Second Task:
// Go to https://www.etsy.com/
// Maximize window
// Verify title doesnt contains "Smile"
// Verify Current Url
// Go to https://www.amazon.com/
// Verify title // Verify Current Url // Navigate Back // Refresh // Quit browser
public class lab02Task2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.etsy.com");
        driver.manage().window().maximize();
        System.out.println("Current URL : " +driver.getCurrentUrl());
        String exceptedTitle = "The title does not contains \"Smile\"";
        String actualTitle = driver.getTitle();
        if(!actualTitle.contains(exceptedTitle)){
            System.out.println("Etsy title does not contains Smile and title verification has failed");
        }
        else {
            System.out.println("Etsy title contains Smile and title verification has passed");
        }
        System.out.println("Actual Etsy title is : " +actualTitle);

        Thread.sleep(4000);
        driver.get("https://www.amazon.com");
        driver.getTitle();
        System.out.println("Current URL : " + driver.getCurrentUrl());
        Thread.sleep(3000);
        driver.navigate().back();
        driver.navigate().refresh();
        Thread.sleep(4000);
        driver.quit();


    }

}
