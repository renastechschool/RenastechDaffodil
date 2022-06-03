package students.HaticeKarakoyun;

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
    //3. Verify all checkboxes are not selected (you can use find elements to store in list and use for loop to validate)
    //4. Click to checkbox3
    //5. Verify checkbox3 is selected

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/radio.html");

        //3. Verify all checkboxes are not selected (you can use find elements to store in list and use for loop to validate)

        List<WebElement> AllCheckBoxes= driver.findElements(By.xpath("//input[@type='checkbox']"));
        System.out.println(AllCheckBoxes.size());

        for (int i = 0; i <AllCheckBoxes.size(); i++) {
            if(!AllCheckBoxes.get(i).isSelected()){
                System.out.println("Check boxes verification has passed.");
            }else{
                System.out.println("Check boxes verification has failed.");
            }
        }
        //4. Click to checkbox3
        WebElement checkbox3 = driver.findElement(By.id("vfb-6-2"));
        checkbox3.click();

        //5. Verify checkbox3 is selected
        if(checkbox3.isSelected()){
            System.out.println("Checkbox3 is selected ");
        }else{
            System.out.println(" Checkbox3 is not selected, verification has been failed! ");
        }

        Thread.sleep(2000);
        driver.quit();
        driver.close();

    }
}
