package students.Ulzana;

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

public class lab9{

    WebDriver driver;

    @BeforeMethod
    public void setup(){

        driver=WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
    }
    @AfterMethod
    public void close(){
        driver.quit();
    }
    /*
    website: http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target
    Test Scenario:
        Go to the above URL.
        Get the current window’s handle and write to the console window.
    It must be the first window handle.
        Locate the “Visit W3Schools.com!” link and click it.
        Get all window handles and hold them in a list.
        Write to total window handle number to the console. It must be 2.
        Switch t the second window.

        Get the current window’s handle and write to the console window.
    It must be a second window handle.

        Check the upper left side logo in the second window.
        Go back (Switch) to the first window.

        Get the current window’s handle and write to the console window.
    It must be the first window handle.
        Check the See Run Button Text. It must contain “Run >” text.
     */
    @Test
    public void TestCase_1(){

// 		Get the current window’s handle and write to the console window. It must be the first window handle.
        String currentWindow= driver.getWindowHandle();
        String currentTitle= driver.getTitle();

        System.out.println("Current window Handle: " +currentWindow);
        System.out.println("Current window title: " +currentTitle);
        System.out.println("Current window URL: " +driver.getCurrentUrl());

// 		Locate the “Visit W3Schools.com!” link and click it.
        driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[4]/div[4]/div/div/iframe")));
        driver.findElement(By.xpath("/html/body/a")).click();
        driver.switchTo().defaultContent();

//		Get all window handles and hold them in a list.
        Set<String> allWindows= driver.getWindowHandles();
        List<String> windows=new ArrayList<>();
        for(String NewWindow:allWindows){
            windows.add(NewWindow);
            driver.switchTo().window(NewWindow);
        }

// 		Write to total window handle number to the console. It must be 2.
        System.out.println("Total window handle: "+windows.size());

// 		Switch t the second window.
        driver.switchTo().window(windows.get(1));

// 		Get the current window’s handle and write to the console window. It must be a second window handle.
        String currentWindow1= driver.getWindowHandle();
        String currentTitle1= driver.getTitle();

        System.out.println("Current window Handle: " +currentWindow1);
        System.out.println("Current window title: " +currentTitle1);
        System.out.println("Current window URL: " +driver.getCurrentUrl());

// 		Check the upper left side logo in the second window.
        driver.findElement(By.cssSelector("a[title='Home']")).click();

// 		Go back (Switch) to the first window.
        driver.switchTo().window(windows.get(0));

//		Get the current window’s handle and write to the console window. It must be the first window handle.
        String currentWindow2= driver.getWindowHandle();
        String currentTitle2= driver.getTitle();

        System.out.println("Current window Handle: " +currentWindow2);
        System.out.println("Current window title: " +currentTitle2);
        System.out.println("Current window URL: " +driver.getCurrentUrl());

//		Check the See Run Button Text. It must contain “Run >” text.
        WebElement runButton= driver.findElement(By.cssSelector("button#runbtn"));
        runButton.click();
        String contains="Run";
        String actual=runButton.getText();
        Assert.assertTrue(actual.contains(contains));

    }

}
