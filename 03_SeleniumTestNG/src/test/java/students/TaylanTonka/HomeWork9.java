package students.TaylanTonka;

import code.utilities.WebDriverUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HomeWork9 {
    WebDriver driver;
    Set<String> windowHandles;
    Iterator<String> windowIterator;
    String firstWindow;
    @BeforeClass
    public void setup()
    {
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test(priority = 0)
    public void goToURL()
    {
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
        String expectedTitle = "Tryit Editor v3.7";
        Assert.assertEquals(driver.getTitle(),expectedTitle);
    }
    @Test(priority = 1,dependsOnMethods = {"goToURL"})
    public void writeCurrentWindow()
    {
        firstWindow = driver.getWindowHandle();
        System.out.println("The current window is: " + firstWindow);
    }
    @Test(priority = 2,dependsOnMethods = {"writeCurrentWindow"})
    public void clickVisitButton() throws InterruptedException {

        driver.switchTo().frame("iframeResult");

        driver.findElement(By.linkText("Visit W3Schools.com!")).click();

    }
    @Test(priority = 3,dependsOnMethods = "clickVisitButton")
    public void writeTotalWindowNumber()
    {
         windowHandles = driver.getWindowHandles();
        System.out.println("Total window handle number is= " + windowHandles.size());
    }
    @Test(priority = 4,dependsOnMethods = "writeTotalWindowNumber")
    public void SwitchToSecondWindow()
    {
        windowIterator = windowHandles.iterator();
        while (windowIterator.hasNext())
        {
            if(driver.switchTo().window(windowIterator.next()).getTitle().equalsIgnoreCase("W3Schools Online Web Tutorials"))
            {

                break;
            }
        }
    }
    @Test(priority = 5,dependsOnMethods = "SwitchToSecondWindow")
    public void writeSecondWindowHandle()
    {
        System.out.println("The second window hanle is: "+ driver.getWindowHandle());
    }
    @Test(priority = 6,dependsOnMethods = "writeSecondWindowHandle")
    public void checkLogo()
    {
        Assert.assertTrue(driver.findElement(By.xpath("//i[@class='fa fa-logo']")).isDisplayed());
    }
    @Test(priority = 7,dependsOnMethods = "writeSecondWindowHandle")
    public void goFirstWindowAndPrint()  {
        driver.switchTo().window(firstWindow);
        System.out.println("the current window is="+driver.getWindowHandle());
    }
    @Test(priority = 8,dependsOnMethods = "goFirstWindowAndPrint")
    public void CheckRunButton() {
        Assert.assertTrue(driver.findElement(By.xpath("//button")).getText().equalsIgnoreCase("Run ❯"));
    }

}
