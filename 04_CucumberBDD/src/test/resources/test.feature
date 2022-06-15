Feature: This feature is about login functionality of Amazon
  # This is how we comment in feature files
  # Gherkin language
  # Given, When, Then, And, But

  #Positive scenerio
  Scenario: Login to Amazon with correct username and password
    Given The user wants to go to Amazon website
    When The user wants to enter correct username
    Then The user wants to enter correct password
    And The user wants to click on login button

#Negative scenerio
  Scenario: Login to Amazon with correct username and INCORRECT password
    Given The user wants to go to Amazon website
    When The user wants to enter correct username
    Then The user wants to enter incorrect password
    And The user wants to click on login button
    And The user wants to verify that login was UNsuccesful

#Negative scenerio
    Scenario: Login to Amazon with INCORRECT username and INCORRECT password
      Given The user wants to go to Amazon website
      When The user wants to enter incorrect username
      And The user wants to enter incorrect password
      And The user wants to click on login button
      Then The user wants to verify that login was UNsuccesful

