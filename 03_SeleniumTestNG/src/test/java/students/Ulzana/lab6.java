package students.Ulzana;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class lab6 {

        WebDriver driver;

        @BeforeMethod
        public void setUp(){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }

        @Test
        public void TestCase1() throws InterruptedException {
            // click on country dropdown and select Barbados with Select Method
            //Use 3 different Select Method (visible text,index,value)
            //and switch to another countries as you wish

            driver.get("http://demo.guru99.com/test/newtours/register.php");
            WebElement dropDCountry=driver.findElement(By.tagName("select"));
            dropDCountry.click();

            Select dropdown=new Select(dropDCountry);

            String defaultOption=dropdown.getFirstSelectedOption().getText();
            String expectedDefaultOption="ALBANIA";

            Assert.assertEquals(defaultOption,expectedDefaultOption,"verification is failed");

            Thread.sleep(3000);
            dropdown.selectByValue("BARBADOS");

            Thread.sleep(3000);
            dropdown.selectByVisibleText("KAZAKHSTAN");

            Thread.sleep(3000);
            dropdown.selectByIndex(77);

            Thread.sleep(3000);
            dropdown.selectByVisibleText("CANADA");

            Thread.sleep(3000);
            dropdown.selectByVisibleText("AZERBAIJAN");

            Thread.sleep(3000);
            dropdown.selectByIndex(19);
            Thread.sleep(4000);

        }

    @Test
    public void studyHallHomeWork(){
        //    Search for necklaces
        //    Verify that your search was successful
        driver.get("https://www.etsy.com/ca/");
        WebElement searchBox=driver.findElement(By.cssSelector("input#global-enhancements-search-query"));
        searchBox.sendKeys("necklaces", Keys.ENTER);

        Assert.assertEquals(driver.getTitle(),"Necklaces | Etsy CA","Verification Failed");
        Assert.assertTrue(driver.getCurrentUrl().contains("etsy"),"Verification failed");
    }
        @Test
        public void udemySelenium(){
            driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");

            WebElement checkBox1=driver.findElement(By.id("checkBoxOption1"));
            checkBox1.click();
            Assert.assertTrue(checkBox1.isSelected());
            checkBox1.click();
            Assert.assertFalse(checkBox1.isSelected());

            WebElement checkBox2=driver.findElement(By.id("checkBoxOption2"));
            checkBox2.click();
            Assert.assertTrue(checkBox2.isSelected());
            checkBox2.click();
            Assert.assertFalse(checkBox2.isSelected());

            WebElement checkBox3=driver.findElement(By.id("checkBoxOption3"));
            checkBox3.click();
            Assert.assertTrue(checkBox3.isSelected());
            checkBox3.click();
            Assert.assertFalse(checkBox3.isSelected());

            System.out.println(driver.findElements(By.cssSelector("input[id*='checkBox']")).size());

        }

        @AfterMethod
        public void closeDriver(){
            driver.quit();
        }


}


