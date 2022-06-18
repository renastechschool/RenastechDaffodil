Feature: Login to Gmail, Google Search

  Scenario: Verify that login to gmail with positive credentials is successful
    Given The user wants to go to Google
    When The user wants to click on Gmail
    And The user wants to enter email address
    And The user wants to enter password
    And The user wants to click on login button
    Then The user wants to verify that signing was successful



  Scenario: Verify that user is able to search in emails
    Given The user wants to go to Google
    When The user wants to click on Gmail
    And The user wants to enter email address
    And The user wants to enter password
    And The user wants to click on login button
    Then The user wants to verify that signing was successful
    And The user wants to search for Renastech in emails
    Then The user wants to verify that search was successfull

    #Make a search on Google and click on first related website
      #Go to google, search for Amazon and verify search is successful
   Scenario: Search on Google for Renastech
     Given The user wants to go to Google
     When The user wants to search for Renastech
     And The user wants to click on Google Search Button
     And The user wants to click on Renastech in results
     Then The user wants to verify that Renastech Website is opened

     #Each step is sentence sensitive. So you need to pass the sentence exactly if you want to use it somewhere else
   Scenario: Verify that user is able to go to Renastech by clicking I'm Feeling Lucky button
     Given The user wants to go to Google Website
     When The user wants to search for Renastech.com
     And The user wants to click on I'm Feeling Lucky
     Then The user wants to verify that Browser is directed to Renastech.com


     #Current project is Cucumber BDD with JUnit
     #Selenium -- automation tool for web browser
     #Testng is a testing framework
     #JUnit is a also testing framework
     #Cucumber - framework