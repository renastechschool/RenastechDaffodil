package students.EgeGunege;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab03 {
    public static void main(String[] args) throws InterruptedException {
        //Task-Google Search
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        Thread.sleep(4000);
        driver.findElement(By.name("q")).sendKeys("apple");
        driver.findElement(By.xpath("/html/body/div/div[3]/form/div/div/div[3]/center/input")).click();
        Thread.sleep(4000);
        String containTitle="apple";
        String actualTitle=driver.getTitle();
        boolean expected=actualTitle.startsWith(containTitle);
        if(expected){
            System.out.println("Title start with apple word");
        }else{
            System.out.println("Title does not start with apple word");
        }
       // GenericUtils.Stars();
        driver.navigate().back();
        Thread.sleep(3000);
        driver.findElement(By.name("q")).sendKeys("cherry");
        driver.findElement(By.xpath("/html/body/div/div[3]/form/div/div/div[3]/center/input")).click();
        Thread.sleep(3000);
        String containTitle2="cherry";
        String actualTitle2=driver.getTitle();
        boolean expected2=actualTitle2.contains(containTitle2);
        if(expected2){
            System.out.println("Title has cherry word");
        }else{
            System.out.println("Title does not have cherry word");
        }
        //GenericUtils.Stars();
        //Task2-Google Feeling Lucky Button
        driver.get("https://www.google.com");
        Thread.sleep(3000);
        driver.findElement(By.name("q")).sendKeys("apple");
        driver.findElement(By.xpath("/html/body/div/div[3]/form/div/div/div[3]/center/input[2]")).click();
        Thread.sleep(3000);
        String containTitle3="apple";
        String actualTitle3=driver.getTitle();
        boolean expected3=actualTitle3.startsWith(containTitle3);
        if(expected){
            System.out.println("Title start with apple word");
        }else{
            System.out.println("Title does not start with apple word");
        }
        //GenericUtils.Stars();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        Thread.sleep(2000);
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        Thread.sleep(2000);
        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(3000);
        driver.close();

    }
}
