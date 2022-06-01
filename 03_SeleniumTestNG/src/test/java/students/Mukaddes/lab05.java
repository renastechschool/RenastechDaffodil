package students.Mukaddes;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class lab05 {
    //Go to Amazon
//enter Desk in search box
//Then search for desks
//
// (Use this task with TestNG framework)
    @Test
    public void testing(){
        WebDriver driver= WebDriverUtil.getDriver("chrome");
        driver.get("https://www.amazon.com/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Desks");
        driver.findElement(By.id("nav-search-submit-button")).click();


    }

}
