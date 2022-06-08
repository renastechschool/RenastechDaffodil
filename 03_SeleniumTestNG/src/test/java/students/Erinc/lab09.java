package students.Erinc;

import code.utilities.BrowserUtils;
import code.utilities.WebDriverUtil;
import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class lab09 {
    // website: http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target
    // Test Scenario:
    /*          * 		Go to the above URL.
     * 		Get the current window’s handle and write to the console window. It must be the first window handle.
     * 		Locate the “Visit W3Schools.com!” link and click it.
     * 		Get all window handles and hold them in a list.
     * 		Get the current window’s handle and write to the console window. It must be a second window handle.
     * 		Check the upper left side logo in the second window.
     * 		Go back (Switch) to the first window.
     * 		Get the current window’s handle and write to the console window. It must be the first window handle.
     * 		Check the See Run Button Text. It must contain “Run >” text.
     */

    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
    }
    @Test
    public void TC1_WindowHandling(){

        System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle());
        driver.switchTo().frame("iframeResult");
        driver.findElement(By.linkText("Visit W3Schools.com!")).click();
        System.out.println("driver.getTitle() = " + driver.getTitle());
        BrowserUtils.wait(3);

        Set<String> allWindowHandling=driver.getWindowHandles();
        List<String > windowsList=new ArrayList<>(allWindowHandling);
        driver.switchTo().window(windowsList.get(1));
        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle());
        BrowserUtils.wait(3);

        WebElement W3Logo= driver.findElement(By.xpath("/html/body/div[3]/a[1]/i"));
        Assert.assertTrue(W3Logo.isDisplayed());
        BrowserUtils.wait(3);

        driver.switchTo().window(windowsList.get(0));
        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle());
        BrowserUtils.wait(3);

        WebElement runButton= driver.findElement(By.xpath("//button[@id='runbtn']"));
        System.out.println("runButton.getText() = " + runButton.getText());
        Assert.assertTrue(runButton.getText().equals("Run ❯"));




    }











}