package students.Erinc;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class lab05 {

    //Go to Amazon
//enter Desk in search box
//Then search for desks
//(Use this task with TestNG framework)
    WebDriver driver;
   @BeforeMethod
   public void setUp(){
      driver= WebDriverUtil.getDriver("chrome");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.get("https://www.amazon.com");
   }
   @Test
   public void  TC1(){
      System.out.println("TC1 is running");
      WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
      searchBox.sendKeys("desks", Keys.ENTER);


   }
   @AfterMethod
   public void closing(){
      driver.quit();
   }

}
