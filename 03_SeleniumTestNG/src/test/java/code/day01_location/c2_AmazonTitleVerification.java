package code.day01_location;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c2_AmazonTitleVerification {
    public static void main(String[] args) throws InterruptedException {
        //TASK: Google search
//1- Open a chrome browser
//2- Go to: https://google.com
//3- Write "orange" in search box
//4- Click google search button
//5- Verify title:
//Expected: Title should start with "orange" word
//6-navigate back
//7-write banana in search box
//8-verify title contains banana.
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //1- Open a chrome browser
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        Thread.sleep(4000);
        driver.navigate().back();
        Thread.sleep(4000);
        driver.navigate().forward();
        Thread.sleep(4000);
       driver.navigate().to("https://www.amazon.com/");
       String expectedTitle="Smile";
       String actualTitle=driver.getTitle();
        CharSequence expectedTitleWord = null;
        if (actualTitle.contains(expectedTitleWord)){
            System.out.println("Amazon title containes Smile");

       }else {
            System.out.println("Amazon title does not containes Smile");
        }
        System.out.println("Actual title is ="+actualTitle);
        driver.close();












    }
}
