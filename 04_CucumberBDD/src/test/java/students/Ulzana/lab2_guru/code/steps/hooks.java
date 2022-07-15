package students.Ulzana.lab2_guru.code.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import students.Ulzana.lab2_guru.code.Utils.BrowserU;
import students.Ulzana.lab2_guru.code.Utils.DriverU;

public class hooks {


    @Before
    public void setup(){
        DriverU.getDriver();
        BrowserU.impWait(5);
        DriverU.getDriver().manage().window().maximize();
    }


    @After
    public void tearDown(){
        DriverU.closeDriver();
    }



}
