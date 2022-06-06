package code.day09_Webtables_windows;

import code.utilities.SmartBearUtils;
import code.utilities.WebDriverUtil;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class c1_WebTablePractice {
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

    }

    @Test
    public void TC1_StreetVerification(){
        SmartBearUtils.loginForSmartBear(driver);
        Assert.assertEquals(driver.getTitle(),"Web Orders");
    }
}
