package students.Oscar;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class lab02 {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        String expectedTitle = "Facebook - log in or sign up";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle, "title verification has failed");
        //driver.quit();
        Thread.sleep(3000);
        driver.get("https://www.google.com");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().forward();
        Thread.sleep(1000);
        driver.get("https://www.amazon.com");
        String titleContains = "Smile";
        String secondTitle = driver.getTitle();
        System.out.println(secondTitle);
        Assert.assertTrue(secondTitle.contains(titleContains), "Title does not contain smile");
        Thread.sleep(3000);
        driver.get("https://www.etsy.com/");
        String currentURL = driver.getCurrentUrl();
        System.out.println("Your current URL is " + currentURL);
        String thirdTitleContains = "Smile";
        String actualThirdTitle = driver.getTitle();
        System.out.println(actualThirdTitle);
        Assert.assertFalse(actualThirdTitle.contains(thirdTitleContains), "Title does contain smile");

        Thread.sleep(3000);
        driver.get("https://www.amazon.com/");
        String fourthTitleContains = "Smile";
        String actualFourthTitle = driver.getTitle();
        System.out.println(actualFourthTitle);
        Assert.assertTrue(actualFourthTitle.contains(fourthTitleContains), "Title does not contain smile");
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().refresh();
        Thread.sleep(1000);
        driver.quit();

    }


}
