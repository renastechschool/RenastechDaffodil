package students.TaylanTonka.HomeWork13Utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class registeredPage extends base{

    @FindBy(xpath = "//p[@class='heading3']")
    WebElement message;

    public boolean verifyMessage()
    {
        System.out.println("message.getText() = " + message.getText());
        if(message.getText().contains("Successfu"))
        {

            return true;
        }
        else
        {
            return false;
        }
    }
}
