package students.Ulzana;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class lab4 {
//1. Open Chrome browser
//2. Go to https://demo.guru99.com/test/radio.html
//3. Verify all checkboxes are not selected (you can use findelements to store in list and use for loop to validate)
//4. Click to checkbox3
//5. Verify checkbox3 is selected

    @Test
    public void TC_1() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/radio.html");

        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));

        for (WebElement each : checkBoxes) {
            if (!each.isSelected()) {
                System.out.println(each.getAttribute("Value") + " is not selected");}
            else{
                System.out.println(each.getAttribute("Value") + " is selected");}
        }

        WebElement checkBox3Click = driver.findElement(By.xpath("//input[@type='checkbox'][3]"));
        checkBox3Click.click();


        if (checkBox3Click.isSelected()) {
            System.out.println(checkBox3Click.getAttribute("Value") + " is selected");}
        else{
            System.out.println(checkBox3Click.getAttribute("Value") + " is not selected");}

        driver.close();


    }
}