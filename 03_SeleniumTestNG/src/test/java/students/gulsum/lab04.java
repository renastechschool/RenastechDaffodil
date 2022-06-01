package students.gulsum;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

//1. Open Chrome browser
//2. Go to https://demo.guru99.com/test/radio.html
//3. Verify all checkboxes are not selected (you can use findelements to store in list and use for loop to validate)
////4. Click to checkbox3
////5. Verify checkbox3 is selected
public class lab04 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/radio.html");
        List<WebElement> AllCheckBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        System.out.println(AllCheckBoxes.size());

        for (int i = 0; i < AllCheckBoxes.size(); i++) {
            if (!AllCheckBoxes.get(i).isSelected()) {
                System.out.println("Check boxes verification has passed.");
            } else {
                System.out.println("Check boxes verification has failed.");
            }


        }
    }}
