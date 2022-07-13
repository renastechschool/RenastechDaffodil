package students.Destyar;

//1. Open Chrome browser
//2. Go to https://demo.guru99.com/test/radio.html
//3. Verify all checkboxes are not selected (you can use findelements
//to store in list and use for loop to validate)
//4. Click to checkbox3
//5. Verify checkbox3 is selected

import code.utilities.WebDriverUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class lab04 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/radio.html");
       // WebElement checkBoxes= driver.findElement(By);

       List<WebElement> checkbox=driver.findElements(By.cssSelector("input[type='checkbox']"));
        System.out.println("Total number of check boxes = " +checkbox.size());

        for (int i = 0; i < checkbox.size() ; i++) {

            if (checkbox.get(i).isSelected()){
                System.out.println("checkbox " + (i+1) + " is selected");
            }else
                System.out.println("checkbox " + (i+1) + " is not selected");

        }
        WebElement checkbox3= driver.findElement(By.cssSelector("input[id='vfb-6-2'"));
        checkbox3.click();

        if (checkbox3.isSelected()){
            System.out.println("checkbox3 is selected");
        }else
            System.out.println("checkbox3 is not selected");


        Thread.sleep(3000);
        driver.close();
    }

}
