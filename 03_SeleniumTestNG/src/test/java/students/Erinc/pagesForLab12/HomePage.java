package students.Erinc.pagesForLab12;

import code.Pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//button[.='Try it']")
    public WebElement tryItButton;

    @FindBy(xpath = "//p[.='Hello Erinc! How are you today?']")
    private WebElement statusMessage;

    @FindBy(xpath = "//*[@id=\"tryhome\"]")
    public WebElement HomeSign;

    public void tryItButton(){
        tryItButton.click();
    }
    public String getStatusMessage(){
        return statusMessage.getText();
    }
    public void homeSignButton(){
        HomeSign.click();
    }


}