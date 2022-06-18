Feature: Login to Gmail, Google Search

  Scenario: Verify that login to gmail with positive credentials is successful
    Given The user wants to go to Google
    When The user wants to click on Gmail
    And The user wants to enter email address
    And The user wants to enter password
    And The user wants to click on login button
    Then The user wants to verify that signing was successful



 