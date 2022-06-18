package code.stepDefinitions;

import code.pages.Home;
import code.pages.OrderSuccessful;
import code.pages.Payment;
import code.utils.BrowserUtils;
import code.utils.ConfigurationsReader;
import code.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class steps extends BrowserUtils {
    @Given("The user wants to go to Payment Gateway Website")
    public void the_user_wants_to_go_to_payment_gateway_website() {
        Driver.getDriver().get(ConfigurationsReader.getProperties("demoURL"));
        BrowserUtils.setWaitTime();

    }
    @When("The user wants to buy elephant toy")
    public void the_user_wants_to_buy_elephant_toy() {
        Home home =new Home();
        home.setBuyNow();
    }
    @Then("The user wants to enter payment information as")
    public void the_user_wants_to_enter_payment_information_as(Map<String, String> dataTable) {
        Payment payment=new Payment();
        payment.setCardNumber(dataTable.get("CNumber"));
        payment.setMonth(dataTable.get("EMonth"));
        payment.setYear(dataTable.get("EYear"));
        payment.setCvv_code(dataTable.get("CVVCode"));
    }
    @Then("The user wants to click on pay now")
    public void the_user_wants_to_click_on_pay_now() {
        Payment payment=new Payment();
        payment.setPayButton();
    }
    @Then("The user wants to verify messeage as {string}")
    public void the_user_wants_to_verify_messeage_as(String string) {
        OrderSuccessful orderSuccessful=new OrderSuccessful();
        orderSuccessful.setVerificationText(string);
    }
}
