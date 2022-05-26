package students.Kobraazizi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab_03 {
    public static void main(String[] args) throws InterruptedException {
        //TASK: Google search
//1- Open a chrome browser
//2- Go to: https://google.com
//3- Write “apple” in search box
//4- Click google search button
//5- Verify title:
//Expected: Title should start with "apple" word
//6-navigate back
//7-write cherry in search box
//8-verify title contains cherry.
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" https://google.com");
        driver.findElement(By.name("q")).sendKeys("apple");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@value='Google Search']")).click();
        String expectedTitle="apple";
        String actualTitle=driver.getTitle();
        if(actualTitle.startsWith(expectedTitle)){
            System.out.println(" title verification has passed");
        }else {
            System.out.println(" title verification has failed");
        }
        System.out.println("Actual title is ="+actualTitle);
        driver.close();
        Thread.sleep(4000);
        driver.navigate().back();

        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("cherry");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@name='btnK']")).click();
        String expectedTitle1="cherry";
        String actualTitle1=driver.getTitle();
        if(expectedTitle1.startsWith(actualTitle1)){
            System.out.println(" title verification has passed");
        }else {
            System.out.println(" title verification has failed");
        }
        System.out.println("Actual title is ="+actualTitle1);



    }
}
