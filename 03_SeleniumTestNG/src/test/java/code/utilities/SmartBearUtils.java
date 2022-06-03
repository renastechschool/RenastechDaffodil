package code.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SmartBearUtils {

    public static void loginForSmartBear(WebDriver driver){
        //3- Enter username --->Tester
        //4- Enter password --->test
        //5- Click “Login” button
        WebElement userName=driver.findElement(By.id("ctl00_MainContent_username"));
        userName.sendKeys("Tester");
        WebElement password=driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
        WebElement Login=driver.findElement(By.id("ctl00_MainContent_login_button"));
        Login.click();

    }
    public static void negativeLoginForSmartBear(WebDriver driver,String userID,String passwordID){
        //3- Enter username --->Tester
        //4- Enter password --->test
        //5- Click “Login” button
        //invalid userid
        WebElement userName=driver.findElement(By.id("ctl00_MainContent_username"));
        userName.sendKeys(userID);
        WebElement password=driver.findElement(By.id("ctl00_MainContent_password"));
        //invalid passwordID
        password.sendKeys(passwordID);
        WebElement Login=driver.findElement(By.id("ctl00_MainContent_login_button"));
        Login.click();

    }


}
