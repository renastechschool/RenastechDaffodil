package students.Aslihan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab02_Second {
    //Second Task:
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
        WebDriver driver1=new ChromeDriver();
        driver1.navigate().to("https://www.etsy.com/");
        driver1.manage().window().maximize();

        String actualTitle=driver1.getTitle();
        String unExpectedTitle= String.valueOf(actualTitle.contains("Smile"));

        if (!unExpectedTitle.equals(actualTitle)){
            System.out.println("Etsy title does not contain Smile and title verification has passed");
        }else{
            System.out.println("Etsy title contains Smile and title verification has failed");
            System.out.println("Actual title is " + actualTitle);
        }
        String expectedUrl="https://www.etsy.com/";
        String currentUrl=driver1.getCurrentUrl();

        boolean compareUrls=expectedUrl.equals(currentUrl);
        System.out.println("Current url verify has passed --> "+ compareUrls);
        System.out.println("Current URL is " + currentUrl);
        Thread.sleep(2000);

        driver1.get("https://www.amazon.com/");
        String expectedTitle2="Amazon.com. Spend less. Smile more.";
        String actualTitle2= driver1.getTitle();

        if (expectedTitle2.equals(actualTitle2)){
            System.out.println("Title verification has passed");
        }else{
            System.out.println("Title verification has failed");
        }
        String expectedUrl2="https://www.amazon.com/";
        String currentUrl2=driver1.getCurrentUrl();

        boolean compareUrls2=expectedUrl2.equals(currentUrl2);
        System.out.println("Current url verify has passed --> "+ compareUrls2);
        System.out.println("Current URL is " + currentUrl2);
        Thread.sleep(2000);

        driver1.navigate().back();
        driver1.navigate().refresh();
        driver1.quit();
    }
}
