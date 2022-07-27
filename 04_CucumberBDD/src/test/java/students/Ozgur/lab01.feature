// ##  - Create feature file steps for below scenarios :
//#### 1) Verify that "Get Quote" button  is navigating application ?
//#### 2) Verify that in finance detail you should be able to select only one option.
//#### 3) Verify that when you complete application you should be able to see "Let us call you" button
// https://renas-practice.herokuapp.com/home
Feature:Verify Get Quote
  Scenario:Verify that "Get Quote" button is navigating application
    Given The user wants to renastech practice website
    When The user wants to click insurance button
    And The user wants to click on Get Quote button
    Then The user wants to verify that on the insurance page

  Scenario:Verify that in finance detail you should be able to select only one option.
    Given The user wants to Renastech practice website
    When The user wants to click insurance button
    And The user wants to click on Get Quote button
    And The user wants to click on Finance Details
    And The user wants to click one of the three options
    Then The user wants to verify that only one of three option is clickable
  Scenario: Verify that when you complete application you should be able to see "Let us call you" button
    Given The user wants to Renastech practice website
    When The user wants to click insurance button
    And The user wants to click on Get Quote button
    And The user wants to select vehicle year and make and model
    Then The user should be able to select finance details
    And The user wants to click in driving distance
    And The user wants to enter driving distane
    And The user wants to click check boxes if appliable
    And The user wants to click Coverage Start Date
    And The user wants to choose a date
    And The user wants to click on Saving and Discounts
    Then The user should be click yes or no options
    Then The user wants to click on the driver button
    And The user should be type Driver licence number
    Then The user wants to click Driver's license history
    Then The user should be able to click yes or no button
    Then The user wants to click submit button
    Then The user should be able to click Let us call you button
    Then the user wants to verify Let us call text