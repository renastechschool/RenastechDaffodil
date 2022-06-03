package students.TaylanTonka;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class HomeWork8 {

    WebDriver driver;
    @BeforeClass
    public void setup()
    {
        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);


    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }

    @Test(priority = 1)
    public void goToUrl()
    {

        driver.get("https://demo.guru99.com/test/delete_customer.php");
    }

    @Test(priority = 2)
    public void enterCustomerId() throws InterruptedException {
        Thread.sleep(5000);
        WebElement input = driver.findElement(By.xpath("//input[@type='text']"));
        input.sendKeys("1903");
    }

    @Test(priority = 3,dependsOnMethods = {"enterCustomerId"})
    public void clickSubmit()
    {
        WebElement button = driver.findElement(By.xpath("//input[@type='submit']"));
        button.click();

    }

    @Test(priority = 4,dependsOnMethods = {"clickSubmit"})
    public void acceptAlert() throws InterruptedException {
        Alert alert = driver.switchTo().alert();
        System.out.println("The message is " + alert.getText());
        System.out.println("It will be accepted in 3 seconds...");
        Thread.sleep(3000);
        alert.accept();
        Alert alert2 = driver.switchTo().alert();
        Assert.assertEquals("Customer Successfully Delete!",alert2.getText());
        alert2.accept();

    }



}
