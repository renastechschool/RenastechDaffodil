package students.AliCanPazarcikli;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab03 {
    public static void main(String[] args) throws InterruptedException {
        /*
        TASK: Google search
1- Open a Chrome browser, 2- Go to: https://google.com
3- Write “apple” in search box, 4- Click google search button
5- Verify title:/Expected: Title should start with "apple" word
6-navigate back 7-write cherry in search box
8-verify title contains cherry.
         */
       WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("apple");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='Google Search']")).click();
        String expectedTitle1="apple";
        String actualTitle1=driver.getTitle();
        if (actualTitle1.startsWith(expectedTitle1)){
            System.out.println("Title verification has passed");
        }else{
            System.out.println("Title verification has failed");
        }
        System.out.println("Actual title is :"+ actualTitle1);
        Thread.sleep(2000);
        driver.navigate().back();
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("cherry");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='btnK']")).click();

        String expectedTitle2="cherry";
        String actualTitle2=driver.getTitle();
        if (actualTitle2.contains(expectedTitle2)){
            System.out.println("Title verification has passed");
        }else{
            System.out.println("Title verification has failed");
        }
        System.out.println("Actual title is :"+ actualTitle2);



        /*
        TASK2: Google Feeling lucky button
      1- Open a Chrome browser,  2- Go to: https://google.com
      3- Write "apple" in search box  ,4.click i am feeling lucky button
      5.Verify title contains Apple
         */


        WebDriver driver1 =new ChromeDriver();
        driver1.manage().window().maximize();
        driver1.get("https://google.com");
        driver1.findElement(By.cssSelector("input[name='q']")).sendKeys("apple");
        Thread.sleep(3000);
        driver1.findElement(By.xpath("//input[@name='btnI']")).click();

        String actualTitle3= driver1.getTitle();
        String expectedTitle3="Apple";
        if (actualTitle3.contains(expectedTitle3)){
            System.out.println("Title verification has passed.");
        }else{
            System.out.println("Title verification has failed.");
        }
        System.out.println("Actual title is : "+ actualTitle3);


       /* Task3
        1-go to https://opensource-demo.orangehrmlive.com/
        2-locate user name and send user name, (username=Admin)
        3-locate user password and send password (password=admin123)
        4-click on the login button

        */
        WebDriver driver2=new ChromeDriver();
        driver2.manage().window().maximize();
        driver2.get("https://opensource-demo.orangehrmlive.com/");
        driver2.findElement(By.xpath("//span[@class='form-hint'][1]")).click();
        driver2.findElement(By.id("txtUsername")).sendKeys("username=Admin");
        driver2.findElement(By.id("txtPassword")).click();
        driver2.findElement(By.cssSelector("input#txtPassword")).sendKeys("password=admin123");
        Thread.sleep(3000);
        driver2.findElement(By.cssSelector("input.button")).click();






    }
}
