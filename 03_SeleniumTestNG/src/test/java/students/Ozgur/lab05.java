package students.Ozgur;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class lab05 {
    //Go to Amazon
//enter Desk in search box
//Then search for desks
//(Use this task with TestNG framework)

    WebDriver driver;
    @BeforeMethod
     public void luch(){

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
    }

    @Test
    public void test(){
        driver.findElement(By.xpath("//input[contains(@id,'twot')]")).sendKeys("desk");
        driver.findElement(By.xpath("//input[contains(@id,'nav-search')]")).click();

    }


}
