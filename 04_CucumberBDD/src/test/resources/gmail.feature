Feature: Login to Gmail, Google Search


  Scenario: Verify that login to gmail positive credentials is successful
    Given The user wants to login gMAIL
    When The user want to click on Gmail
    And The user wants to enter correct EMAIL address
    And The user wants to enter correct password
    And The user wants to click on login button
    Then The user wants to verify that login was succesful


  Scenario: Verify that user is able to search in emails
    Given The user wants to login gMAIL
    When The user want to click on Gmail
    And The user wants to enter correct EMAIL address
    And The user wants to enter correct password
    And The user wants to click on login button
    Then The user wants to verify that login was succesful
    And The user wants to search for Renastech in emails
    Then The user wants to verify that search was succesful


  # Make a search on Google and click on first related subject
  # Go to google, search for Amazon and verify search is successful
  Scenario: Search on Google for Amazon
    Given The user wants to go to Google
    When The user clicks on google search box
    Then The user wants to text "Amazon" in the search box
    Then The user wants to click on Google search button
    And The user wants to click Amazon website in the results
    And The user wants to verify that Amazon website opened


    #Each step is sentence sensetive. So if you want to pass sentence from previous Scenerios then you need to use them exactly the same way.
   Scenario: Verify that user is able to go to Amazon by clicking Feeling Lucky Button
     Given The user wants to go to Google Website
     When The user wants to search for Amazon.com
     And The user wants to click on I'm Feeling Lucky
     Then The user wants to verify that Browser directed to Amazon.com

     # Current project is a Cucumber BDD with JUnit (the above project Gmail-google-Amazon)
     # Selenium  -- automation tool for web browser
     # TestNG is a testing framework
     # JUnit is also a testing framework
     # Cucumber is a framework



