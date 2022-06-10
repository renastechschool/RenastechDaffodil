package students.Gulistan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//Go to Amazon
//enter Desk in search box
//Then search for desks
//(Use this task with TestNG framework)
public class lab05 {

    @Test
    public void TC1() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Desks");
        driver.findElement(By.id("nav-search-submit-button")).click();
        Thread.sleep(1000);
        driver.close();



    }

    }


