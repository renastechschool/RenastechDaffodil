package code.stepDefinitions;

import code.pages.OrangeHRMHome;
import code.pages.OrangeHRMLogin;
import code.utils.BrowserUtils;
import code.utils.ConfigurationsReader;
import code.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHRMSteps extends BrowserUtils {
    OrangeHRMLogin orangeHRMLogin=new OrangeHRMLogin();
    OrangeHRMHome orangeHRMHome = new OrangeHRMHome();
    @Given("The user wants to go to Orange HRM Website")
    public void the_user_wants_to_go_to_orange_hrm_website() {
        System.out.println("Browser is launched and testing started");
        Driver.getDriver().get(ConfigurationsReader.getProperties("OrangeHRMTest"));
        BrowserUtils.waitForPageToLoad(4);
    }
    @When("The user wants to enter username and password")
    public void the_user_wants_to_enter_username_and_password() {
        orangeHRMLogin.setUserName(ConfigurationsReader.getProperties("userName"));
        orangeHRMLogin.setPassword(ConfigurationsReader.getProperties("password"));
    }
    @Then("The user wants to click on Login button")
    public void the_user_wants_to_click_on_login_button() {
        orangeHRMLogin.setLoginButton();
    }
    @Then("The user wants to verify that browser landed on Dashboard")
    public void the_user_wants_to_verify_that_browser_landed_on_dashboard() {
        orangeHRMHome.verifyDashboardMessage();
    }
    @Then("The user wants to verify that browser landed on {string}")
    public void the_user_wants_to_verify_that_browser_landed_on(String string) {
       orangeHRMHome.verifyDashboardMessage(string);
    }
}
