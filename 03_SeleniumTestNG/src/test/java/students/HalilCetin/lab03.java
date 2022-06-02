package students.HalilCetin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab03 {

public static void main(String[] args) throws InterruptedException {

    //TASK1: Google search

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
    //Maximize the window
    driver.manage().window().maximize();
    //Go to google
    driver.navigate().to("https://www.google.com/");
    //Write "apple" on google search bar.
    //I find google search box element using name locator
    WebElement searchBox=driver.findElement(By.name("q"));
    searchBox.sendKeys("apple");
    Thread.sleep(2000);
    //Click on Search Button
    WebElement searchButton=driver.findElement(By.name("btnK"));
    searchButton.click();
    Thread.sleep(2000);
    //Verify if title starts with title "apple"
    String expectedWord="apple", actualTitle=driver.getTitle();
    if (actualTitle.startsWith(expectedWord))
    {
        System.out.println("Title starts with " + expectedWord + ".");
    }else {
        System.out.println("Title doesn't starts with " + expectedWord + ".");
    }
    //navigate back
    driver.navigate().back();
    Thread.sleep(2000);
    //write cherry in the box
    searchBox=driver.findElement(By.name("q"));
    searchBox.sendKeys("cherry");
    Thread.sleep(2000);
    //click the search
    searchButton=driver.findElement(By.name("btnK"));
    searchButton.click();
    Thread.sleep(2000);
    //check if title contains "cherry"
    expectedWord="cherry";
    if (actualTitle.contains(expectedWord))
    {
        System.out.println("Title contains " + expectedWord + ".");
    }else {
        System.out.println("Title doesn't contain " + expectedWord + ".");
    }

    //TASK2: Google Feeling lucky button

    //1- Open a chrome browser
    //2- Go to: https://google.com
    //3- Write "apple" in search box
    //click i am feeling lucky button
    //Verify title contains Apple


    //click on the login button
    WebDriverManager.chromedriver().setup();
    WebDriver driver2=new ChromeDriver();
    //open web browser
    driver.navigate();
    Thread.sleep(2000);
    //navigate to the google
    driver2.navigate().to("https://google.com");
    Thread.sleep(2000);
    //write apple in search box
    WebElement searchBox2=driver2.findElement(By.name("q"));
    Thread.sleep(2000);
    searchBox2.sendKeys("apple");
    Thread.sleep(2000);
    //Click im feeling lucky button
    WebElement feelingLuckyButton=driver2.findElement(By.name("btnI"));
    feelingLuckyButton.click();
    Thread.sleep(2000);
    //Verify Title Contains Apple
    expectedWord="apple";
    if (actualTitle.contains(expectedWord))
    {
        System.out.println("Title contains " + expectedWord + ".");
    }else {
        System.out.println("Title doesn't contain " + expectedWord + ".");
    }
    driver.close();
    driver2.close();

    //go to https://opensource-demo.orangehrmlive.com/
    //locate user name and send user name, (username=Admin)
    //locate user password and send password (password=admin123)

    WebDriverManager.chromedriver().setup();
    WebDriver driver3=new ChromeDriver();
    //go to https://opensource-demo.orangehrmlive.com/
    driver3.navigate().to("https://opensource-demo.orangehrmlive.com/");
    Thread.sleep(2000);
    //locate user name and send user name, (username=Admin)
    WebElement userNameBox=driver3.findElement(By.name("txtUsername"));
    userNameBox.sendKeys("Admin");
    Thread.sleep(2000);
    //locate user password and send password (password=admin123)
    WebElement passBox=driver3.findElement(By.name("txtPassword"));
    passBox.sendKeys("admin123");
    Thread.sleep(2000);
    //Click on Log In button
    WebElement logInButton=driver3.findElement(By.name("Submit"));
    logInButton.click();
    Thread.sleep(2000);




}
}
