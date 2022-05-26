package students.TaylanTonka;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class HomeWork4 {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/radio.html");

        List<WebElement> elements = new ArrayList<WebElement>(driver.findElements(By.xpath("//input[@type='checkbox']")));
        int checkboxCount = elements.size();
        int count = 0;
        for(WebElement element : elements)
        {
            if(!element.isSelected())
            {
                count++;
            }

            if(checkboxCount == count)
            {
                System.out.println("All checkboxes are not selected");
            }


        }

        driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();


        Assert.assertTrue(driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).isSelected());
        System.out.println("checkbox3 is selected");




    }

}
