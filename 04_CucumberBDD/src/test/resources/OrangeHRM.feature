Feature: Functional testing on Orange HRM

  @Smoke
  Scenario: Login to Orange HRM
     Given The user wants to go to Orange HRM Website
     When The user wants to wants to enter username and password
     Then The user wants to click on Login button
     And The user wants to verify that browser landed on Dashboard

    @dryRunTest @ParameterizedDashboard
    Scenario:Login to OrangeHRM with Parameterized message
      Given The user wants to go to Orange HRM Website
      When The user wants to wants to enter username and password
      Then The user wants to click on Login button
      And The user wants to verify that browser landed on "Dashboard"

      @Smoke @TC100
      Scenario: Adding a new employee
        Given The user wants to go to Orange HRM Website
        When The user wants to wants to enter username and password
        Then The user wants to click on Login button
        And The user wants to verify that browser landed on Dashboard
        Then The user wants to click on PIM module
        And The user want to go to Add Employee page
        Then The user wants to add first name as "Chad"
        Then The user want to add last name as "Renastech"
        Then The user wants to save personal information
        Then The user should be able to see "Personal Details"

        @Smoke @TC200 @Regression
        Scenario: Adding a new employee - different format
          Given The user wants to go to Orange HRM Website
          When The user wants to wants to enter username and password
          Then The user wants to click on Login button
          And The user wants to verify that browser landed on Dashboard
          Then The user wants to click on PIM module
          Then The user wants to add employee's first and last name as following
          |FirstName| Chad|
          |LastName | RenasTech!123@|
          Then The user wants to add login details as following
          |UserName| Chad88|
          |Password|123@chad|
          |Status  |Disabled|
          Then The user wants to save the information
          Then The user should be able to see "Personal Details"







