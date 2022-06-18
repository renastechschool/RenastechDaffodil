package code.pages;

import code.utils.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Payments extends BrowserUtils {
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
        staticWait(1);
        cardNumber.sendKeys(CardNumber);
    }

    public void setMonth(String Month) {
        staticWait(1);
        month.sendKeys(Month);
    }

    public void setYear(String Year) {
        staticWait(1);
        year.sendKeys(Year);
    }

    public void setCvv_code(String CVVCode) {
        staticWait(1);
        cvv_code.sendKeys(CVVCode);
    }

    public void setPayButton() {
        payButton.click();
    }
}
