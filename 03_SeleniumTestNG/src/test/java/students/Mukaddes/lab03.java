package students.Mukaddes;

import code.utilities.WebDriverUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        Thread.sleep(2000);
        driver.findElement(By.name("q")).sendKeys("apple");
        Thread.sleep(2000);
        WebElement serarchButton = driver.findElement(By.className("wM6W7d"));
        serarchButton.click();

        String expectedTitle = "apple";
        String actualTitle = driver.getTitle();
        if (actualTitle.startsWith(expectedTitle)) {
            System.out.println("Title verification has passed");
        } else {
            System.out.println("Title verification has failed");
        }
        driver.navigate().back();
        driver.findElement(By.name("q")).sendKeys("cherry");
        String expectedTitle1 = "cherry";
        String actualTitle1 = driver.getTitle();
        if (actualTitle1.contains(expectedTitle1)) {
            System.out.println("Title verification has passed ");
        } else {
            System.out.println("Title verification has failed");

            //TASK2: Google Feeling lucky button
//1- Open a chrome browser
//2- Go to: https://google.com
//3- Write "apple" in search box
//click i am feeling lucky button
//Verify title contains Apple
            WebDriver driver2 = WebDriverUtil.getDriver("chrome");
            driver.get("https://google.com");
            driver.findElement(By.name("q")).sendKeys("apple");
            WebElement searchButton = driver.findElement(By.name("btnI"));
            searchButton.click();
            String expectedTitle2 = "Apple";
            String actualTitle2 = driver.getTitle();
            if (actualTitle.contains(expectedTitle)) {
                System.out.println("Title verification has passed");
            } else {
                System.out.println("Title verification has passed");
            }
        }


                //go to https://opensource-demo.orangehrmlive.com/
//locate user name and send user name, (username=Admin)
//locate user password and send password (password=admin123)
//click on the login button
                WebDriver driver3 = WebDriverUtil.getDriver("chrome");
                driver3.get("https://opensource-demo.orangehrmlive.com/");

                Thread.sleep(2000);
                driver3.findElement(By.name("txtUsername")).sendKeys("admin");
                driver3.findElement(By.name("txtPassword")).sendKeys("admin123");
                Thread.sleep(2000);
                WebElement logIn = driver3.findElement(By.name("Submit"));
                logIn.click();

            }

        }










