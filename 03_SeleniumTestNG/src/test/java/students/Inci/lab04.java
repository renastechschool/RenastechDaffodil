package students.Inci;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class lab04 {
    //1. Open Chrome browser
//2. Go to https://demo.guru99.com/test/radio.html
//3. Verify all checkboxes are not selected (you can use findelements to store in list and use for loop to validate)
//4. Click to checkbox3
//5. Verify checkbox3 is selected

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverUtil.getDriver("chrome");
        driver.get("https://demo.guru99.com/test/radio.html");
        driver.manage().window().maximize();

        List<WebElement> checkBoxes = driver.findElements(By.cssSelector("input[type='checkbox']"));

        for (WebElement eachBox : checkBoxes) {
            if (!eachBox.isSelected()) {
                System.out.println("Verified");
            } else {
                System.out.println("error");
            }

        }
        WebElement checkbox3 = driver.findElement(By.id("vfb-6-2"));
        checkbox3.click();

        if (checkbox3.isSelected()) {
            System.out.println("checkBox3 is selected, verification has passed");
        } else {
            System.out.println("checkBox2 is not selected");
        }
        Thread.sleep(4000);
        driver.quit();


    }
}
