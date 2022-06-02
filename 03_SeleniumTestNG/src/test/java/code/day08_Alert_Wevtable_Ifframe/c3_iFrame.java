package code.day07_;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class c3_iFrame {
    //1- Open a chrome browser
//2- Go to:http://the-internet.herokuapp.com/iframe
//3- Switching by id or name attribute value.

    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = WebDriverUtil.getDriver("chrome");
        driver.get("http://the-internet.herokuapp.com/iframe");
    }
    @Test
    public void TC1_Swithching(){
        driver.switchTo().frame("mce_0_ifr");

        WebElement MassageBox=driver.findElement(By.id("tinymce"));
        MassageBox.clear();
        MassageBox.sendKeys("Hello World");

        driver.switchTo().defaultContent();


    }

}
