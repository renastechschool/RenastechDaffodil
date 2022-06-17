package students.TaylanTonka.HomeWork13Utilities;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class newCustomerEntryPage extends base{

    @FindBy(xpath = "//input[@name='name']")
    WebElement customerName;

    @FindBy(xpath = "(//input[@name='rad1'])[1]")
    WebElement maleGender;

    @FindBy(xpath = "(//input[@name='rad1'])[2]")
    WebElement femaleGender;

    @FindBy(xpath = "//input[@type='date']")
    WebElement dob;

    @FindBy(xpath = "//textarea")
    WebElement address;

    @FindBy(xpath = "//input[@name='city']")
    WebElement city;

    @FindBy(xpath = "//input[@name='state']")
    WebElement state;

    @FindBy(xpath = "//input[@name='pinno']")
    WebElement pin;

    @FindBy(xpath = "//input[@name='telephoneno']")
    WebElement mobileNumber;

    @FindBy(xpath = "//input[@name='emailid']")
    WebElement email;

    @FindBy(xpath = "//input[@name='password']")
    WebElement passwd;

    @FindBy(xpath = "//input[@value='Submit']" )
    WebElement Submit;

    public void enterCustomerName(String customerNameInfo)
    {
        customerName.sendKeys(customerNameInfo);
    }

    public void maleGenderChoice()
    {
        maleGender.click();
    }

    public void femaleGenderChoice()
    {
        femaleGender.click();
    }

    public void enterDOB(String Year,String Month, String day)
    {
        dob.sendKeys(Year, Keys.ARROW_RIGHT,Month,day);
    }

    public void inputAddress(String Address)
    {
        address.sendKeys(Address);
    }

    public void inputCity(String cityName)
    {
        city.sendKeys(cityName);
    }

    public void inputState(String stateName)
    {
        state.sendKeys(stateName);
    }

    public void inputPIN(String pincode)
    {
        pin.sendKeys(pincode);
    }

    public void inputMobileNumber(String mobileNumberInfo)
    {
        mobileNumber.sendKeys(mobileNumberInfo);
    }

    public void inputEmail(String emailInfo)
    {
        email.sendKeys(emailInfo);
    }

    public void inputPassword(String passwordInfo)
    {
        passwd.sendKeys(passwordInfo);
    }

    public void clickSubmit()
    {
        Submit.click();
    }

}
