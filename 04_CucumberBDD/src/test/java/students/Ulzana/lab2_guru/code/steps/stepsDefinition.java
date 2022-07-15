package students.Ulzana.lab2_guru.code.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import students.Ulzana.lab2_guru.code.Utils.ConfigProprts;
import students.Ulzana.lab2_guru.code.Utils.DriverU;
import students.Ulzana.lab2_guru.code.pages.addPlanPage;
import students.Ulzana.lab2_guru.code.pages.confirmPage;
import students.Ulzana.lab2_guru.code.pages.homePage;

import java.util.Map;

public class stepsDefinition {

    homePage homePageObj =new homePage();
    addPlanPage addPlanPageObj =new addPlanPage();
    confirmPage confirmPageObj = new confirmPage();



    @Given("The user  wants to see Guru demo site")
    public void the_user_wants_to_see_guru_demo_site() {
        DriverU.getDriver().get(ConfigProprts.getProperties("url"));
    }

    @When("The user  wants to Add Tariff Plan")
    public void the_user_wants_to_add_tariff_plan() {
        homePageObj.getAddTariffPlan();
    }

    @Then("The user  wants to verify {string} header")
    public void the_user_wants_to_verify_header(String string) {
       addPlanPageObj.verifyHeaderText(string);
    }

    @Then("The user  wants to Add Tariff Plan details as")
    public void the_user_wants_to_add_tariff_plan_details_as(Map<String, String> dataTable) {
        addPlanPageObj.setMonthlyRental(dataTable.get("Monthly Rental"));
        addPlanPageObj.setLocalMin(dataTable.get("Free Local Minutes"));
        addPlanPageObj.setInternMin(dataTable.get("Free International Minutes"));
        addPlanPageObj.setSmsPack(dataTable.get("Free SMS Pack"));
        addPlanPageObj.setLocalMin_charges(dataTable.get("Local Per Minutes Charges"));
        addPlanPageObj.setInternMin_charges(dataTable.get("International Per Minutes Charges"));
        addPlanPageObj.setSmsCharges(dataTable.get("SMS Per Charges"));

    }

    @Then("The user  wants to submit")
    public void the_user_wants_to_submit() {
        addPlanPageObj.getSubmitButton();
    }

    @Then("The user  wants to verify message as {string}")
    public void the_user_wants_to_verify_message_as(String string) {
        confirmPageObj.verifyTextConformation(string);

    }


}
