package students.Ulzana.lab13;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class utilsBrowser {

    public static void implWait(int second){
    utilsDriver.getDriver().manage().timeouts().implicitlyWait(second,TimeUnit.SECONDS);}

    public static void staticWait(int second){
        try{Thread.sleep(second);}catch (Exception e){e.getStackTrace();}    }




}
