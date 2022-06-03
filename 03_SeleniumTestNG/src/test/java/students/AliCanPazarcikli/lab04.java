package students.AliCanPazarcikli;

import code.utilities.WebDriverUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class lab04 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/radio.html");

        List<WebElement> AllCheckBoxes= driver.findElements(By.xpath("//input[@type='checkbox']"));
        System.out.println(AllCheckBoxes.size());

        for (int i = 0; i <AllCheckBoxes.size(); i++) {
            if(!AllCheckBoxes.get(i).isSelected()){
                System.out.println("Check boxes verification has passed.");
            }else{
                System.out.println("Check boxes verification has failed.");
            }
        }



    }

}
