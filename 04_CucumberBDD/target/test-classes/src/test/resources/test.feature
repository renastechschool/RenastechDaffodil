Feature: This feature is about login functionality of Amazon
  #This is how we comment in feature files
  # Gherkin language
  # Given, When, Then, And, But


    #This is a positive scenario
  Scenario: Login to Amazon with Correct Username and Correct Password
    Given The user wants to go to Amazon website
    When The user wants to enter correct username
    Then The user wants to enter correct password
    And The user wants to click on login button

    #This is a negative scenario
  Scenario: Login to Amazon with Correct username and Incorrect Password
    Given The user wants to go to Amazon website
    When The user wants to enter correct username
    Then The user wants to enter incorrect password
    And The user wants to click on login button
    And The user wants to verify that login was unsuccessful

    #This is a negative scenario
  Scenario: Login to Amazon with Incorrect username and Incorrect Password
    Given The user wants to go to Amazon website
    When The user wants to enter incorrect username
    And The user wants to enter incorrect password
    And The user wants to click on login button
    Then The use wants to verify that login unsuccessful