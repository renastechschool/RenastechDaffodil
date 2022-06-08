package students.SanjayHR;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Lab04 {
//1. Open Chrome browser
//2. Go to  https://demo.guru99.com/test/radio.html
//3. Verify all checkboxes are not selected (you can use findelements to store in list and use for loop to validate)
//4. Click to checkbox3
//5. Verify checkbox3 is selected
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver chrome=new ChromeDriver();
        chrome.manage().window().maximize();
        chrome.get("https://demo.guru99.com/test/radio.html");
        List<WebElement> checkBoxes=chrome.findElements(By.xpath("//input[@type='checkbox']"));
        for (int i = 0; i < checkBoxes.size(); i++) {
            if(!checkBoxes.get(i).isSelected()){
                System.out.println("Checkbox not selected! Verification passed.");
            }else{
                System.out.println("Checkbox are selected! Verification failed.");
            }
        }
        chrome.findElement(By.xpath("//input[@id='vfb-6-2']")).click();
        for (int i = 0; i < checkBoxes.size(); i++) {
            if(checkBoxes.get(i).isSelected()){
                System.out.println("Checkbox @index # "+i+ " is selected!");
            }else{
                System.out.println("Checkbox @index # "+i+ " is not selected!");
            }
        }
    }
}
