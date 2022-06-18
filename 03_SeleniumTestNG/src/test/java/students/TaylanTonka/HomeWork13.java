package students.TaylanTonka;

import code.utilities.DriverUtil;
import code.utilities.WebDriverUtil;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import students.TaylanTonka.HomeWork13Utilities.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class HomeWork13 {

    WebDriver driver;
    String userId;

    @BeforeClass
    public void setupDriver()
    {
        driver = DriverUtil.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }


    @Test(priority = 1)
    public void loginPageTest() throws IOException {
        loginPage lp = new loginPage();

        driver.get(base.readPropertiesFile("url"));
        Assert.assertEquals("Guru99 Bank",lp.checkText());
        userId = base.readPropertiesFile("userId");
        String passwd =base.readPropertiesFile("passwdtt");
        lp.inputUserID(userId);
        lp.inputPassword(passwd);
        lp.clickLoginButton();
    }

    @Test(priority = 2,dependsOnMethods = "loginPageTest")
    public void homePageTest()
    {
        homePage hp = new homePage();
        Assert.assertEquals(hp.checkManagerID(),userId);
        hp.clickNewCustomerButton();
    }

    @Test(priority = 3,dependsOnMethods = "homePageTest")
    public void newCustomerPageTest() throws IOException {
        String customerName= base.readPropertiesFile("customerName");
        String gender= base.readPropertiesFile("gender");
        String dateOfBirth = base.readPropertiesFile("dateOfBirth");
        String year= dateOfBirth.split("-")[0];
        String month=dateOfBirth.split("-")[1];
        String day=dateOfBirth.split("-")[2];
        String Address= base.readPropertiesFile("Address");
        String city= base.readPropertiesFile("city");
        String state= base.readPropertiesFile("state");
        String PIN= base.readPropertiesFile("PIN");
        String number= base.readPropertiesFile("number");
        String email= base.readPropertiesFile("email");
        String passwd= base.readPropertiesFile("passwd");
        newCustomerEntryPage ep = new newCustomerEntryPage();
        ep.enterCustomerName(customerName);
        if(gender.equalsIgnoreCase("male"))
        {
            ep.maleGenderChoice();
        }
        else
        {
            ep.femaleGenderChoice();
        }
        ep.enterDOB(year,month,day);
        ep.inputAddress(Address);
        ep.inputCity(city);
        ep.inputState(state);
        ep.inputPIN(PIN);
        ep.inputMobileNumber(number);
        ep.inputEmail(email);
        ep.inputPassword(passwd);
        Assert.assertTrue(DriverUtil.getDriver().getTitle().contains(" New Customer Entr"));
        ep.clickSubmit();
    }

    @Test(priority = 4,dependsOnMethods = "newCustomerPageTest")
    public void verifyregistered()
    {
        registeredPage rp = new registeredPage();
        Assert.assertTrue(rp.verifyMessage());
    }

}
