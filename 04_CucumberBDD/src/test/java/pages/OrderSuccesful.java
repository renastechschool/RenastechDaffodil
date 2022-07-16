package pages;

import code.utils.BrowserUtils;
import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderSuccesful extends BrowserUtils {

    @FindBy(xpath = "//h2.'Payment successfull!']")
    private WebElement verificationText;


}
