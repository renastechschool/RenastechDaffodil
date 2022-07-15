package students.Ulzana.lab6_Gateway.code.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import students.Ulzana.lab6_Gateway.code.Utils.BrowserU;
import students.Ulzana.lab6_Gateway.code.Utils.DriverU;

public class Hooks {
    @Before
    public void setup(){
        DriverU.getDriver();
        BrowserU.impWait(20);
        DriverU.getDriver().manage().window().maximize();
    }
    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            byte[] data=((TakesScreenshot) DriverU.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(data, "image/png", scenario.getName());
        }

        DriverU.closeDriver();   }
}
