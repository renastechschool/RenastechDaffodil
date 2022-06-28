package code.pages;

import code.utils.BrowserUtils;
import code.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class OrangeHRMAdmin extends BrowserUtils {
    public OrangeHRMAdmin(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//b[.='Admin']")
    private WebElement adminButton;
    @FindBy(id = "menu_admin_nationality")
    private WebElement nationalitiesMenu;
    @FindBy(id = "btnAdd")
    private WebElement addButton;
    @FindBy(id = "nationality_name")
    private WebElement nationalityName;
    @FindBy(id = "btnSave")
    private WebElement saveButton;
    @FindBy(xpath = "//table//tr//td[2]//a")
    private List<WebElement> nationalitiesList;

}
