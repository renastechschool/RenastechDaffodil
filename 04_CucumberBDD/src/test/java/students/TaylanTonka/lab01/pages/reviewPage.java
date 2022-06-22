package students.TaylanTonka.lab01.pages;

import code.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class reviewPage {
    public reviewPage()
    {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "(//button)[4]")
    WebElement letUsButton;

    public String verifyMessage()
    {
        return letUsButton.getText();
    }


}
