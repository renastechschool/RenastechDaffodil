package students.Sezar;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class lab04 {
    //1. Open Chrome browser
    //2. Go to https://demo.guru99.com/test/radio.html
    //3. Verify all checkboxes are not selected (you can use findelements to store in list and use for loop to validate)
    //4. Click to checkbox3
    //5. Verify checkbox3 is selected
    public static void main(String[] args) {
        //1. Open Chrome browser
        WebDriver driver = WebDriverUtil.getDriver("chrome");
        //2. Go to https://demo.guru99.com/test/radio.html
        driver.get("https://demo.guru99.com/test/radio.html");
        driver.manage().window().maximize();
        //3. Verify all checkboxes are not selected (you can use findelements to store in list and use for loop to validate)
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        for(WebElement each:checkBoxes) {
            if (!each.isSelected()) {
                System.out.println(each.getAttribute("value") + " is not selected");
            } else {
                System.out.println(each.getAttribute("value") + " is selected");
            }
        }
            //4. Click to checkbox3
            WebElement box3=driver.findElement(By.id("vfb-6-2"));
            box3.click();

            //5. Verify checkbox3 is selected
            if (box3.isSelected()){
                System.out.println("bos3 is selected");
            }else {
                System.out.println("box 3 is not selected");
            }
        }}