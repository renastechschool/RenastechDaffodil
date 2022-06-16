package students.Yousef;

import code.utilities.BrowserUtils;
import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class lab_04 {

//1. Open Chrome browser
//2. Go to https://demo.guru99.com/test/radio.html
//3. Verify all checkboxes are not selected (you can use findelements to store in list and use for loop to validate)
//4. Click to checkbox3
//5. Verify checkbox3 is selected

    WebDriver driver;

    @BeforeMethod
    public void setup() {

        driver = WebDriverUtil.getDriver("chrome");
        driver.get("https://demo.guru99.com/test/radio.html");
        BrowserUtils.wait(4);
    }

    @Test
    public void TC1() {
        List<WebElement> eachBox = driver.findElements(By.xpath("//input[@type='checkbox']"));
        for (WebElement each : eachBox) {
            if (!each.isSelected()) {
                System.out.println(each.getAttribute("value") + " Check Box is not Selected, test passed ");
            } else {
                System.out.println(each.getAttribute("value") + "Check Box is Selected, test failed");
            }
        }
        WebElement checkBox3 = driver.findElement(By.id("vfb-6-2"));

        checkBox3.click();
        if (checkBox3.isSelected()) {
            System.out.println(checkBox3 + "Check Box 3 is Selected, test passed ");
        } else {
            System.out.println(checkBox3 + " Check Box 3 is not Select3d, test failed ");

        }
    }
}