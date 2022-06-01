package students.gule;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

//1. Open Chrome browser
//2. Go to https://demo.guru99.com/test/radio.html
//3. Verify all checkboxes are not selected (you can use findelements to store in list and use for loop to validate)
//4. Click to checkbox3
//5. Verify checkbox3 is selected
public class lab04 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/radio.html");

        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox'and contains(@id,'vfb')]"));
        System.out.println("Total numbers of checkboxes : " + checkboxes.size());

        for (int i = 0; i < checkboxes.size(); i++) {

            if(checkboxes.get(i).isSelected()){
                System.out.println("Checkbox " + (i+1) + " is selected");
            }
            else{
                System.out.println("Checkbox " + (i+1) + " is not selected");
            }
        }
        WebElement checkbox3 = driver.findElement(By.id("vfb-6-2"));
        checkbox3.click();
        if(checkbox3.isSelected()){
            System.out.println("CheckBox3 verification has passed");
        }
        else{
            System.out.println("CheckBox3 verification has failed");
        }
        Thread.sleep(2000);
    }
}
