Feature:herokuapp.com/home
#  - Create feature file steps for below scenarios :
#  1) Verify that "Get Quote" button is navigating application ?
#  2) Verify that in finance detail you should be able to select only one option.
#  3) Verify that in finance detail you should be able to select only one option.
#  https://renas-practice.herokuapp.com/home

  Background: Verify that "Get Quote" button is navigating application
    @Given : user wants to go herkuapp website homepage "https://renas-practice.herokuapp.com/home"
  @And user wants to click insurance button
  @When user wants to click on get a quote button

  Scenario: Verify that "Get Quote" button is navigating application
    @Given verify that user navigated to get quote application"Vehicle Details"

  Scenario:Verify that in finance detail you should be able to select only one option.
    @Given user wants to click on "Finance Details"
    @Then user wants to click on "Owned"
    @And  verify that only selected option is "Owned"
    @When user wants to click on "Financed"
    @Then verify that "Financed " is only selected option

  Scenario: Verify that when you complete application you should be able to see "Let us call you" button
    @Given user wants to click on "Vehicle Details"
    @Then user wants to select "year", "make", "model"
    @And user wants to click on next
  @Then user wants to click on "Owned,Financed,Leased"
  @And user wants to click on next
    @then user wants to enter driving distance "int"
    @And user wants to select "option1"
  @And user wants to click on next
    @then user wants to choose "ia/b/c"
  @And user wants to click on next
    @Then user wants to chose tires "Yes,No"
    @And user want to enroll "Yes,No"
  @And user wants to click on next
    @Then user want to enter driver license "Number"
  @And user wants to click on next
    @Then user wants to choose license history "Yes,No"
  @And user wants to click on submit
    @Then Verify that user should be able to see "Let us call you" button



