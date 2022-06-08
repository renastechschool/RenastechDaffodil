package students.Gulistan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab02 {
    //Task - 1
//Open Chrome Browser
//Go to https://www.facebook.com
//Verify title: Expected: "Facebook - Log In or Sign Up"
//Task - 2


    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        Thread.sleep(3000);
        driver.manage().window().maximize();

        String exceptedTitle = "Facebook";
        String actualTitle = driver.getTitle();
        if(actualTitle.equals(exceptedTitle)){
            System.out.println("Facebook title verification has passed");

        }else{
            System.out.println("Facebook title verification has not passed");
        }


//Open Chrome Browser
//Go to google
//Navigate back
//Navigate forward
//Navigate to https://www.amazon.com
//Verify title contains : Smile

        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        driver.navigate().to("https://www.amazon.com");
        String titleContains = "Smile";
        String title = driver.getTitle();
        if(titleContains.equals(title)){
            System.out.println("Title is verify");
        }else
            System.out.println("Title is not verify");

        driver.close();
    }
}
