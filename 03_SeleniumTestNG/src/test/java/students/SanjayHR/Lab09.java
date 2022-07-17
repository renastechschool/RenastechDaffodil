package students.SanjayHR;


import code.utilities.BrowserUtils;
import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Lab09 {
/*website: http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target
Test Scenario:
* 		Go to the above URL.
* 		Get the current window’s handle and write to the console window. It must be the first window handle.
* 		Locate the “Visit W3Schools.com!” link and click it.
* 		Get all window handles and hold them in a list.
* 		Write to total window handle number to the console. It must be 2.
* 		Switch t the second window.
* 		Get the current window’s handle and write to the console window. It must be a second window handle.
* 		Check the upper left side logo in the second window.
* 		Go back (Switch) to the first window.
* 		Get the current window’s handle and write to the console window. It must be the first window handle.
* 		Check the See Run Button Text. It must contain “Run >” text.
* */
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
    }
    @Test
    public void TestCase1(){
        System.out.println("Current window handle is = " + driver.getWindowHandle());
        driver.switchTo().frame("iframeResult");
        WebElement w3Link=driver.findElement(By.xpath("//a[.='Visit W3Schools.com!']"));
        w3Link.click();
        Set<String> allWindowHandles=driver.getWindowHandles();
        List<String> windows=new ArrayList<>(allWindowHandles);
        System.out.println("Total number of windows is = "+windows.size());
        driver.switchTo().window(windows.get(1));
        System.out.println("Current window handle is = " + driver.getWindowHandle());

        WebElement w3Logo=driver.findElement(By.xpath("//i[@class='fa fa-logo']"));
        Assert.assertTrue(w3Logo.isDisplayed(),"Not displayed");
        driver.switchTo().window(windows.get(0));
        System.out.println("Current window handle is = " + driver.getWindowHandle());

        WebElement runButton=driver.findElement(By.xpath("//button[@id='runbtn']"));
        System.out.println(runButton.getText());
        if(runButton.getText().contains("Run ❯")){
            System.out.println("Verification passed");
        }else{
            System.out.println("Verification failed");
        }
    }
    @AfterMethod
    public void closeDriver(){
        BrowserUtils.wait(2);
        //driver.quit();
    }
}
