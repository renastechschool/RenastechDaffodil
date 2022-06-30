package code.pages;

import code.utils.BrowserUtils;
import code.utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class guru99Home extends BrowserUtils {
    public guru99Home(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[.='Add Customer'])[1]")
    private WebElement addCustomerButton;
    @FindBy(xpath = "//h1[.='Add Customer']")
    private WebElement addCustomerHeader;
    @FindBy(xpath = "//input[@type='radio']")
    private List<WebElement> backGroundCheck;
    @FindBy(id = "fname")
    private WebElement firstName;
    @FindBy(id = "lname")
    private WebElement lastName;
    @FindBy(id = "email")
    private WebElement email;
    @FindBy(xpath = "//div[@class='12u$']//textarea")
    private WebElement address;
    @FindBy(id = "telephoneno")
    private WebElement mobileNumber;
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement submitButton;
    @FindBy(xpath = "//h1[.='Access Details to Guru99 Telecom']")
    private WebElement verificationHeader;

    public void setAddCustomerButton() {
        addCustomerButton.click();
    }

    public void setAddCustomerHeader(String addcustomerHeader) {
        Assert.assertEquals(addCustomerHeader.getText(),addcustomerHeader);
    }

    public void setBackGroundCheck(String backgroundCheck) {
       for (WebElement each: backGroundCheck){
           if (each.getAttribute("id").equals(backgroundCheck)){
               each.click();
           }

       }
    }

    public void setFirstName(WebElement firstName) {
        this.firstName = firstName;
    }

    public void setLastName(WebElement lastName) {
        this.lastName = lastName;
    }

    public void setEmail(WebElement email) {
        this.email = email;
    }

    public void setAddress(WebElement address) {
        this.address = address;
    }

    public void setMobileNumber(WebElement mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setSubmitButton(WebElement submitButton) {
        this.submitButton = submitButton;
    }

    public void setVerificationHeader(WebElement verificationHeader) {
        this.verificationHeader = verificationHeader;
    }
}
