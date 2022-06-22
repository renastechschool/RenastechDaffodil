package students.Ulzana.lab13;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class utilsDriver {
    private utilsDriver(){}
    private static WebDriver driver;

    public static WebDriver getDriver(){
//        WebDriverManager.chromedriver().setup();
//        driver=(new ChromeDriver());
        if(driver==null){
            String browserA= utilsConfigReader.getProperties("browser");
            switch (browserA){
                    case "chrome":
                        WebDriverManager.chromedriver().setup();
                        driver=(new ChromeDriver());
                        break;
                    case "firefox":
                        WebDriverManager.firefoxdriver().setup();
                        driver=(new FirefoxDriver());
                        break;
                    case "edge":
                        WebDriverManager.edgedriver().setup();
                        driver=(new EdgeDriver());
                        break;
                    case "chrome-headless":
                        WebDriverManager.chromedriver().setup();
                        driver=(new ChromeDriver(new ChromeOptions().setHeadless(true)));
                        break;
                    default:
                        System.out.println("The Driver is NOT Found");

                }
            }

        return driver;
    }
    public static void closeDriver(){
        if(driver!=null){
            driver.quit();
            driver=null;
        }

    }






}
