package students.TaylanTonka.lab01.pages;

import code.utils.Driver;
import io.cucumber.java.zh_cn.假如;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

import java.util.ArrayList;
import java.util.List;

public class inputPage {

    public inputPage()
    {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='mat-select-arrow ng-tns-c60-4']")
    WebElement vehicle_year_button;

    @FindBy(tagName = "mat-option")
    List<WebElement> dropDown;

    @FindBy(xpath = "//div[@class='mat-form-field-infix ng-tns-c47-8']")
    WebElement makeButton;

    @FindBy(xpath = "//div[@class='mat-form-field-flex ng-tns-c47-10']")
    WebElement modelButton;

    @FindBy(xpath = "//button[@type='submit']")
    List<WebElement> nextbutton;

    @FindBy(xpath = "(//div[@class='mat-step ng-tns-c38-2 ng-star-inserted'])[2]//span[@class='mat-button-toggle-label-content']")
    List<WebElement> financeDetails;

    @FindBy(xpath = "//input[@id='mat-input-0']")
    WebElement distance;

    @FindBy(xpath = "//input[@data-mat-calendar='mat-datepicker-0']")
    WebElement chooseDate;

    @FindBy(xpath = "(//mat-button-toggle-group)[2]//span[@class='mat-button-toggle-label-content']")
    List<WebElement> winterTire;
    @FindBy(xpath = "(//mat-button-toggle-group)[3]//span[@class='mat-button-toggle-label-content']")
    List<WebElement> TDAdvantage;

    @FindBy(xpath = "//input[@data-placeholder='ANNNN-NNNNNN-NNNNN']")
    WebElement licenceNumber;

    @FindBy(xpath = "(//mat-button-toggle-group)[4]//mat-button-toggle")
    List<WebElement> licenceHistory;

    @FindBy(xpath = "(//span[@class='mat-button-wrapper'])[17]")
    WebElement submit;

    public void selectYear(String year) throws InterruptedException {
        vehicle_year_button.click();


        Thread.sleep(1000);
        for(WebElement element: dropDown)
        {
            if(element.getText().equalsIgnoreCase(year))
            {
                System.out.println("1");
                element.click();
                return;
            }
        }


    }

    public void selectMake(String make) throws InterruptedException {
        makeButton.click();
        Thread.sleep(1000);
        for(WebElement element:dropDown)
        {
            if(element.getText().equalsIgnoreCase(make))
            {
                Thread.sleep(1000);
                element.click();
                return;
            }
        }

    }

    public void selectModel(String model) throws InterruptedException {
        modelButton.click();
        Thread.sleep(1000);
        for (WebElement element:dropDown)
        {
            if(element.getText().equalsIgnoreCase(model))
            {
                element.click();
                return;
            }
        }


    }

    public void clickNext() throws InterruptedException {
        Thread.sleep(300);
        for(WebElement element : nextbutton)
        {
            if(element.isDisplayed())
            {
                element.click();
            }
        }
        Thread.sleep(300);
    }

    public void selectFinanceDetails(String Finance_Details)
    {
        for(WebElement element:financeDetails)
        {
            if(element.getText().equalsIgnoreCase(Finance_Details))
            {
                element.click();
                return;
            }
        }
    }

    public void inputDistance(String drivingDistance) throws InterruptedException {

        distance.sendKeys(drivingDistance);
    }


    public void inputDate(String date)
    {
        chooseDate.sendKeys(date);
    }


    public void selectWinterTireQuestion(String bool)
    {
        for(WebElement element:winterTire)
        {
            if(element.getText().equalsIgnoreCase(bool))
            {
                element.click();
            }
        }
    }

    public void selectAdvantage(String bool)
    {
        for (WebElement element:TDAdvantage)
        {
            if(element.getText().equalsIgnoreCase(bool))
            {
                element.click();
            }
        }
    }

    public void enterLicenceNumber(String number)
    {

        licenceNumber.sendKeys(number);
    }

    public void selectLicenceHistory(String bool)
    {
        for(WebElement element:licenceHistory)
        {
            if(element.getText().equalsIgnoreCase(bool))
            {
                element.click();
            }
        }
    }

    public void submitForm() throws InterruptedException {
        Thread.sleep(200);
        submit.click();
    }
}
