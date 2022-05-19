package students.Ozgur;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
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

 //   Second Task:
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


        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        String expectedTitle="Facebook - Log In or Sign Up";
        String actualTitle=driver.getTitle();
        if(actualTitle.equals(expectedTitle)) {
            System.out.println("It matches,passed");
        }else System.out.println("It does not match,failed");

        Thread.sleep(3000);
        driver.navigate().to("https://www.google.com");
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().to("https://www.amazon.com");
        String title2= driver.getTitle();
        String expectedTitle2="Smile";
        if(title2.contains(expectedTitle2)) {
            System.out.println("It contains,passed");
        }else System.out.println("It does not contain,failed");

        driver.navigate().to("https://www.etsy.com/");
        driver.manage().window().maximize();
        String actualTitle3=driver.getTitle();
        String unexpectedTitle="Smile";
        if(actualTitle3.contains(unexpectedTitle)){
            System.out.println("It contains,failed");}
        else
            System.out.println("It does not contain unexpectedTitle,passed");
        String expectedUrl="https://www.etsy.com/";
        String currentURl=driver.getCurrentUrl();
        if(expectedUrl.equals(currentURl)){
            System.out.println("It matches,passed");}
        else System.out.println("It does not match,failed");

        Thread.sleep(3000);

        driver.navigate().to("https://www.amazon.com/");

        String expectedTitle4="Amazon.com. Spend less. Smile more.";
        String actualTitle4=driver.getTitle();


        if(actualTitle4.equals(expectedTitle4)) {
            System.out.println("It matches,passed");
        }else System.out.println("It does not match,failed");

       String currentURl2=driver.getCurrentUrl();
       String expectedUrl2=driver.getCurrentUrl();

        if(expectedUrl2.equals(currentURl2)){
            System.out.println("It matches,passed");}
        else System.out.println("It does not match,failed");


        driver.navigate().back();
        driver.navigate().refresh();
        driver.quit();

    }

        }



