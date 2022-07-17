package students.Suleyman;

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

public class task09 {

//    website: http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target
//    Test Scenario:
//            * 		Go to the above URL.
//* 		Get the current window’s handle and write to the console window. It must be the first window handle.
//* 		Locate the “Visit W3Schools.com!” link and click it.
//            * 		Get all window handles and hold them in a list.
//            * 		Write to total window handle number to the console. It must be 2.
//            * 		Switch t the second window.
//* 		Get the current window’s handle and write to the console window. It must be a second window handle.
//* 		Check the upper left side logo in the second window.
//            * 		Go back (Switch) to the first window.
//            * 		Get the current window’s handle and write to the console window. It must be the first window handle.
//* 		Check the See Run Button Text. It must contain “Run >” text.

    WebDriver driver;

    @BeforeMethod
    public void setup(){

        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");

    }
    @Test
    public void TC1() throws InterruptedException {

        driver.getWindowHandle();
        driver.findElement(By.id("iframeResult"));
        driver.switchTo().frame("iframeResult");
        Thread.sleep(5000);
        WebElement link=driver.findElement(By.linkText("Visit W3Schools.com!"));
        link.click();

        Set<String> allWindowsHandles=driver.getWindowHandles();
        List<String>windowsList=new ArrayList<>(allWindowsHandles);

        driver.switchTo().window(windowsList.get(1));
        driver.getWindowHandle();

        WebElement Logo= driver.findElement(By.xpath("//i[@class='fa fa-logo']"));
        Assert.assertTrue(Logo.isDisplayed(),"Logo is not displayed.");
        driver.switchTo().window(windowsList.get(0));
        driver.getWindowHandle();

        WebElement runButton=driver.findElement(By.id("runbtn"));
        runButton.getText();

        Assert.assertFalse(runButton.getText().contains("Run >"),"it contains the Run >' text");
    }
}
