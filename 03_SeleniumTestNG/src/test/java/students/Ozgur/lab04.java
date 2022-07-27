package students.Ozgur;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class lab04 {
    //1. Open Chrome browser
//2. Go to https://demo.guru99.com/test/radio.html
//3. Verify all checkboxes are not selected (you can use findelements to store in list and use for loop to validate)

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/test/radio.html");
       List<WebElement> checkBoxes= driver.findElements(By.xpath("//input[@type='checkbox']"));
       int unselectedCount=0;
        for (WebElement boxes:checkBoxes) {
            if(!boxes.isSelected()){
                unselectedCount++;
            }
        }  if(unselectedCount==checkBoxes.size()){
            System.out.println("All checkboxed are not selected,passed");
        }else{
            System.out.println("There are checked boxes test failed");
        }

        //4. Click to checkbox3
        //5. Verify checkbox3 is selected

        driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();

        Assert.assertTrue(driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).isSelected());
        System.out.println("checkbox3 is selected");


    }}
