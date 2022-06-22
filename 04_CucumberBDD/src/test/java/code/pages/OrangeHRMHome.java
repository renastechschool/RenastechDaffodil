package code.pages;

import code.utils.BrowserUtils;
import code.utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMHome extends BrowserUtils {
    public OrangeHRMHome(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//h1[.='Dashboard']")
    private WebElement dashboard;
    @FindBy(id = "menu_pim_viewPimModule")
    private WebElement PIM;
    @FindBy(id = "btnAdd")
    private WebElement addEmployee;
    @FindBy(id = "firstName")
    private WebElement firstName;
    @FindBy(id = "lastName")
    private WebElement lastName;
    @FindBy(id = "btnSave")
    private WebElement saveButton;
    @FindBy(xpath = "//h1[.='Personal Details']")
    private WebElement personalDetailsHeader;
    @FindBy(id = "chkLogin")
    private  WebElement addLoginDetails;
    @FindBy(id = "user_name")
    private WebElement userName;
    @FindBy(xpath = "//input[@name='user_password']")
    private WebElement password;
    @FindBy(id = "re_password")
    private WebElement confirmPassword;
    @FindBy(id = "status")
    private WebElement statusDrowndown;


    public void verifyDashboardMessage(){
        Assert.assertEquals("Dashboard",dashboard.getText());
    }
    public void verifyDashboardMessage(String str){
        Assert.assertEquals(str,dashboard.getText());
    }

    public void setPIM() {
     //  PIM.click(); //regular way of clicking
        BrowserUtils.clickWithWait(PIM);
    }

    public void setAddEmployee() {
        addEmployee.click();
        BrowserUtils.staticWait(2);
    }

    public void setFirstName(String str) {
        firstName.sendKeys(str);
    }

    public void setLastName(String last) {
        lastName.sendKeys(last);
    }

    public void setSaveButton() {
        BrowserUtils.clickWithWait(saveButton);
    }

    public void setPersonalDetailsHeader(String expectedHeader) {
        Assert.assertEquals(expectedHeader,personalDetailsHeader.getText());
    }

    public void setAddLoginDetails() {
        addLoginDetails.click();
    }

    public void setUserName(String username) {
       userName.sendKeys(username);
    }

    public void setPassword(String passWord) {
        password.sendKeys(passWord);
    }

    public void setConfirmPassword(String confirmpassword) {
        confirmPassword.sendKeys(confirmpassword);
    }

    public void setStatusDrowndown(String statusdropndown) {
       BrowserUtils.selectFromDropDown(statusDrowndown, statusdropndown );
    }
}
