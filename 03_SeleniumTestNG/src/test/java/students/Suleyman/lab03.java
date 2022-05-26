package students.Suleyman;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab03 {

    // Go to https://www.etsy.com/
    // Maximize window
    // Verify title doesnt contains "Smile"
    // Verify Current Url
    // Go to https://www.amazon.com/
    // Verify title
    // Verify Current Url
    // Navigate Back
    // Refresh
    // Quit browser

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.etsy.com/");
        driver.manage().window().maximize();
        String title= driver.getTitle();

        Thread.sleep(4000);

        String expectedTitleContain="Smile";
        String actualTitleContain=driver.getTitle();

      if (actualTitleContain.contains(expectedTitleContain)){
          System.out.println("Title Verification has Passed");
      }else {
          System.out.println("Title verification has Failed");
      }
        System.out.println("Title is : "+ driver.getTitle());
        System.out.println("URl : "+ driver.getCurrentUrl());


        WebDriverManager.chromedriver().setup();
        WebDriver driver1=new ChromeDriver();
        driver1.get("https://www.amazon.com/");
        driver1.getTitle();
        driver1.getCurrentUrl();
        driver1.navigate().back();

        Thread.sleep(4000);

        driver1.navigate().refresh();

        Thread.sleep(4000);

        driver1.quit();

    }

}
