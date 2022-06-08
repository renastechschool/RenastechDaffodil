package students.Erinc;

import code.utilities.BrowserUtils;
import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class lab10 {
    //Prerequisites= Create username and password for guru99
//navigate to http://demo.guru99.com/V4/
//Login to Guru99 with username and password
//Use JavaScript executer to click on login
//Verify that you login to page


    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver=WebDriverUtil.getDriver("chrome");
        driver.get("http://demo.guru99.com/V4/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void closing(){
        BrowserUtils.wait(3);
        driver.close();
    }

    @Test(dataProvider = "testData")
    public void TC1_Guru99LoginVerification(String userID,String password){
        LoginForGuru99(driver,userID,password);

        BrowserUtils.wait(3);

        String expectedURL="https://demo.guru99.com/V4/manager/Managerhomepage.php";
        String actualURL=driver.getCurrentUrl();
        Assert.assertEquals(expectedURL,actualURL);

    }

    @DataProvider(name="testData")
    public static Object[][] credentialsForLogin(){
        return new Object[][]{
                {"mngr414242","vyvevyr"}
        };
    }

    public static void LoginForGuru99(WebDriver driver,String userID,String password){

        WebElement userId=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input"));
        userId.sendKeys(userID);

        WebElement password1=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
        password1.sendKeys(password);
        WebElement loginButton = driver.findElement(By.xpath("//input[@name='btnLogin']"));
        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", loginButton);
    }








}
