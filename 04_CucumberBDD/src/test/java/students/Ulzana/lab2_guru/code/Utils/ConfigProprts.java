package students.Ulzana.lab2_guru.code.Utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigProprts {


    private static Properties properties;

    static{
            try { properties= new Properties();
                FileInputStream file= new FileInputStream("src/test/java/students/Ulzana/lab2_guru/config.properties");
                properties.load(file);  }
            catch (Exception e){ e.getStackTrace();}    }


    public static String getProperties(String keyword){
        return properties.getProperty(keyword);
    }



}
