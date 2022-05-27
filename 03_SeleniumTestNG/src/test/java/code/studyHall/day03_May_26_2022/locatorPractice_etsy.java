package code.studyHall.day03_May_26_2022;

import code.utilities.WebDriverUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class locatorPractice_etsy {
    WebDriver driver;
    @Test
    public void TC1_searchForEarrings(){
        //Search for earrings
        //Add some filters to the search
        WebDriverManager.chromedriver().setup();
        driver= WebDriverUtil.getDriver("chrome");

        driver.get("https://www.etsy.com/ca/");
        //First way to sendKeys and hit enter
        WebElement searchBox= driver.findElement(By.id("global-enhancements-search-query"));
        searchBox.sendKeys("earrings");
        WebElement searchButton= driver.findElement(By.xpath("//button[@value='Search']"));
        searchButton.click();
       // second way to sendKeys and hit enter
       // searchBox.sendKeys("earrings"+ Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String expectedUrlContains="earrings";
        String actualUrl=driver.getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(expectedUrlContains));

    }

    @Test
    public void TC_2_addFilters(){
        driver.findElement(By.id("search-filter-button")).click();

    }
}
