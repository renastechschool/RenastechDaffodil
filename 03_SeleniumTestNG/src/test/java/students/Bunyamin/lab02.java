package students.Bunyamin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class lab02 {


    @Test
    public void TC1 (){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        String expectedTitle = "Facebook - Log In or Sign Up";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Same Title");
        }else {
            System.out.println("Not same Title");
        }
    }
    @Test
    public void TC2 (){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.get("https://www.amazon.com");
        System.out.println("driver.getTitle() = " + driver.getTitle());
    }
    @Test
    public void TC3(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.etsy.com/");
        String actualTitle = driver.getTitle();
        String ectualTitle = "Smile";

        if (actualTitle.contains(ectualTitle)){
            System.out.println("Contains Smile");
        }else {
            System.out.println("Not contains Smile");
        }

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        driver.get("https://www.amazon.com/");
        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.navigate().back();
        driver.navigate().refresh();
        driver.quit();

    }


}
