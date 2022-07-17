package students.Mukaddes;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class lab09 {
    //website: http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target
   // Test Scenario:
        //    * 		Go to the above URL.
	//	Get the current window’s handle and write to the console window. It must be the first window handle.
	//	Locate the “Visit W3Schools.com!” link and click it.
        //    * 		Get all window handles and hold them in a list.
        //    * 		Write to total window handle number to the console. It must be 2.
        //    * 		Switch t the second window.
 		//Get the current window’s handle and write to the console window. It must be a second window handle.
 		// Check the upper left side logo in the second window.
         //   * 		Go back (Switch) to the first window.
         //   * 		Get the current window’s handle and write to the console window. It must be the first window handle.
		//Check the See Run Button Text. It must contain “Run >” text.

    WebDriver driver;
    @BeforeClass
    public void setup(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
    }
    @AfterClass
    public void closing() throws InterruptedException {
        Thread.sleep(2000);
       // driver.quit();
    }

    @Test
    public void TC1(){
        //	Get the current window’s handle and write to the console window. It must be the first window handle.
        System.out.println("The current window’s handle : "+ driver.getWindowHandle());

        //	Locate the “Visit W3Schools.com!” link and click it.
        driver.findElement(By.id("iframeResult"));
        driver.switchTo().frame("iframeResult");
        WebElement link= driver.findElement(By.linkText("Visit W3Schools.com!"));
        link.click();

        //    * 		Get all window handles and hold them in a list.
        Set<String> allWindow=driver.getWindowHandles();
        System.out.println(allWindow.size());

        //    * 		Switch t the second window.
        List<String>windowList=new ArrayList<>(allWindow);
        driver.switchTo().window(windowList.get(1));

        //Get the current window’s handle and write to the console window. It must be a second window handle.
        System.out.println("The current window’s handle : "+driver.getWindowHandle());

        // Check the upper left side logo in the second window.
        WebElement LOGO=driver.findElement(By.xpath("//i[@class='fa fa-logo']"));
        Assert.assertTrue(LOGO.isDisplayed());

        //   * 		Go back (Switch) to the first window.
        driver.switchTo().window(windowList.get(0));

        //   * 		Get the current window’s handle and write to the console window. It must be the first window handle.
        System.out.println("The current window’s handle : "+driver.getWindowHandle());

        //Check the See Run Button Text. It must contain “Run >” text.
        WebElement runButton= driver.findElement(By.id("runbtn"));
        String expectedRunButton="Run >";
        Assert.assertFalse(runButton.getText().contains(expectedRunButton));

    }
}











