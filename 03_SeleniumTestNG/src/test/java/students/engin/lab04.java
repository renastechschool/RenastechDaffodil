package students.engin;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class lab04 {
//1. Open Chrome browser
//2. Go to https://demo.guru99.com/test/radio.html
//3. Verify all checkboxes are not selected (you can use findelements to store in list and use for loop to validate)
//4. Click to checkbox3
//5. Verify checkbox3 is selected

    @Test
    public void TC1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/radio.html");

        List<WebElement> radioButtons = new ArrayList<WebElement>(driver.findElements(By.xpath("//input[@type='radio']")));

        for (WebElement each : radioButtons) {
            if (each.isSelected()){
                System.out.println("each.getText() = " + each.getText() + " is SELECTED");
            }else {
                System.out.println("each.getText() = " + each.getText() + " is NOT SELECTED");
            }
        }
        radioButtons.get(2).click();

        WebElement radioButton3 = driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
        if (radioButton3.isSelected()){
            System.out.println("SELECTED");
        }else {
            System.out.println("NOT SELECTED");
        }

    }

}
