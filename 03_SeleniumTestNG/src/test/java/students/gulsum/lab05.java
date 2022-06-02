package students.gulsum;

import code.utilities.WebDriverUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
//Go to Amazon
//enter Desk in search box
//Then search for desks
//(Use this task with TestNG framework)

public class lab05 {
    @Test
    public void Testing()  {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Desks");
        driver.findElement(By.id("nav-search-submit-button")).click();

        String expectedTitle="Desks";
        String actualTitle=driver.getTitle();

        System.out.println(actualTitle+" is the actual title"+ expectedTitle +" is expected title");
        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }
}


