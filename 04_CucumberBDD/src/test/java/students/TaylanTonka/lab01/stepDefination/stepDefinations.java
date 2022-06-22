package students.TaylanTonka.lab01.stepDefination;

import code.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import students.TaylanTonka.lab01.pages.homePage;
import students.TaylanTonka.lab01.pages.inputPage;
import students.TaylanTonka.lab01.pages.reviewPage;

import java.util.Map;

public class stepDefinations {
    inputPage ip = new inputPage();
    @Given("The user landing to the insurance app home page")
    public void the_user_landing_to_the_insurance_app_home_page() {
        // Write code here that turns the phrase above into concrete actions
        Driver.getDriver().get("https://renas-practice.herokuapp.com/projects/insurance");
    }

    @When("The user click the Get a Quote button")
    public void the_user_click_the_get_a_quote_button() {
        // Write code here that turns the phrase above into concrete actions
        homePage hp = new homePage();
        hp.clickButton();
    }

    @Then("The user fill the input fields")
    public void the_user_fill_the_input_fields(Map<String,String> table) throws InterruptedException {
        ip.selectYear(table.get("Vehicle_Year"));
        ip.selectMake(table.get("Make"));
        ip.selectModel(table.get("Series"));
        ip.clickNext();
        ip.selectFinanceDetails(table.get("Finance_Details"));
        ip.clickNext();
        ip.inputDistance(table.get("Driving_Distance"));
        ip.clickNext();
        ip.inputDate(table.get("Coverage_Date"));
        ip.clickNext();
        ip.selectWinterTireQuestion(table.get("Winter_Tire"));
        ip.selectAdvantage(table.get("TD_Advantage"));
        ip.clickNext();
        ip.enterLicenceNumber(table.get("Licence_Number"));
        ip.clickNext();
        ip.selectLicenceHistory(table.get("Foreign_Licence"));
        ip.submitForm();
    }

    @Then("Verify that in finance detail you should be able to select only one option")
    public void verify_that_in_finance_detail_you_should_be_able_to_select_only_one_option() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("Verify that when you complete application you should be able to see {string} button")
    public void verify_that_when_you_complete_application_you_should_be_able_to_see_button(String string) {
        // Write code here that turns the phrase above into concrete actions
        reviewPage rp = new reviewPage();
        Assert.assertEquals(rp.verifyMessage(),string);
    }

}
