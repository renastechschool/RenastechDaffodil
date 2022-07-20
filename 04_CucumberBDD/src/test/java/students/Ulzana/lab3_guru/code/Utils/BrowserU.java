package students.Ulzana.lab3_guru.code.Utils;
import java.util.concurrent.TimeUnit;


public class BrowserU {


    public static void impWait(int second) {
        DriverU.getDriver().manage().timeouts().implicitlyWait(second, TimeUnit.SECONDS);
    }

    public static void javaWait(int second) {
        try {   Thread.sleep(1000 * second);} catch (InterruptedException e) { e.printStackTrace();}}



}

