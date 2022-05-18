package code.day01_introduction;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();

        driver.get("https://www.google.com/");


        driver.get("https://www.tesla.com/");

        System.out.println("Current URL = "+ driver.getCurrentUrl());

        Thread.sleep(4000);

        driver.close();




    }
}
