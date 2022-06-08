package students.Sezar;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class lab03 {
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

        //1- Open a chrome browser
        WebDriver driver= WebDriverUtil.getDriver("chrome");
        //2- Go to: https://google.com
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        //3- Write “apple” in search box
        driver.findElement(By.name("q")).sendKeys("Apple");
        Thread.sleep(2000);
        //4- Click google search button
        driver.findElement(By.name("btnK")).click();
        //5- Verify title:
        //Expected: Title should start with "apple" word
        System.out.println("Title is =" + driver.getTitle());
        //6-navigate back
        driver.navigate().back();
        //7-write cherry in search box
        driver.findElement(By.name("q")).sendKeys("Cherry");
        Thread.sleep(2000);
        driver.findElement(By.name("btnK")).click();

        //8-verify title contains cherry.
        String expectedTitle="Cherry";
        String actualTitle=driver.getTitle();
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Cherry title verification has passed");
        }else {
            System.out.println("Cherry verification has failed");
        }
        System.out.println("actual title is =" + actualTitle);

        //TASK2: Google Feeling lucky button
        //1- Open a chrome browser
        //2- Go to: https://google.com
        //3- Write "apple" in search box
        //click i am feeling lucky button
        //Verify title contains Apple

        //1- Open a chrome browser
        //  WebDriver driver1=new ChromeDriver();
        //2- Go to: https://google.com
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        //3- Write "apple" in search box
        driver.findElement(By.name("q")).sendKeys("apple");
        //click i am feeling lucky button
        Thread.sleep(2000);
        driver.findElement(By.name("btnI")).click();
        //Verify title contains Apple
        String expectedTitle1="Apple";
        String actualTitle1=driver.getTitle();
        if (actualTitle1.contains(expectedTitle1)){
            System.out.println("Apple title verification has passed");
        }else {
            System.out.println("Apple verification has failed");
        }
        System.out.println("actual title is =" + actualTitle1);




        //go to https://opensource-demo.orangehrmlive.com/
        //locate user name and send user name, (username=Admin)
        //locate user password and send password (password=admin123)
        //click on the login button

        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();


    }
}

