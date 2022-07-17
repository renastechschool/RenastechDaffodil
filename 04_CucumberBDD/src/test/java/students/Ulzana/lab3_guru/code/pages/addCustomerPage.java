package students.Ulzana.lab3_guru.code.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import students.Ulzana.lab3_guru.code.Utils.DriverU;


public class addCustomerPage {

    public addCustomerPage(){ PageFactory.initElements(DriverU.getDriver(),this);  }

    @FindBy(xpath ="//label[@for='done']")
    private WebElement doneCheckBox;
    @FindBy(xpath= "//label[@for='pending']")
    private WebElement pendingCheckBox;


    @FindBy(id ="fname")
    private WebElement firstName;
    @FindBy(id ="lname")
    private WebElement lastName;
    @FindBy(id ="email")
    private WebElement email;
    @FindBy(xpath ="/html/body/section/div/form/div/div[7]/textarea")
    private WebElement address;
    @FindBy(id ="telephoneno")
    private WebElement mobNumber;

    @FindBy(xpath = "//input[@name='submit']")
    private WebElement submitButton;

    @FindBy(xpath = "//div/header/h1")
    private WebElement headerText;


    public void setCheckBox(String checkBox) {
        if (checkBox.equalsIgnoreCase("done")) this.doneCheckBox.click();
        else {this.pendingCheckBox.click();}
    }



    public void setFirstName(String firstName) {
        this.firstName.sendKeys(firstName);
    }

    public void setLastName(String lastName) {
        this.lastName.sendKeys(lastName);
    }

    public void setEmail(String email) {
        this.email.sendKeys(email);
    }

    public WebElement setAddress() {
        return address;
    }

    public void setMobNumber(String mobNumber) {
        this.mobNumber.sendKeys(mobNumber);
    }

    public void getSubmitButton() {
        submitButton.click();
    }

    public void verifyHeaderText(String headerText) {
        Assert.assertEquals(this.headerText.getText(),headerText);
    }
}
