package code.day09_Webtables_windows;

import code.base.TestBase;
import code.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class c3_Windows extends TestBase {

    @Test
    public void TC1_MultiWindows(){
        driver.get("https://renas-practice.herokuapp.com/home");
        //click on elements
        driver.findElement(By.id("selenium-Elements")).click();
        //click on windows
        BrowserUtils.wait(4);
        driver.findElement(By.id("WindowsII")).click();

        //this will store current and only one window
        String currentWindow= driver.getWindowHandle();

        System.out.println("current window= "+currentWindow);
        System.out.println("current title= "+driver.getTitle());
        WebElement openWindowButton=driver.findElement(By.id("open-window"));
        openWindowButton.click();

        //after clicking, now we have 2 windows,
        // in order to work on second window, change focus of selenium on second window

        Set<String> allWindows= driver.getWindowHandles(); //store all windows
        List<String> windowList=new ArrayList<>();
        for(String NewWindow:allWindows){
            windowList.add(NewWindow);
            driver.switchTo().window(NewWindow);
            System.out.println("current title is: "+driver.getTitle());

        }

        //another method to switch windows
        driver.switchTo().window(windowList.get(1));
        System.out.println(driver.getTitle());
    }
}
