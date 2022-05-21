package students.Halit;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab03 {
    public static void main(String[] args) throws InterruptedException {

        String domain="https://www.google.com",domain1="https://opensource-demo.orangehrmlive.com/", keyword="apple",keyword1="cherry",username="Admin", password="admin123";
        String stars="********************************************";
        String expectedDomain="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
        int waittime=2000;

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get(domain);
        Thread.sleep(waittime);
        driver.findElement(By.name("q")).sendKeys(keyword);
        Thread.sleep(waittime);
        driver.findElement(By.name("btnK")).click();
        Thread.sleep(waittime);
        System.out.println(stars);
        if(driver.getTitle().startsWith(keyword)){
            System.out.println("Title starts with the word apple.  PASS\nActual title is: "+driver.getTitle());
        }else{
            System.out.println("Title does not start with the word apple.  FAIL \nActual title is: "+driver.getTitle());
        }
        System.out.println(stars);
        Thread.sleep(waittime);
        driver.navigate().back();
        driver.findElement(By.name("q")).sendKeys(keyword1);
        Thread.sleep(waittime);
        driver.findElement(By.name("btnI")).click();
        Thread.sleep(waittime);
        System.out.println(stars);
        if(driver.getTitle().contains(keyword1)){
            System.out.println("Title contains the word "+keyword1+" PASSED \nActual title is: "+driver.getTitle());
        }else{
            System.out.println("Title does not contain the word "+keyword1+" FAIL \nActual tittle is: "+driver.getTitle());
        }
        System.out.println(stars);
        driver.get(domain);
        Thread.sleep(waittime);
        driver.close();

        WebDriverManager.chromedriver().setup();
        WebDriver driver1=new ChromeDriver();
        driver1.get(domain);
        driver1.manage().window().maximize();
        driver1.findElement(By.name("q")).sendKeys(keyword);
        driver1.findElement(By.id("gbqfbb")).click();
        if(driver1.getTitle().contains("Apple")){
            System.out.println(stars+"\nTitle contains the word Apple, Verification PASSED\nActual title is: "+driver1.getTitle()+"\nCurrent LUCKY URL: "+driver1.getCurrentUrl());
        }else{
            System.out.println(stars+"\nTitle does NOT contain the word Apple, Verification FAILED\nActual title is: "+driver1.getTitle()+"\nCurrent LUCKY URL: "+driver1.getCurrentUrl());
        }
        System.out.println(stars);
        Thread.sleep(waittime);
        driver1.get(domain1);
        driver1.findElement(By.name("txtUsername")).sendKeys(username);
        driver1.findElement(By.name("txtPassword")).sendKeys(password);
        Thread.sleep(waittime);
        driver1.findElement(By.name("Submit")).click();
        if(driver1.getCurrentUrl().equals(expectedDomain)){
            System.out.println(stars+"\nCurrent Page is: \n"+driver1.getCurrentUrl()+"\nLogin Successful");
        }else{
            System.out.println(stars+"\nWhat a fail....curent URL is: "+ driver1.getCurrentUrl()+"Login Verification FAILED");
        }
        Thread.sleep(waittime);
        System.out.println(stars);
        driver1.close();

    }
}