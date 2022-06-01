package students.Omer;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class lab5 {
    //1. Open Chrome browser
    //2. Go to https://demo.guru99.com/test/radio.html
    //3. Verify all checkboxes are not selected (you can use find-elements to store in list and use for loop to validate)
    //4. Click to checkbox3
    //5. Verify checkbox3 is selected

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/radio.html");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);


        List<WebElement> element = new ArrayList<>(driver.findElements(By.xpath("//input[@type='checkbox']")));
        int elementCount = element.size();
        int count = 0;

        for (WebElement element1:element) {
            if (!element1.isSelected()){
                count++;
            }
            if (elementCount==count){
                System.out.println("Checkbox is not Selected!");
            }
        }
        driver.findElement(By.xpath("//input[@type='checkbox'][3]")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//input[@type='checkbox'][3]")).isSelected());
        System.out.println("Box is Selected ");

    }




    }




