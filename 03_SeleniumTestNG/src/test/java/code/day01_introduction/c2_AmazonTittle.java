package code.day01_introduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c2_AmazonTittle {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        Thread.sleep(4000);
        driver.navigate().back();
        Thread.sleep(4000);
        driver.navigate().forward();
        Thread.sleep(4000);
        driver.navigate().to("https://www.amazon.com/");

        String expectedTitleWord= "Smile";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitleWord)){
            System.out.println("Amazon title contains Smile");
        }else{
            System.out.println("amazon title does not Smile and title verification has failed");
        }
        System.out.println("Actual title is ="+ actualTitle);
        driver.close();
    }
}
