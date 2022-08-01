package students.Destyar;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class lab12 {

    //Navigate to "https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt"
//Click on the "Try it" button
//Enter Your name on the Alert Box and Accept alert
//Verify that your name shown on the page
//Click on the 'home sign' (it is on the left side of page)
//Switch to second window tab
//Click on the "log in" button
//Enter your credentials
//Enter the show password button
//Switch to first tab



    WebDriver driver;
    String nameForAlert;



    @Test
    public void TC1() {

        driver = WebDriverUtil.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.navigate().to("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
        driver.manage().deleteAllCookies();
        driver.switchTo().frame(1);
        driver.findElement(By.cssSelector("button[onclick='myFunction()']")).click();

        Alert alert = driver.switchTo().alert();
        String expectedText = "Kiyan";
        alert.sendKeys(expectedText);
        alert.accept();

        Assert.assertTrue(driver.findElement(By.id("demo")).getText().contains(expectedText));


        driver.switchTo().defaultContent();
        WebElement homepage = driver.findElement(By.id("tryhome"));
        homepage.click();

        Set<String> AllWindowHandles = driver.getWindowHandles();
        List<String> WindowsList = new ArrayList<>(AllWindowHandles);
        driver.switchTo().window(WindowsList.get(1));
        System.out.println("Window handle is : " + driver.getWindowHandle());

        driver.findElement(By.id("w3loginbtn")).click();
        driver.findElement(By.id("modalusername")).sendKeys("Kiyan213@gmail.com");
        driver.findElement(By.id("current-password")).sendKeys("392739");
        driver.findElement(By.cssSelector("span[class='PasswordInput_show_pwd_btn__Ncc9S']")).click();

        Set<String> MainWindow=driver.getWindowHandles();
        Iterator<String > itr=MainWindow.iterator();
        String parentWindow= itr.next();
        driver.switchTo().window(parentWindow);















    }
}
