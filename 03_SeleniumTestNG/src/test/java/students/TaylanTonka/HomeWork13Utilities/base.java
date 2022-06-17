package students.TaylanTonka.HomeWork13Utilities;

import code.utilities.DriverUtil;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class base {

    public base()
    {
        PageFactory.initElements(DriverUtil.getDriver(),this);
    }


    public static String readPropertiesFile(String key) throws IOException {
        Properties prop = new Properties();

        String fileName = "lab13.properties";
        File file = new File(fileName);
        FileInputStream fis = new FileInputStream(file);

        prop.load(fis);

        String value = prop.getProperty(key);

        return value;


    }

}
