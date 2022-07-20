package students.Ulzana.lab3_guru.code.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import students.Ulzana.lab3_guru.code.Utils.DriverU;

public class confirmPage {

    public  confirmPage(){ PageFactory.initElements(DriverU.getDriver(),this);}


    @FindBy(xpath = "//div/header/h1")
    private WebElement text1Conformation;


    public void verifyTextConformation(String textConformation) {
        Assert.assertEquals(this.text1Conformation.getText(),textConformation);
    }
}
