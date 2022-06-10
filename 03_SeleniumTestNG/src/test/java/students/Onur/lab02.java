package students.Onur;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab02 {
    public static void main(String[] args) throws InterruptedException {
        task1();
        task2();
    }

    public static void task1() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver1 = new ChromeDriver();
        driver1.manage().window().maximize();
        Thread.sleep(2000);
        driver1.get("https://www.facebook.com");
        String expectedTitle = "Facebook - Log In or Sign Up";
        String actualTitle = driver1.getTitle();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Facebook title verification has passed");
        } else {
            System.out.println("Facebook title verification has failed");
            System.out.println("Actual title is = " + actualTitle);
        }
        driver1.close();
    }

    public static void task2() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver2 = new ChromeDriver();
        driver2.manage().window().maximize();
        Thread.sleep(2000);
        driver2.get("https://www.google.com");
        Thread.sleep(2000);
        driver2.navigate().back();
        Thread.sleep(2000);
        driver2.navigate().forward();
        Thread.sleep(2000);
        driver2.navigate().to("https://www.amazon.com");
        boolean expectedTitleWord = driver2.getTitle().contains("Smile");
        if (expectedTitleWord) {
            System.out.println("Amazon title contains Smile and title verification has passed");
        } else {
            System.out.println("Amazon title does not contain Smile and title verification has failed");
        }
        driver2.close();
    }
}
