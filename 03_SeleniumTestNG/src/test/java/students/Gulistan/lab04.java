package students.Gulistan;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class lab04 {
    //1. Open Chrome browser
//2. Go to https://demo.guru99.com/test/radio.html
//3. Verify all checkboxes are not selected (you can use findelements to store in list and use for loop to validate)
//4. Click to checkbox3
//5. Verify checkbox3 is selected

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/radio.html");
        List<WebElement>  checkBox = new ArrayList<>(driver.findElements(By.xpath("//input[@type='checkbox']")));
        System.out.println(checkBox.size());

        for (int i=0;i< checkBox.size(); i++){

            if (checkBox.get(i).isSelected()){
                System.out.println("CheckBox "+i+" is selected");
            }else{
                System.out.println("CheckBox "+i+" is not selected");
            }
        }
        driver.findElement(By.xpath("//input[@id='vfb-6-2']")).click();

        if(checkBox.get(2).isSelected()){
            System.out.println("CheckBox3 is selected");
        }else{
            System.out.println("CheckBox3 is not selected");
        }
        Thread.sleep(2000);
        driver.close();
    }
}
