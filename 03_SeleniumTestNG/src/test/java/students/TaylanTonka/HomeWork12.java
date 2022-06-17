package students.TaylanTonka;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HomeWork12 {

    WebDriver driver;
    String nameForAlert;
    Set<String> tabs;
    @BeforeClass
    public void setup()
    {
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test(priority = 0)
    public void goToURLandClickTryIT()
    {

        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
        System.out.println("Gecis yapiyor");
        driver.switchTo().frame("iframeResult");
        System.out.println("Iframe'e gecis yapti");
        WebElement tryIT = driver.findElement(By.xpath("//button"));
        tryIT.click();
    }
    @Test(priority = 1,dependsOnMethods = "goToURLandClickTryIT")
    public void handleAlertPopUp()
    {
        Alert alert = driver.switchTo().alert();
        nameForAlert = "taylan";
        alert.sendKeys("taylan");
        alert.accept();

    }
    @Test(priority = 2,dependsOnMethods = "handleAlertPopUp")
    public void verifyText()
    {
        Assert.assertTrue(driver.findElement(By.xpath("//p[@id='demo']")).getText().contains(nameForAlert));

    }
    @Test(priority = 3,dependsOnMethods = "verifyText")
    public void clickTheHomeButton()
    {
        driver.switchTo().defaultContent();
        WebElement homeButton = driver.findElement(By.xpath("//a[@id='tryhome']"));
        homeButton.click();

    }
    @Test(priority = 4,dependsOnMethods = "clickTheHomeButton")
    public void secondTabHomePage()
    {
        tabs = driver.getWindowHandles();

        for(String element:tabs)
        {
            driver.switchTo().window(element);
            System.out.println(driver.getTitle());



        }
        WebElement LogIn = driver.findElement(By.xpath("//a[@id='w3loginbtn']"));
        LogIn.click();


    }
    @Test(priority = 5,dependsOnMethods = "secondTabHomePage")
    public void enterCredentials()
    {
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("taylan@tonka.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("myPassword");
        driver.findElement(By.xpath("//span[@class='PasswordInput_show_pwd_btn__Ncc9S']")).click();

        Assert.assertTrue(driver.findElement(By.xpath("//input[@name='current-password']")).getAttribute("type").equalsIgnoreCase("text"));

    }
    @Test(priority = 6,dependsOnMethods = "enterCredentials")
    public void switchToFirstTab()
    {
        Iterator<String> tabsIterator = tabs.iterator();
        String expectedTitle = "Tryit Editor v3.7";
        Boolean isFirstTab = false;

        while (!isFirstTab)
        {
            if(tabsIterator.hasNext())
            {

                driver.switchTo().window(tabsIterator.next());
                if(driver.getTitle().equalsIgnoreCase(expectedTitle))
                {
                    isFirstTab=true;
                }
            }
        }


        Assert.assertEquals(expectedTitle,driver.getTitle());


    }

}
