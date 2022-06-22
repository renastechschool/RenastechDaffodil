package students.TaylanTonka.lab01.pages;

import code.utils.Driver;
import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

import java.util.List;

public class inputPage {

    public inputPage()
    {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='mat-select-arrow ng-tns-c60-4']")
    WebElement vehicle_year_button;

    @FindBy(how = How.XPATH,  using = "//span[@class='mat-option-text']")
    List<WebElement> years;




    public void selectYear(String year)
    {
        vehicle_year_button.click();
        for(WebElement element:years)
        {
            System.out.println(years.get(0));
            System.out.println("tt");
            if(element.getText().equalsIgnoreCase(year))
            {

                element.click();
            }
        }
    }

}
