package students.firat;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab02 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        Thread.sleep(4000);
        String expectedTitle = "Facebook - log in or sign up";
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        if(actualTitle.contains(expectedTitle)){
            System.out.println("Title verified");
        }else {
            System.out.println("Title doesn't verified");
        }



    }

}
