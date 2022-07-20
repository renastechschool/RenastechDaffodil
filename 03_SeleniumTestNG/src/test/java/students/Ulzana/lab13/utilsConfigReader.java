package students.Ulzana.lab13;

import java.io.FileInputStream;
import java.util.Properties;

public class utilsConfigReader {

    private static Properties properties;

    static {   try{
            properties= new Properties();
            FileInputStream file=new FileInputStream("src/test/java/students/Ulzana/lab13/config.properties");
            properties.load(file);
        } catch (Exception e){e.getStackTrace();}  }

    public static String getProperties(String key){
        return properties.getProperty(key);
    }




}
