package code.day10_Properties;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class c1_properties_practice {

    @Test
    public void TC1_System_properties(){
        //java has some properties that we can get as a system info
        System.out.println(System.getProperty("os.name"));
    }


    @Test
    public void configurationProperties() throws FileNotFoundException {
        //to be able to make our code understand properties file You need to connect the file
        Properties properties=new Properties();

        //this is a path for configuration.properties file
        String pathForPropertiesFile="configuration.properties";

        //tell compiler to open the file
        FileInputStream fileInputStream= new FileInputStream(pathForPropertiesFile);

        try{
            properties.load(fileInputStream);
            //file needs to be load in automation framework

        }catch (IOException e){
            e.printStackTrace();
        }

        System.out.println(properties.getProperty("SmartBear_url"));
        System.out.println(properties.getProperty("SmartBear_username"));
    }


}
