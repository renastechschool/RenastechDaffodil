package students.Ulzana.lab6_Gateway.code.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import students.Ulzana.lab6_Gateway.code.Utils.DriverU;

public class paymentPage  {
    public paymentPage(){
        PageFactory.initElements(DriverU.getDriver(),this);
    }

    @FindBy(id = "card_nmuber")
    private WebElement cardNumber;
    @FindBy(id = "month")
    private WebElement month;
    @FindBy(id = "year")
    private WebElement year;
    @FindBy(id = "cvv_code")
    private WebElement cvv_code;
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement payButton;

    public void setCardNumber(String CardNumber) {
        cardNumber.sendKeys(CardNumber);
    }

    public void setMonth(String Month) {
         month.sendKeys(Month);
    }

    public void setYear(String Year) {
        year.sendKeys(Year);
    }

    public void setCvv_code(String CVVCode) {
        cvv_code.sendKeys(CVVCode);
    }

    public void setPayButton() {
        payButton.click();
    }
}
