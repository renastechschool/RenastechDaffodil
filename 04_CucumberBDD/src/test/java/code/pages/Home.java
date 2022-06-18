package code.pages;

import code.utils.BrowserUtils;
import code.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home extends BrowserUtils {
    public Home(){ PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement buyNow;

    public  void setBuyNow(){
        staticWait(2);
        buyNow.click();
    }
}
