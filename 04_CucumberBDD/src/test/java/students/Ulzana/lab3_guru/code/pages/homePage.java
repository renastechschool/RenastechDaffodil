package students.Ulzana.lab3_guru.code.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import students.Ulzana.lab3_guru.code.Utils.DriverU;

public class homePage {

    public homePage(){PageFactory.initElements(DriverU.getDriver(),this);  }

    @FindBy (xpath = "//div/h3/a[@href='addcustomer.php']")
    private WebElement addCustomerButton;

    public void getAddCustomerPlan(){
        addCustomerButton.click();  }




}
