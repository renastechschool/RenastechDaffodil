package students.HalilCetin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class lab04 {
    public static void main(String[] args) throws InterruptedException {
        //1. Open Chrome browser
    //2. Go to https://demo.guru99.com/test/radio.html
    //3. Verify all checkboxes are not selected (you can use findelements to store in list and use for loop to validate)
    //4. Click to checkbox3
    //5. Verify checkbox3 is selected

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        //Open Chrome Browser
        driver.navigate();

        //GO to https://demo.guru99.com/test/radio.html
        driver.navigate().to("https://demo.guru99.com/test/radio.html");

        //Verify all checkboxes are not selected (you can use findelements to store in list and use for loop to validate)

        //create a list of checboxes
        List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));

        //Verify all checkboxes are not selected
        int passedAmount=0,failedAmount=0;

        for (int i = 0; i < checkboxes.size() ; i++) {
            if (!checkboxes.get(i).isSelected()){
                passedAmount++;
            }else {
                failedAmount++;
            }

        }

        if (passedAmount == checkboxes.size()){
            System.out.println("Checkbox verification has passed.");
        } else if (failedAmount== checkboxes.size()) {
            System.out.println("Checkbox verification has failed. All boxes are selected.");
        }else {
            System.out.println("This verification has failed because some of the boxes are selected.");
        }

        //Click to checkbox3
        checkboxes.get(2).click();

        //verify checkbox3 is selected
        if (!checkboxes.get(2).isSelected()){
            System.out.println("Checkbox is not selected");
        }else {
            System.out.println("Checkbox3 is selected");
        }










    }
}
