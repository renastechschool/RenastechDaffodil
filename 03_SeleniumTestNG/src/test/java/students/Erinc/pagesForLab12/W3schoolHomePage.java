package students.Erinc.pagesForLab12;

import code.Pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class W3schoolHomePage extends BasePage {

    @FindBy(id = "w3loginbtn")
    public WebElement loginButton;

    public void loginW3(){
        loginButton.click();
    }

}
