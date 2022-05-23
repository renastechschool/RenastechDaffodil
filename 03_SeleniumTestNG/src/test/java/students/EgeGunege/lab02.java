package students.EgeGunege;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab02 {
    public static void main(String[] args) throws InterruptedException {
        //Task-1
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        Thread.sleep(3000);
        driver.get("https://www.facebook.com");
        Thread.sleep(3000);
        String expectedTitle="Facebook - Log In or Sign Up";
        String actualTitle=driver.getTitle();
        if(actualTitle.equalsIgnoreCase(expectedTitle)){
            System.out.println("Title as expected");
        }else{
            System.out.println("Title is not as expected");
        }
        Thread.sleep(3000);
        System.out.println("Actual Title: "+actualTitle);
        //Task-2
        driver.get("https://www.google.com");
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(3000);
        String containTitle="Smile";
        String actualTitle2=driver.getTitle();
        if (actualTitle2.contains(containTitle)){
            System.out.println("Amazon title contains Smile and title verification has passed");
        }else {
            System.out.println("Amazon title does not contains Smile and title verification has failed");
        }
        //code.MyUtils.GenericUtils.Stars();
        //Task2-1
        String expectedURL="https://www.etsy.com/";
        driver.get(expectedURL);
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        String notIncludeWord="Smile";
        String actualTitle3=driver.getTitle();
        boolean contains=!(actualTitle3.contains(notIncludeWord));
        if (contains){
            System.out.println("Etsy title does not contain Smile");
        }else {
            System.out.println("Etsy title contain Smile");
        }
        boolean verifyURL=expectedURL.equals(driver.getCurrentUrl());
        if (verifyURL){
            System.out.println("Etsy URL verify has passed");
        }else {
            System.out.println("Etsy URL verify has failed");
        }
        String expectedURL2="https://www.amazon.com/";
        String expectedTitle2="Amazon.com. Spend less. Smile more.";
        driver.get(expectedURL2);
        Thread.sleep(3000);
        String actualTitle4=driver.getTitle();
        String actualURL=driver.getCurrentUrl();
        boolean title=expectedTitle2.equals(actualTitle4);
        boolean URL=expectedURL2.equals(actualURL);
        if (title&&URL){
            System.out.println("Amazon URL and title verification has passed");
        }else {
            System.out.println("Amazon URL and title verification has failed");
        }
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.close();
    }
}
