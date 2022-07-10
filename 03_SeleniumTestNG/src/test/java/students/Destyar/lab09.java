package students.Destyar;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class lab09 {

    //website: http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target
//Test Scenario:
//Go to the above URL.
//Get the current window’s handle and write to the console window. It must be the first window handle.
//Locate the “Visit W3Schools.com!” link and click it.
//Get all window handles and hold them in a list.
//Write to total window handle number to the console. It must be 2.
//Switch to the second window.
//* Get the current window’s handle and write to the console window.It must be a second window handle.
//Check the upper left side logo in the second window.
//Go back (Switch) to the first window.
//Get the current window’s handle and write to the console window.It must be the first window handle.
//Check the See Run Button Text. It must contain “Run >” text.

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        //Go to the above URL.
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
    }
    @Test
    public void TC1() throws InterruptedException {
        //Get the current window’s handle and write to the console window. It must be the first window handle.
        System.out.println("current window handle is " + driver.getWindowHandle());
        Thread.sleep(3000);
        //Locate the “Visit W3Schools.com!” link and click it.
        driver.findElement(By.id("iframeResult"));
        driver.switchTo().frame("iframeResult");
        WebElement link=driver.findElement(By.linkText("Visit W3Schools.com!"));
        link.click();
        //Get all window handles and hold them in a list
        Set<String> AllWindowHandles= driver.getWindowHandles();
        List<String> WindowsList=new ArrayList<>(AllWindowHandles);
        System.out.println("Number of windows : " +WindowsList.size());

        driver.switchTo().window(WindowsList.get(1));
        System.out.println("Window handle is : "+driver.getWindowHandle());

        WebElement logo=driver.findElement(By.xpath("//i[@class='fa fa-logo']"));
        Assert.assertTrue(logo.isDisplayed(),"logo not displayed");

        driver.switchTo().window(WindowsList.get(0));
        System.out.println("current window : "+driver.getWindowHandle());

        WebElement runBotton=driver.findElement(By.id("runbtn"));
        System.out.println(runBotton.getText());
        Assert.assertFalse(runBotton.getText().contains("Run >"),"contains 'Run >' text");




    }

}




