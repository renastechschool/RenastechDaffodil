Feature: Login to Gmail

  #This is positive scenario
  Scenario: Verify that login to gmail with positive credentials
    Given The user wants to go to google
    When The user wants to click on gmail
    And The user wants to enter email address
    And The user wants to enter password
    And The user wants to click on login button
    Then The user wants to verify that sign in was successful


    Scenario: Verify that user is able to search in email
      Given The user wants to go to google
      When The user wants to click on gmail
      And The user wants to enter email address
      And The user wants to enter password
      And The user wants to click on login button
      Then The user wants to verify that sign in was successful
      And The user wants to search for Renastech in emails
      Then The user wants to verify that search was successful

      #Make a search on Google and and click on first related website
       #Go to google, search for amazon and verify search is successful
      Scenario: Search on Google for renastech
        Given The user wants to go to google
        When The user wants to search for renastech
        And The user wants to click on google search button
        And The user wants to click on Renastech in results
        Then Then the user wants to verify that renastech website is opened

          #Each step is sentence sensitive. So you need to pass the sentence exactly if you want to use it somewhere else
        Scenario: Verify that user is able to go to renastech by clicking feeling lucky button
          Given The user wants to go to google website
          When The user wants to search for renastech.com
          And The user wants to click on feeling lucky button
          Then The user wants to verify that browser is directed to renastech.com


          #Current project is Cucumber BDD with JUnit
          #Selenium -- automation tool for web browser
          #TestNG -- is a testing framework
          #JUnit is also a testing framework
          #Cucumber -- framework

