package students.firat;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class lab4 {

    public static void main(String[] args) {
        //1. Open Chrome browser
//2. Go to https://demo.guru99.com/test/radio.html
//3. Verify all checkboxes are not selected (you can use findelements to store in list and use for loop to validate)
//4. Click to checkbox3
//5. Verify checkbox3 is selected
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/radio.html");
        List<WebElement> checkBoxes = driver.findElements(By.cssSelector("input[type='checkbox']"));

        for (WebElement each:checkBoxes) {
            if (each.isSelected()){
                System.out.println("Check boxes are selected");
            }else{
                System.out.println("Check boxes are not selected");
            }
        }

        driver.findElement(By.id("vfb-6-2")).click();

        WebElement checkBox3 = driver.findElement(By.id("vfb-6-2"));

        if (checkBox3.isSelected()){
            System.out.println("Check box 3 is selected");
        }else {
            System.out.println("Check box 3 is not selected");
        }




    }
}
