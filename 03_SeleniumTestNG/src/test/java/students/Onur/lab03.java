package students.Onur;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab03 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://google.com");
        WebElement SearchBox= driver.findElement(By.name("q"));
        Thread.sleep(2000);
        SearchBox.sendKeys("Apple");
        Thread.sleep(2000);
        WebElement SearchButton=driver.findElement(By.name("btnK"));
        SearchButton.click();
        Thread.sleep(2000);
        String expectedTitle="Apple";
        String actualTitle= driver.getTitle();

        if (actualTitle.startsWith(expectedTitle)){
            System.out.println("Verification has been passed");
        }else{
            System.out.println("Verification has been failed");
        }
        System.out.println("Actual Title = " + actualTitle);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(By.name("q")).sendKeys("cherry");
        Thread.sleep(2000);
        driver.findElement(By.name("btnK")).click();
        String expectedTitle2="cherry";
        String actualTitle2= driver.getTitle();

        if (actualTitle2.contains(expectedTitle2)){
            System.out.println("verification has been passed");
        }else{
            System.out.println("verification has been failed");
        }
        System.out.println("Actual Title2 = " + actualTitle2);
        driver.navigate().to("https://google.com");
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Apple");
        Thread.sleep(200);
        driver.findElement(By.name("btnI")).click();
        String expectedTitle3="Apple";
        String actualTitle3= driver.getTitle();
        if (actualTitle3.contains(expectedTitle3)){
            System.out.println("verification has been passed");
        }else{
            System.out.println("verification has been failed");
        }
        System.out.println("Actual Title3 = " + actualTitle3);

        driver.get("https://opensource-demo.orangehrmlive.com/");
        Thread.sleep(2000);

        driver.findElement(By.id("txtUsername")).sendKeys("Number");

        Thread.sleep(2000);
        driver.findElement(By.id("txtPassword")).sendKeys("123");
        Thread.sleep(2000);
        driver.findElement(By.name("Submit")).click();
    }
}
