package code.pages;

import code.utils.BrowserUtils;
import code.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMLogin extends BrowserUtils {
    public OrangeHRMLogin(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "txtUsername")
    private WebElement userName;
    @FindBy(id = "txtPassword")
    private WebElement password;
    @FindBy(id ="btnLogin")
    private  WebElement loginButton;

    public void setUserName(String username) {
        BrowserUtils.staticWait(1);
       userName.sendKeys(username);
    }

    public void setPassword(String passWord) {
        BrowserUtils.staticWait(1);
        password.sendKeys(passWord);
    }

    public void setLoginButton() {
        loginButton.click();
    }
}
