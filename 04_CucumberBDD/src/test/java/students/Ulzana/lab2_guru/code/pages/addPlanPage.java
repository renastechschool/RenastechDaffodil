package students.Ulzana.lab2_guru.code.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import students.Ulzana.lab2_guru.code.Utils.DriverU;


public class addPlanPage {

    public addPlanPage(){ PageFactory.initElements(DriverU.getDriver(),this);  }

    @FindBy(id ="rental1")
    private WebElement monthlyRental;
    @FindBy(id ="local_minutes")
    private WebElement localMin;
    @FindBy(id ="inter_minutes")
    private WebElement internMin;
    @FindBy(id ="sms_pack")
    private WebElement smsPack;
    @FindBy(id ="minutes_charges")
    private WebElement localMin_charges;
    @FindBy(id ="inter_charges")
    private WebElement internMin_charges;
    @FindBy(id ="sms_charges")
    private WebElement smsCharges;

    @FindBy(xpath = "//input[@name='submit']")
    private WebElement submitButton;

    @FindBy(xpath = "//div/header/h1")
    private WebElement headerText;


    public void setMonthlyRental(String monthlyRental) {
        this.monthlyRental.sendKeys(monthlyRental);
    }

    public void setLocalMin(String localMin) {
        this.localMin.sendKeys(localMin);
    }

    public void setInternMin(String internMin) {
        this.internMin.sendKeys(internMin);
    }

    public void setSmsPack(String smsPack) {
        this.smsPack.sendKeys(smsPack);
    }

    public void setLocalMin_charges(String localMin_charges) {
        this.localMin_charges.sendKeys(localMin_charges);
    }

    public void setInternMin_charges(String internMin_charges) {
        this.internMin_charges.sendKeys(internMin_charges);
    }

    public void setSmsCharges(String smsCharges) {
        this.smsCharges.sendKeys(smsCharges);
    }

    public void getSubmitButton() {
        submitButton.click();
    }

    public void verifyHeaderText(String headerText) {
        Assert.assertTrue(this.headerText.getText().contains(headerText));
    }
}
