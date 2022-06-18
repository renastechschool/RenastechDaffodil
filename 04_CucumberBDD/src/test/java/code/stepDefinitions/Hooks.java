package code.stepDefinitions;

import code.utils.BrowserUtils;
import code.utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.TakesScreenshot;

public class Hooks extends BrowserUtils {
    @Before
    public void  setup(){
        Driver.getDriver();
        BrowserUtils.setWaitTime();
        Driver.getDriver().manage().window().maximize();
    }
    @After
    public void tearDown(Scenario scenario){

    }

}
