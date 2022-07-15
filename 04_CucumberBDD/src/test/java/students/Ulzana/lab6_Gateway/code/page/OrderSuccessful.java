package students.Ulzana.lab6_Gateway.code.page;


import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import students.Ulzana.lab6_Gateway.code.Utils.DriverU;

public class OrderSuccessful  {
    public OrderSuccessful(){
        PageFactory.initElements(DriverU.getDriver(),this);
    }

    @FindBy(xpath = "//h2[.='Payment successfull!']")
    private WebElement verificationText;

    public void setVerificationText(String expectedMessage){
        Assert.assertEquals(verificationText.getText(),expectedMessage);


    }


}
