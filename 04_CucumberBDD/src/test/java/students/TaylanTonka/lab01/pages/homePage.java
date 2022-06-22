package students.TaylanTonka.lab01.pages;

import code.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {
    public homePage()
    {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//span[@class='mat-button-wrapper'])[4]")
    WebElement getAQuoteButton;

    public void clickButton()
    {
        getAQuoteButton.click();
    }


}
