package students.HaticeKarakoyun;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab03 {

    //TASK: Google search
//1- Open a Chrome browser
//2- Go to: https://google.com
//3- Write “apple” in search box
//4- Click google search button
//5- Verify title:
//Expected: Title should start with "apple" word
//6-navigate back
//7-write cherry in search box
//8-verify title contains cherry.



//TASK2: Google Feeling lucky button
//1- Open a Chrome browser
//2- Go to: https://google.com
//3- Write "apple" in search box
//click i am feeling lucky button
//Verify title contains Apple

//go to https://opensource-demo.orangehrmlive.com/
//locate username and send username, (username=Admin)
//locate user password and send password (password=admin123)
//click on the login button

    public static void main(String[] args) throws InterruptedException {
        //1- Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //2- Go to: https://google.com
        Thread.sleep(400);
        driver.get("https://google.com");

        //3- Write “apple” in search box
        WebElement searchBox=driver.findElement(By.name("q"));
        searchBox.sendKeys("apple");
        Thread.sleep(4000);

        //4- Click google search button
        WebElement searchButton=driver.findElement(By.name("btnK"));
        searchButton.click();

        //5- Verify title:
        //Expected: Title should start with "apple" word
        String expectedTitle="apple";
        String actualTitle=driver.getTitle();
        if(actualTitle.startsWith(expectedTitle)){
            System.out.println("Title verification has passed");
        }else {
            System.out.println("Title verification has failed");
        }
        System.out.println("actual title is="+actualTitle);

        //6-navigate back
        driver.navigate().back();

        //7-write cherry in search box
        driver.findElement(By.name("q")).sendKeys("cherry");
        Thread.sleep(3000);
        searchButton.click();

        //8-verify title contains cherry.
        // 8-verify title contains cherry.
        String expectedTitle1 ="cherry";
        String actualTitle1 =driver.getTitle();

        if(actualTitle1.startsWith(expectedTitle1)){
            System.out.println("Title verification has passed");}
        else {  System.out.println("Title verification has failed");}


        //TASK2: Google Feeling lucky button
// 1- Open a chrome browser
// 2- Go to: https://google.co
        driver.navigate().back();
// 3- Write "apple" in search box
        searchBox.sendKeys("apple");
// click i am feeling lucky button
        driver.findElement(By.name("btnI")).click();

// Verify title contains Apple
        String expectedTitle2="Apple";
        String actualTitle2=driver.getTitle();
        if(actualTitle2.contains(expectedTitle2)){
            System.out.println("Title verification has passed");}
        else {  System.out.println("Title verification has failed");}

//go to https://opensource-demo.orangehrmlive.com/
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
// locate user name and send user name, (username=Admin)
        WebElement login=driver.findElement(By.id("txtUsername"));
        login.sendKeys("Admin");
// locate user password and send password (password=admin123)
        WebElement pass=driver.findElement(By.id("txtPassword"));
        pass.sendKeys("admin123");

// click on the login button
        driver.findElement(By.name("Submit")).click();






    }
}
