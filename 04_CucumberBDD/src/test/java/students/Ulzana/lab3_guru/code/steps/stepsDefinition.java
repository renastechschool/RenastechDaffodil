package students.Ulzana.lab3_guru.code.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import students.Ulzana.lab3_guru.code.Utils.ConfigProprts;
import students.Ulzana.lab3_guru.code.Utils.DriverU;
import students.Ulzana.lab3_guru.code.pages.addCustomerPage;
import students.Ulzana.lab3_guru.code.pages.confirmPage;
import students.Ulzana.lab3_guru.code.pages.homePage;

public class stepsDefinition {

      homePage homePageObj= new homePage();
      addCustomerPage addCustomerPageObj=new addCustomerPage();
      confirmPage confirmPageObj= new confirmPage();

    @Given("The user wants  to see Guru demo  site")
    public void the_user_wants_to_see_guru_demo_site() {
        DriverU.getDriver().get(ConfigProprts.getProperties("url"));
    }

    @When("The user wants  to add new customer")
    public void the_user_wants_to_add_new_customer() {
        homePageObj.getAddCustomerPlan();
    }

    @Then("The user wants  to verify {string} header")
    public void the_user_wants_to_verify_header_text(String string) {
        addCustomerPageObj.verifyHeaderText(string);
    }

    @Then("The user wants  to enter background check as {string}")
    public void the_user_wants_to_enter_background_check_as(String string) {
        addCustomerPageObj.setCheckBox(string);
    }
    @Then("The user wants  to enter billingaddress as {string} and {string} and {string} and {string} and {string}")
    public void the_user_wants__to_enter_billingaddress_as_and_and_and_and(String string, String string2, String string3, String string4, String string5) {
       addCustomerPageObj.setFirstName(string);
       addCustomerPageObj.setLastName(string2);
       addCustomerPageObj.setEmail(string3);
       addCustomerPageObj.setAddress().sendKeys(string4);
       addCustomerPageObj.setMobNumber(string5);
       addCustomerPageObj.getSubmitButton();
    }
    @Then("The wants  to verify message as {string}")
    public void the_wants_to_verify_message_as(String string) {
        confirmPageObj.verifyTextConformation(string);
    }
}
