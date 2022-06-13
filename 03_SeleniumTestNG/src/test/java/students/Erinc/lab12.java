package students.Erinc;

import code.base.TestBase2;
import code.utilities.BrowserUtils;
import code.utilities.DriverUtil;
import code.utilities.PropertiesReadingUtil;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;
import students.Erinc.pagesForLab12.HomePage;
import students.Erinc.pagesForLab12.W3schoolHomePage;
import students.Erinc.pagesForLab12.W3schoolLoginPage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class lab12 extends TestBase2 {
    //Navigate to "https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt"
//Click on the "Try it" button
//Enter Your name on the Alert Box and Accept alert
//Verify that your name shown on the page
//Click on the 'home sign' (it is on the left side of page)
//Switch to second window tab
//Click on the "log in" button
//Enter your credentials
//Enter the show password button
//Switch to first tab

    @Test
    public void TC1_exercises(){

        DriverUtil.getDriver().get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
        DriverUtil.getDriver().switchTo().frame(0);
        HomePage homepage=new HomePage();
        homepage.tryItButton();

        Alert alert=DriverUtil.getDriver().switchTo().alert();
        alert.sendKeys("Erinc");
        alert.accept();

        String expected="Erinc";
        Assert.assertTrue(homepage.getStatusMessage().contains(expected));
        DriverUtil.getDriver().switchTo().defaultContent();

        BrowserUtils.wait(3);
        homepage.HomeSign.click();

        Set<String> allWindows=DriverUtil.getDriver().getWindowHandles();
        List<String> windowsList=new ArrayList<>(allWindows);
        DriverUtil.getDriver().switchTo().window(windowsList.get(1));
        BrowserUtils.wait(3);

        W3schoolHomePage w3SchoolHome=new W3schoolHomePage();
        w3SchoolHome.loginW3();

        W3schoolLoginPage w3schoolLoginPage=new W3schoolLoginPage();
        w3schoolLoginPage.loginW3School(PropertiesReadingUtil.getProperties("InvalidUserName"),PropertiesReadingUtil.getProperties("InvalidPassword"));

        BrowserUtils.wait(3);

        DriverUtil.getDriver().switchTo().window(windowsList.get(0));


    }





}
