package students.SanjayHR;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Lab02 {
    public static void main(String[] args) throws InterruptedException {
        //Task - 1
        //Open Chrome Browser
        //Go to https://www.facebook.com
        //Verify title: Expected: "Facebook - Log In or Sign Up"
        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();
        chrome.manage().window().maximize();
        chrome.get("https://www.facebook.com");
        String actualTitle=chrome.getTitle();
        System.out.println("actualTitle = "+actualTitle);
        String expectedTitle="Facebook - Log In or Sign Up";
        System.out.println("expectedTitle = "+expectedTitle);
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Facebook Title verification has passed");
        }else{
            System.out.println("Facebook Title verification has failed");
        }
        //Task - 2
        //Open Chrome Browser
        //Go to google
        //Navigate back
        //Navigate forward
        //Navigate to https://www.amazon.com
        //Verify title contains : Smile
        chrome.get("https://www.google.com");
        chrome.manage().window().maximize();
        chrome.navigate().back();
        Thread.sleep(5000);
        chrome.navigate().forward();
        Thread.sleep(5000);
        chrome.navigate().to("https://www.amazon.com");
        String actualTitle2=chrome.getTitle();
        System.out.println("actualTitle = "+actualTitle2);
        String expectedTitle2="Smile";
        System.out.println("expectedTitle = "+expectedTitle2);
        if(actualTitle2.contains(expectedTitle2)){
            System.out.println("Amazon Title verification has passed");
        }else{
            System.out.println("Amazon Title verification has failed");
        }
    }
}
