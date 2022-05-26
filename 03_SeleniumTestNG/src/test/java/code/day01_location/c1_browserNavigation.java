package code.day01_location;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c1_browserNavigation {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        System.out.println("titele is ="+driver.getTitle());
        System.out.println("current URL ="+driver.getCurrentUrl());
        Thread.sleep(2000 );

        driver.get("https://www.tesla.com/");

        String expectedTitle="Google";
        String actualTitle=driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Google title verification has passed");
        }else {
            System.out.println("Google title verification has failed");


        }
        System.out.println("actual title is ="+actualTitle);
        driver.close();






    }

}
