    package students.HalilCetin;

    import io.github.bonigarcia.wdm.WebDriverManager;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;
    public class lab02 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        //TC #1: Facebook title verification
        //Task - 1
        //Open Chrome Browser
        //Go to https://www.facebook.com
        //Verify title: Expected: "Facebook - Log In or Sign Up"

        driver.navigate();
        driver.navigate().to("https://www.facebook.com");
        String expectedTitleForFacebook="Facebook - Log In or Sign Up";
        if (driver.getTitle().equalsIgnoreCase(expectedTitleForFacebook)){
            System.out.println("Title for Facebook is matching the expected result");
        }else {
            System.out.println("Title for Facebook is not matching the expected result");
        }

        //Task - 2
        //Open Chrome Browser
        //Go to google
        //Navigate back
        //Navigate forward
        //Navigate to https://www.amazon.com
        //Verify title contains : Smile

        driver.navigate();
        driver.navigate().to("https://www.google.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().to("https://www.amazon.com");
        String expectedTitleForAmazon="Smile";
        if (driver.getTitle().contains(expectedTitleForAmazon)){
            System.out.println("Title of Amazon is matching the expected result");
        }else {
            System.out.println("Title of Amazon is not matching the expected result");
        }

        //Second Task:
        // Go to https://www.etsy.com/
        // Maximize window
        // Verify title doesnt contains "Smile"
        // Verify Current Url
        // Go to https://www.amazon.com/
        // Verify title
        // Verify Current Url
        // Navigate Back
        // Refresh
        // Quit browser

        driver.navigate().to("https://www.etsy.com/");
        driver.manage().window().maximize();
        String expectedTitleForEtsy="Smile";
        if (driver.getTitle().contains(expectedTitleForEtsy)){
            System.out.println("Title of Etsy is matching the expected result");
        }else {
            System.out.println("Title of Etsy is not matching the expected result");
        }
        System.out.println("Current Url is: " + driver.getCurrentUrl());
        driver.navigate().to("https://www.amazon.com/");
        System.out.println("Current title is: " + driver.getTitle());
        System.out.println("Current Url is: " + driver.getCurrentUrl());
        driver.navigate().back();
        driver.navigate().refresh();
        driver.close();



         }
    }
