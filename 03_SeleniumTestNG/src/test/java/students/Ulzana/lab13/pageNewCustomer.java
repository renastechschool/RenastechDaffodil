package students.Ulzana.lab13;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageNewCustomer {
    public pageNewCustomer(){  PageFactory.initElements(utilsDriver.getDriver(),this);}

    @FindBy(xpath = "//*[contains(@onblur,'customername();')]")
    private WebElement customerName;
    @FindBy(linkText = "Gender")
    private WebElement customerGender;
    @FindBy(xpath = "//*[contains(@onblur,'City();')]")
    private WebElement city;
    @FindBy(css = "textarea[name='addr']")
    private WebElement address;
    @FindBy(css = "input[name='state']")
    private WebElement state;
    @FindBy(css = "input[name='telephoneno']")
    private WebElement mobileNumber;
    @FindBy(name= "pinno")
    private WebElement pin;
    @FindBy(name= "emailid")
    private WebElement email;
    @FindBy(css = "input[name='password']")
    private WebElement passwordNEW;
    @FindBy(css = "input[value='Submit']")
    private WebElement submitButton;
    @FindBy(id = "dob")
    private WebElement dateBirth;


    @FindBy(xpath = "//input[@value='m']")
    private WebElement maleCheckBox;
    @FindBy(xpath = "//input[@value='f']")
    private WebElement femaleCheckBox;

    @FindBy(xpath = "//p[@class='heading3']")
    private WebElement customerSuccess;


    public void setDateBirth(String dateBirth) {
        this.dateBirth.sendKeys(dateBirth);
    }

    public void setCustomerName(String name) {
         customerName.sendKeys(name);
    }

    public void setCity(String city) {
        this.city.sendKeys(city);
    }

    public void setAddress(String address) {
        this.address.sendKeys(address);
    }

    public void setState(String state) {
        this.state.sendKeys(state);
    }

    public void setMobileNumber(String mNumber){
        this.mobileNumber.sendKeys(mNumber);
    }

    public void setPIN(String pin) {
        this.pin.sendKeys(pin);
    }
    public void setEmail(String email) {
        this.email.sendKeys(email);
    }

    public void setPasswordNEW(String password) {
        passwordNEW.sendKeys(password);
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }

    public void setCustomerGender(String gender) {
        if (gender.startsWith("F") || gender.startsWith("f"))
        {femaleCheckBox.click();}
        else{maleCheckBox.click();}
    }

    public WebElement getCustomerSuccess() {
        return customerSuccess;
    }
}
