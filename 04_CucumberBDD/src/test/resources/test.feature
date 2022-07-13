Feature: This feature is about login functionality of Amazon
<<<<<<< HEAD
  #This is how me comment in feature files
  #Gherkin language
  #Given, When, Then, And, But

  #This is postive scenario
=======
  #This is how we comment in feature files
  # Gherkin language
  # Given, When, Then, And, But


    #This is a positive scenario
>>>>>>> 930e2fc6386e6bc7e346aa3cb2f69f13de505cd8
  Scenario: Login to Amazon with Correct Username and Correct Password
    Given The user wants to go to Amazon website
    When The user wants to enter correct username
    Then The user wants to enter correct password
<<<<<<< HEAD
    And the user wants to click on login button
#this is negative scenario
    Scenario: Login in to Amazon with correct username and incorrect password
      Given the user wants to go to Amazon website
      When the user wants to enter the correct username
      Then The user wants to enter incorrect password
      And The user wants to click on login button
      And The user wants to verify that login was unsuccessful
#this is negative scenario
  Scenario: Login in to Amazon with incorrect username and incorrect password
    Given The user wants to go to amazon website
    When the user wants to enter incorrect username
    And the user wants to enter incorrect password
    And the user wants to click on login button
    Then the user wants to verify that login unsuccessful


=======
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
>>>>>>> 930e2fc6386e6bc7e346aa3cb2f69f13de505cd8
