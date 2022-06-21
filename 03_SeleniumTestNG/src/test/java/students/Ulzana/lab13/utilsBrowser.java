package students.Ulzana.lab13;

import java.util.concurrent.TimeUnit;

public class utilsBrowser {

    public static void implWait(int second){
    utilsDriver.getDriver().manage().timeouts().implicitlyWait(second,TimeUnit.SECONDS);}

    public static void staticWait(int second){
        try{Thread.sleep(second);}catch (Exception e){e.getStackTrace();}    }




}
