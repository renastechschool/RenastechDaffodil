package code.stepDefinitions;

import code.pages.guru99Home;
import code.utils.BrowserUtils;
import code.utils.ConfigurationsReader;
import code.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class guru99Steps extends BrowserUtils {
    guru99Home guru99Home = new guru99Home();
    @Given("The user wants to see Guru demo site")
    public void the_user_wants_to_see_guru_demo_site() {
        Driver.getDriver().get(ConfigurationsReader.getProperties("guru99url"));
    }
    @When("The user wants to add a customer")
    public void the_user_wants_to_add_a_customer() {
        guru99Home.setAddCustomerButton();
    }
    @Then("The users wants to verify {string} header")
    public void the_users_wants_to_verify_header(String string) {
        BrowserUtils.staticWait(3);
        guru99Home.setAddCustomerHeader(string);
    }
    @Then("The user wants to enter background check as {string}")
    public void the_user_wants_to_enter_background_check_as(String string) {
        BrowserUtils.staticWait(5);
        guru99Home.setBackGroundCheck(string);
    }
    @Then("The user wants to enter billingaddress as {string} and {string} and {string} and {string} and {string}")
    public void the_user_wants_to_enter_billingaddress_as_and_and_and_and(String firstName, String lastName, String email, String address, String phoneNumber) {
        guru99Home.setFirstName(firstName);
        guru99Home.setLastName(lastName);
        guru99Home.setEmail(email);
        guru99Home.setAddress(address);
        guru99Home.setMobileNumber(phoneNumber);
    }
    @Then("The wants to verify message as {string}")
    public void the_wants_to_verify_message_as(String string) {
        guru99Home.setSubmitButton();
        Assert.assertEquals(guru99Home.setVerificationHeader().getText(),string);
    }
}
