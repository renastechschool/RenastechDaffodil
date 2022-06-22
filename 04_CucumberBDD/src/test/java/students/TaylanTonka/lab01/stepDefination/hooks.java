package students.TaylanTonka.lab01.stepDefination;

import code.utils.BrowserUtils;
import code.utils.Driver;
import org.junit.After;
import org.junit.Before;

public class hooks {

    @Before
    public void setup()
    {
        Driver.getDriver();
        BrowserUtils.setWaitTime();
        Driver.getDriver().manage().window().maximize();
    }


    @After
    public void tearDown()
    {

        //Driver.getDriver().close();
    }

}
