package students.Ulzana.lab2_guru.code.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import students.Ulzana.lab2_guru.code.Utils.DriverU;

public class confirmPage {

    public  confirmPage(){ PageFactory.initElements(DriverU.getDriver(),this);}


    @FindBy(xpath = "//section[@id='main']//following::h2")
    private WebElement textConformation;


    public void verifyTextConformation(String textConformation) {
        Assert.assertEquals(this.textConformation.getText(),textConformation);
    }
}
