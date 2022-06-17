package students.TaylanTonka.HomeWork13Utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class loginPage extends base{

    @FindBy(xpath = "//h2[@class='barone']")
    WebElement textElement;

    @FindBy(xpath = "//input[@name='uid']")
    WebElement UserID;

    @FindBy(xpath = "//input[@type='password']" )
    WebElement Password;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement loginButton;

    public String checkText()
    {
        String text = textElement.getText();
        return text;
    }

    public void inputUserID(String userId)
    {
        UserID.sendKeys(userId);
    }

    public void inputPassword(String passwordCredentials)
    {
        Password.sendKeys(passwordCredentials);
    }

    public void clickLoginButton()
    {
        loginButton.click();
    }

}
