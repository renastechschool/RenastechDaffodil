package students.Ulzana;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab2 {
    public static void main(String[] args) throws InterruptedException {

//TC #1: Facebook title verification
//Task - 1
//Open Chrome Browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

//Go to https://www.facebook.com
         driver.get("https://www.facebook.com");
         Thread.sleep(3000);

         String expectedTittle="Facebook - Log In or Sign Up";
         String actualTitle=driver.getTitle();

//Verify title: Expected: "Facebook - Log In or Sign Up"
         if(actualTitle.equals(expectedTittle))  {
             System.out.println("Facebook  title verification has passed");}
         else { System.out.println("Facebook  title verification has failed");}



//Task - 2
//Open Chrome Browser
//Go to google
        driver.navigate().to("https://www.google.com");
         Thread.sleep(3000);
//Navigate back
        driver.navigate().back();

//Navigate forward
        driver.navigate().forward();

//Navigate to https://www.amazon.com
        driver.navigate().to("https://www.amazon.com");

//Verify title contains : Smile
        String titleContain="Smile";
        String title=driver.getTitle();

//Verify title
        if(title.contains(titleContain))  {
            System.out.println("Smile contains in TITLE *** verification has passed *** ");}
        else { System.out.println("Smile DOES NOT contains in TITLE  *** verification has failed ***");}



//   Second Task:
// Go to https://www.etsy.com/
         driver.navigate().to("https://www.etsy.com/");

// Maximize window
        driver.manage().window().maximize();

// Verify title doesnt contains "Smile"
        String titleContain1="Smile";
        String title1=driver.getTitle();


//Verify title
        if(title1.contains(titleContain1))  {
            System.out.println("Smile contains in TITLE   -------  verification has failed");}
        else { System.out.println("Smile DOES NOT contains in TITLE  -------  verification has passed");}

// Verify Current Url
// Go to https://www.amazon.com/
         driver.navigate().to("https://www.amazon.com/");

// Verify title
        String expectedTitle4="Amazon.com. Spend less. Smile more.";
        String actualTitle4=driver.getTitle();


        if (actualTitle4.equals(expectedTitle4)){
            System.out.println("AMAZON title verification has passed");}
         else { System.out.println("AMAZON title verification has failed");}

// Verify Current Url
        String expectedUrl="https://www.amazon.com/";
        String actualUrl=driver.getCurrentUrl();

        if (actualUrl.equals(expectedUrl)){
            System.out.println("AMAZON URL verification has passed");}
        else { System.out.println("AMAZON URL verification has failed");}
        Thread.sleep(4000);
// Navigate Back
        driver.navigate().back();
        Thread.sleep(4000);

// Refresh
        driver.navigate().refresh();

// Quit browser

        driver.close();
        Thread.sleep(4000);

    }
}