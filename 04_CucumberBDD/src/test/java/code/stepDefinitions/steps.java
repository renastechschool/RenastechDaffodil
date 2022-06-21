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
    Home home =new Home();
    Payment payment=new Payment();
    @Given("The user wants to go to Payment Gateway Website")
    public void the_user_wants_to_go_to_payment_gateway_website() {
        Driver.getDriver().get(ConfigurationsReader.getProperties("demoURL"));
        BrowserUtils.setWaitTime();

    }
    @When("The user wants to buy elephant toy")
    public void the_user_wants_to_buy_elephant_toy() {
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

    @When("The user wants to buy elephant toys as {string}")
    public void the_user_wants_to_buy_elephant_toys_as(String string) {
        home.selectQuantity(string);
        home.setBuyNow();

    }
    @Then("The user wants to enter Credit Card Number as {string}")
    public void the_user_wants_to_enter_credit_card_number_as(String string) {
        payment.setCardNumber(string);
    }
    @Then("The user wants to enter Expiration Month as {string}")
    public void the_user_wants_to_enter_expiration_month_as(String string) {
        payment.setMonth(string);
    }
    @Then("The user wants to enter Expiraton Year as {string}")
    public void the_user_wants_to_enter_expiraton_year_as(String string) {
        payment.setYear(string);
    }
    @Then("The user wants to enter CVVCode as {string}")
    public void the_user_wants_to_enter_cvv_code_as(String string) {
        payment.setCvv_code(string);
    }

}
