Feature: This feature is about login functionality of Amazon
<<<<<<< HEAD
  # This is how we comment in feature files
  # Gherkin language
  # Given, When, Then, And, But

  #Positive scenerio
  Scenario: Login to Amazon with correct username and password
=======
  #This is how we comment in feature files
  # Gherkin language
  # Given, When, Then, And, But


    #This is a positive scenario
  Scenario: Login to Amazon with Correct Username and Correct Password
>>>>>>> 9bc56d38204cc1686322784a4c7749ee6c8d0295
    Given The user wants to go to Amazon website
    When The user wants to enter correct username
    Then The user wants to enter correct password
    And The user wants to click on login button

<<<<<<< HEAD
#Negative scenerio
  Scenario: Login to Amazon with correct username and INCORRECT password
=======
    #This is a negative scenario
  Scenario: Login to Amazon with Correct username and Incorrect Password
>>>>>>> 9bc56d38204cc1686322784a4c7749ee6c8d0295
    Given The user wants to go to Amazon website
    When The user wants to enter correct username
    Then The user wants to enter incorrect password
    And The user wants to click on login button
<<<<<<< HEAD
    And The user wants to verify that login was UNsuccesful

#Negative scenerio
    Scenario: Login to Amazon with INCORRECT username and INCORRECT password
      Given The user wants to go to Amazon website
      When The user wants to enter incorrect username
      And The user wants to enter incorrect password
      And The user wants to click on login button
      Then The user wants to verify that login was UNsuccesful

=======
    And The user wants to verify that login was unsuccessful

    #This is a negative scenario
  Scenario: Login to Amazon with Incorrect username and Incorrect Password
    Given The user wants to go to Amazon website
    When The user wants to enter incorrect username
    And The user wants to enter incorrect password
    And The user wants to click on login button
    Then The use wants to verify that login unsuccessful
>>>>>>> 9bc56d38204cc1686322784a4c7749ee6c8d0295
