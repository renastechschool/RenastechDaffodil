package students.Destyar;

import code.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab03Task1 {

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

    public static void main(String[] args) {


        //set up browser
        WebDriverManager.chromedriver().setup();
        WebDriver chrome = new ChromeDriver();
        //maximize window
        chrome.manage().window().maximize();
        //to go to chrome website
        chrome.get("https://google.com");
        BrowserUtils.wait(2);
        WebElement SearchBox= chrome.findElement(By.name("q"));
        BrowserUtils.wait(2);
        SearchBox.sendKeys("apple");
        WebElement SearchBotton=chrome.findElement(By.name("btnK"));
        SearchBotton.click();


        String ExpectedTitle = "apple";
        String ActualTitle = chrome.getTitle();
        if (ActualTitle.startsWith(ExpectedTitle)) {
            System.out.println("Actual title has passed and starts with  :" +ActualTitle);
        } else {
            System.out.println("Actual title has failed and starts with :" +ActualTitle);
        }

         chrome.navigate().back();
        BrowserUtils.wait(3);
        WebElement SearchBox1= chrome.findElement(By.name("q"));
        BrowserUtils.wait(2);

        chrome.findElement(By.name("q")).sendKeys("cherry");
        //chrome.findElement(By.xpath("//input[@class='gNO89b'][2])"));
        chrome.findElement(By.name("q")).sendKeys(Keys.ENTER);
        String ExpectedTitle1 = "cherry";
        String ActualTitle1 = chrome.getTitle();

        if (ActualTitle1.contains(ExpectedTitle1)) {
            System.out.println("Actual title has passed and contains : " +ActualTitle1);
        } else {
            System.out.println("Actual title has failed and contains : " +ActualTitle1);


        }
    }
}