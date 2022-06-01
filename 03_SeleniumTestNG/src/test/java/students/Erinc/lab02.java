package students.Erinc;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab02 {
    //TC #1: Facebook title verification
//Task - 1
//Open Chrome Browser
//Go to https://www.facebook.com
//Verify title: Expected: "Facebook - Log In or Sign Up"
//Task - 2
//Open Chrome Browser
//Go to google
//Navigate back
//Navigate forward
//Navigate to https://www.amazon.com
//Verify title contains : Smile

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        String actualTitle= driver.getTitle();
        String expectedTitle="Facebook - Log In or Sign Up";

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title has been verified");
        }else {
            System.out.println("Title has not been verified");
        }
        Thread.sleep(4000);

        driver.get("https://www.google.com");
        driver.navigate().back();
        Thread.sleep(4000);
        driver.navigate().forward();
        Thread.sleep(4000);
        driver.navigate().to("https://www.amazon.com");

        String actualTitle1= driver.getTitle();
        String expectedTitle2="Smile";

        if (actualTitle1.contains("Smile")){
            System.out.println("Title contains Smile");
        }else {
            System.out.println("Title does not contain Smile");
        }

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

        WebDriverManager.chromedriver().setup();
        WebDriver driver2=new ChromeDriver();
        driver2.get("https://www.etsy.com/");
        driver2.manage().window().maximize();
        if (driver2.getTitle().contains("Smile")){
            System.out.println("Verified, Title contains Smile");
        }else{
            System.out.println("Title does'nt contain Smile");
        }

        if (driver2.getCurrentUrl().equals("https://www.etsy.com/")){
            System.out.println("Verified current url");
        }else {
            System.out.println("Current url is not verified");
        }
        Thread.sleep(4000);
        driver2.get("https://www.amazon.com/");
        System.out.println("Title of Amazon is : "+driver2.getTitle() );
        if (driver2.getCurrentUrl().equals("https://www.amazon.com/")){
            System.out.println("Verified current url");
        }else {
            System.out.println("Current url is not verified");
        }
        Thread.sleep(4000);
        driver2.navigate().back();
        Thread.sleep(4000);
        driver2.navigate().refresh();
        Thread.sleep(4000);
        driver2.quit();






    }
}
