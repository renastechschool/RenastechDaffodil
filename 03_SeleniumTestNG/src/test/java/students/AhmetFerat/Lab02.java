package students.AhmetFerat;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

public class Lab02 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(4000);
        String expected = "Facebook - log in or sign up";
        String actual = driver.getTitle();
        System.out.println(expected);
        System.out.println(actual);
        boolean result = Objects.equals(actual, expected);
        if (result) {
            System.out.println("Verified. Title is matching with the expected result.");
        } else {
            System.out.println("Verification failed. Title is not matching with the expected result.");
        }
        driver.close();
        System.out.println("---------------------------------------------------------------------------");

        WebDriver driver1 = new ChromeDriver();
        driver1.get("https://www.google.com");
        WebElement searchBox = driver1.findElement(By.name("q"));
        searchBox.sendKeys("existentialcrisis");
        Thread.sleep(4000);
        WebElement searchButton = driver1.findElement(By.name("btnK"));
        searchButton.click();
        driver1.navigate().back();
        Thread.sleep(4000);
        driver1.navigate().forward();
        Thread.sleep(4000);
        driver1.navigate().to("https://www.amazon.com");

        String expected1 = "Smile";
        String actual1 = driver1.getTitle();
        boolean result1 = actual1.contains(expected1);
        if (result1) {
            System.out.println("Verified. Title contains the expected result.");
        } else {
            System.out.println("Verification failed. Title does not the expected result.");
        }
        driver1.close();
        System.out.println("--------------------------------------------------------------------------------");

        WebDriver driver2 = new ChromeDriver();
        driver2.get("https://www.etsy.com/");
        driver2.manage().window().maximize();
        String expected2 = "Smile";
        String actual2 = driver2.getTitle();
        boolean result2 = actual2.contains(expected2);
        if (result2) {
            System.out.println("Verified. Title contains the expected result.");
        } else {
            System.out.println("Verification failed. Title does not the expected result.");
        }
        String expected3 = "https://www.etsy.com/";
        String actual3 = driver2.getCurrentUrl();
        boolean result3 = Objects.equals(actual3, expected3);
        if (result3) {
            System.out.println("Verified. The URL is matching with the expected result.");
        } else {
            System.out.println("Verification failed. The URL is not matching with the expected result.");
        }
        Thread.sleep(4000);
        driver2.get("https://www.amazon.com");
        String expected4 = "Amazon.com. Spend less. Smile more.";
        String actual4 = driver2.getTitle();
        boolean result4 = Objects.equals(actual4, expected4);
        if (result4) {
            System.out.println("Verified. The title is matching with the expected result.");
        } else {
            System.out.println("Verification failed. The title is not matching with the expected result.");

        }
        String expected5="https://www.amazon.com/";
        String actual5=driver2.getCurrentUrl();
        boolean result5= Objects.equals(actual5, expected5);
        if (result5){
            System.out.println("Verified. The title is matching with the expected result.");
        }
        else{
            System.out.println("Verification failed. The title is not matching with the expected result.");

        }
        driver2.navigate().back();
        Thread.sleep(4000);
        driver2.navigate().refresh();
        Thread.sleep(4000);
        driver2.close();

    }
}

