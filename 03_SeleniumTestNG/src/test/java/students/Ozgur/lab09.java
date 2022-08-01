package students.Ozgur;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.reporters.jq.Main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class lab09 {
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


    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //Go to the above URL.
        driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
        //Get the current window's handle and write to the console window. It must be the first window handle.

        System.out.println(driver.getWindowHandle());
        // String expectedUrl="https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target";
        // String actualURL=driver.getCurrentUrl();
        // Assert.assertEquals(actualURL,expectedUrl,"url did not match");
        //Locate the "Visit W3Schools.com!" link and click it.
        // driver.findElement(By.linkText("Visit W3Schools.com!"));
        driver.switchTo().frame("iframeResult");
        WebElement link = driver.findElement(By.linkText("Visit W3Schools.com!"));
        link.click();
        // Get all window handles and hold them in a list.
        Set<String> allWindowsHandles = driver.getWindowHandles();
        Iterator<String> itr = allWindowsHandles.iterator();
        String parentID = itr.next();
        String childId = itr.next();
        driver.switchTo().window(childId);
        System.out.println(driver.getWindowHandle());

        // Check the upper left side logo in the second window.
        WebElement logo = driver.findElement(By.xpath("//i[@class='fa fa-logo']"));
        Assert.assertTrue(logo.isDisplayed(), "logo is not visible");
        //Go back (Switch) to the first window.
        driver.switchTo().window(parentID);
        //Get the current window's handle and write to the console window. It must be the first window handle.
        System.out.println(driver.getWindowHandle());

        //Check the See Run Button Text. It must contain "Run >" text.
        WebElement runBtn = driver.findElement(By.id("runbtn"));
        System.out.println(runBtn.getText());

        String expectedText = "Run ❯";
        String actualText = runBtn.getText();

        Assert.assertEquals(actualText, expectedText, "it does not match");
    }}

       /* List<String> windowsList=new ArrayList<>(allWindowsHandles);
        //Write to total window handle number to the console. It must be 2.
       int countofwindows= windowsList.size();
        System.out.println(countofwindows);
        //Switch t the second window.
        driver.switchTo().window(windowsList.get(1)); */
