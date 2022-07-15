package students.Ulzana.lab13;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageHome {
    public pageHome(){  PageFactory.initElements(utilsDriver.getDriver(),this);}

    @FindBy(xpath = "//td[starts-with(text(),'Manger Id ')]")
    private WebElement textManagerID;

    @FindBy(xpath = "//a[contains(@href,'addcustomer')]")
    private WebElement newCustomerButton;

    @FindBy(xpath = "//span[contains(text(),'Close')]")
    private WebElement adClose;


    public WebElement getTextManagerID() {
        return textManagerID;
    }

    public WebElement  clickAddCustomerButton() {
        return newCustomerButton;
    }

    public WebElement getAdPAGE() {
        return adClose;
    }
}
