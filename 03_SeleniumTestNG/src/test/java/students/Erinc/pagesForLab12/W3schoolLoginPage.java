package students.Erinc.pagesForLab12;

import code.Pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class W3schoolLoginPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"modalusername\"]")
    public WebElement emailBox;

    @FindBy(xpath = "//*[@id=\"current-password\"]" )
    public WebElement passwordBox;

    @FindBy(xpath ="//*[@id=\"root\"]/div/div/div[4]/div[1]/div/div[2]/form/div[2]/div[1]/span")
    public WebElement showPasswordButton;


    public void loginW3School(String email,String password){
        emailBox.sendKeys(email);
        passwordBox.sendKeys(password);
        showPasswordButton.click();
    }




}
