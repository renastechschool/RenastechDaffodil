package code.pages;

import code.utils.BrowserUtils;
import code.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Home extends BrowserUtils {
    public Home(){ PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement buyNow;

    @FindBy(xpath = "//select[@name='quantity']")
    private  WebElement quantityDropdown;


    public  void setBuyNow(){
        staticWait(2);
        buyNow.click();
    }

    public void selectQuantity(String str){
        Select select= new Select(quantityDropdown);
        select.selectByValue(str);

    }
}
