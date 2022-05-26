package students.Kobraazizi;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class lab_04 {
    public static void main(String[] args) {

        //1. Open Chrome browser
//2. Go to https://demo.guru99.com/test/radio.html
//3. Verify all checkboxes are not selected (you can use findelements to store in list and use for loop to validate)
//4. Click to checkbox3
//5. Verify checkbox3 is selected
        WebDriver driver= WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       // driver.get("https://demo.guru99.com/test/radio.html");
       // WebElement checkBox1=driver.findElement(By.id("vfb-6-0"));
        driver.get(" https://demo.guru99.com/test/radio.html");
        WebElement checkBox3;
        checkBox3 = driver.findElement(By.id("vfb-6-0"));
        if(!checkBox3.isSelected()){
            System.out.println("checkBox1 is not selected, verification has passed");
        }else {
            System.out.println("checkBox1 is selected, verification has failed");
        }
    }
}
