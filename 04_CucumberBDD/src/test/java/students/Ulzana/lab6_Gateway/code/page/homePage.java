package students.Ulzana.lab6_Gateway.code.page;


import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import students.Ulzana.lab6_Gateway.code.Utils.BrowserU;
import students.Ulzana.lab6_Gateway.code.Utils.DriverU;

public class homePage  {
    public homePage(){ PageFactory.initElements(DriverU.getDriver(),this); }

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement buyNow;

    @FindBy(xpath = "//select[@name='quantity']")
    private  WebElement quantityDropdown;

    @FindBy(xpath = "//header[@class='align-center']//h2")
    private  WebElement textHeader;

    @FindBy(xpath = "//div[@class='6u 12u$(small)']//h3")
    private  WebElement price;



    public  void setBuyNow(){
        buyNow.click();
    }

    public void verifyHeaderText(String headerText) {
        Assert.assertEquals(textHeader.getText(), headerText);
    }

    public void selectQuantity(String Quantity){
        BrowserU.scroll(1000);
        Select select= new Select(quantityDropdown);
        select.selectByValue(Quantity);

    }

    public void verifyPrice(String price) {
        String payment=this.price.getText();
        String[] words=payment.split(" ");
        String price$=words[1];
        String[] priceNumber=price$.split(String.valueOf('$'));
        for (String priceNum:priceNumber ) {
            if(priceNum.equals(price)){
                Assert.assertEquals(priceNum,price);

            }


        }

    }

    public void verifyUrl(String string){
        String url=DriverU.getDriver().getCurrentUrl();
        Assert.assertTrue(url.contains(string));
    }
}
