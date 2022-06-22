package students.Ulzana.lab13;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageLogin {

    public pageLogin(){  PageFactory.initElements(utilsDriver.getDriver(),this);}

    @FindBy(xpath = "//input[@name='uid']")
    private WebElement usernameButton;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordButton;

    @FindBy(xpath = "//input[@name='btnLogin']")
    private WebElement loginButton;

    @FindBy(xpath = "//h2[contains(text(),'Guru99')]")
    private WebElement textGuru;

    public void loginGURU(String username,String password) {
        this.usernameButton.sendKeys(username);
        this.passwordButton.sendKeys(password);
        loginButton.click();
    }

    public WebElement getTextGuru() {
        return textGuru;
    }


    //Pages : In this task you will need to create 3 pages class
//First one for login page where you need to locate : username,password,Login and Guru99 Bank text
//Second page is for home page and you need to locate : text Manger Id
//Third page is for New Customer Entry Page where you need to locate : customer information boxes such as name,adrees,gender,email,password etc.
//Configuration File
//store username,pasword , and url
//Utils
//use our ready utils such as readingproperties,driver, browser utils
//Base
//use our ready testbase classes.
//Testing
// while testing first you will verify "Guru99 Bank" is present
// then you need to Login into application
// then verify Home page contains text as "Manger Id: mngr368294"
// click on new customer tab then verify title contains New Customer Entry Page
// fill all information to be able create a customer // verify the message customer registered sucessfully.
}
