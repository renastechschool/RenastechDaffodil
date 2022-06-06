package students.Yousef;

import code.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class lab_05 {


    //Go to Amazon
    //enter Desk in search box
//Then search for desks(Use this task with TestNG framework)


    WebDriver driver;
    @BeforeMethod
    public void setup(){

        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        BrowserUtils.wait(5);


    }

    @Test
    public void TC1(){
        driver.get("https://www.amazon.com/");
        WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("desks"+ Keys.ENTER);


    }
}
