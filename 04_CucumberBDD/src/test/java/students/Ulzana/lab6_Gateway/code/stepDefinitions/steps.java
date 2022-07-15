package students.Ulzana.lab6_Gateway.code.stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import students.Ulzana.lab6_Gateway.code.Utils.BrowserU;
import students.Ulzana.lab6_Gateway.code.Utils.ConfigProprts;
import students.Ulzana.lab6_Gateway.code.Utils.DriverU;
import students.Ulzana.lab6_Gateway.code.page.OrderSuccessful;
import students.Ulzana.lab6_Gateway.code.page.homePage;
import students.Ulzana.lab6_Gateway.code.page.paymentPage;

import java.util.Map;

public class steps  {

    paymentPage payment=new paymentPage();
    homePage home=new homePage();
    @Given("The user wants to  go to Payment Gateway Website")
    public void the_user_wants_to_go_to_payment_gateway_website() {
        DriverU.getDriver().get(ConfigProprts.getProperties("URL"));
        BrowserU.javaWait(2);

    }
    @When("The user wants to  buy elephant toy")
    public void the_user_wants_to_buy_elephant_toy() {
        home.setBuyNow();
    }
    @Then("The user wants to  enter payment information as")
    public void the_user_wants_to_enter_payment_information_as(Map<String, String> dataTable) {
        payment.setCardNumber(dataTable.get("CNumber"));
        payment.setMonth(dataTable.get("EMonth"));
        payment.setYear(dataTable.get("EYear"));
        payment.setCvv_code(dataTable.get("CVVCode"));
    }
    @Then("The user wants to  click on pay now")
    public void the_user_wants_to_click_on_pay_now() {
        payment.setPayButton();
    }
    @Then("The user wants to  verify message as {string}")
    public void the_user_wants_to_verify_message_as(String string) {
        OrderSuccessful orderSuccessful=new OrderSuccessful();
        orderSuccessful.setVerificationText(string);
    }

    @When("The user wants to  buy elephant toys as {string}")
    public void the_user_wants_to_buy_elephant_toys_as(String string) {
        home.selectQuantity(string);
        home.setBuyNow();

    }

    @When("The  user wants to  buy elephant {string} toys")
    public void the_user_wants_to_buy_elephant_toys(String Quantity) {
         home.selectQuantity(Quantity);
         home.setBuyNow();
    }
    @Then("The user wants to  enter Credit Card Number as {string}")
    public void the_user_wants_to_enter_credit_card_number_as(String string) {
        payment.setCardNumber(string);
    }
    @Then("The user wants to  enter Expiration Month as {string}")
    public void the_user_wants_to_enter_expiration_month_as(String string) {
        payment.setMonth(string);
    }
    @Then("The user wants to  enter Expiration Year as {string}")
    public void the_user_wants_to_enter_expiration_year_as(String string) {
        payment.setYear(string);
    }
    @Then("The user wants to  enter CVVCode as {string}")
    public void the_user_wants_to_enter_cvv_code_as(String string) {
        payment.setCvv_code(string);
    }


    @Then("The user wants verify  header text as {string}")
    public void the_user_wants_verify_header_text_as(String string) {
        home.verifyHeaderText(string);
    }


    @Then("The user wants verify  that the toy price as {string}")
    public void the_user_wants_verify_that_the_toy_price_as(String string) {
        home.verifyPrice(string);
    }


    @Then("The user wants verify  that the URL should contain text as {string}")
    public void the_user_wants_verify_that_the_url_should_contain_text_as(String string) {
        home.verifyUrl(string);
    }

}
