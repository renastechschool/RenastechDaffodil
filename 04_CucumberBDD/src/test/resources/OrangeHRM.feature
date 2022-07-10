Feature: Functional testing on Orange HRM

 @Smoke @Maventest
  Scenario: Login to Orange HRM
    Given The user wants to go to Orange HRM Website
    When The user wants to enter username and password
    Then The user wants to click on Login button
    And The user wants to verify that browser landed on Dashboard

   @dryRunTest @ParatemerizedDashboard @Smoke @Regression
  Scenario: Login to OrangeHRM with Parameterized message
    Given The user wants to go to Orange HRM Website
    When The user wants to enter username and password
    Then The user wants to click on Login button
    And The user wants to verify that browser landed on "Dashboard"

  @Smoke @TC100 @Regression
  Scenario: Adding a new employee
    Given The user wants to go to Orange HRM Website
    When The user wants to enter username and password
    Then The user wants to click on Login button
    And The user wants to verify that browser landed on Dashboard
    Then The user wants to click on PIM module
    And The user wants to go to Add Employee page
    Then The user wants to add first name as "Libby"
    Then The user wants to add last name as "Renastech"
    Then The user wants to save personal information
    Then The user should be able to see "Personal Details"

    @Smoke @TC200 @Regression
    Scenario: Adding a new employee - different format
      Given The user wants to go to Orange HRM Website
      When The user wants to enter username and password
      Then The user wants to click on Login button
      And The user wants to verify that browser landed on Dashboard
      Then The user wants to click on PIM module
      Then The user wants to add employee's first and last name as following
      |FirstName| Gulsen   |
      |LastName | Renastech|
      Then The user wants to add login details as following
      |UserName|  gulsen147|
      |Password|  RenasTech!123@|
      |Status  | Disabled   |
      Then The user wants to save the information
      Then The user should be able to see "Personal Details"

      @TC300 @Regression
      Scenario: Adding a new employee  - third way
        Given The user wants to go to Orange HRM Website
        When The user wants to enter username and password
        Then The user wants to click on Login button
        And The user wants to verify that browser landed on Dashboard
        Then The user wants to click on PIM module
        Then The user wants to add employee's first and last name as following List
        |Omer1234    |   123BRk    |
        Then The user wants to add login in a list way
        |renastech123| Renastech2022| Disabled|
        |ridvan123   | ridvan!@2022 | Disabled|
        |Sezar025    | Szr123@!*    | Disabled|
        |Gulistan963 | glstn!@#     |Disabled |
        Then The user wants to save the information
        Then The user should be able to see "Personal Details"


        #Scenario outline is the place where we use DDT
        #We used the scenario above by converting it to scenario outline. The scenario outline below will run as many as row numbers in the chart
        @Scenario_Outline2
        Scenario Outline: Adding a new employee - using scenario outline
          Given The user wants to go to Orange HRM Website
          When The user wants to enter username and password
          Then The user wants to click on Login button
          And The user wants to verify that browser landed on Dashboard
          Then The user wants to click on PIM module
          Then The user wants to add employee's first and last name
          Then The user wants to add login information as "<username>" "<password>" "<status>"

          Examples:
          |username    |password      |status   |
          |renastech123| Renastech2022| Disabled|
          |ridvan123   | ridvan!@2022 | Disabled|
          |Sezar025    | Szr123@!*    | Disabled|
          |Gulistan963 | glstn!@#     |Disabled |
          |engin147    |asdalsdaf123  |Enabled  |


        @Scenario_Outline @Smoke @Regression
        Scenario Outline: Adding new nationality to nationalities page
          Given The user wants to go to Orange HRM Website
          When The user wants to enter username and password
          Then The user wants to click on Login button
          And The user wants to verify that browser landed on Dashboard
          And The user wants to go to Admin Page
          Then The user wants to go to Nationalities section
          Then The user wants to click on add new nationality
          Then The user wants to add new nationalties as "<Nationalities>"
          #In the last step it will apply a different nationality in the each run

          Examples:
          |Nationalities|
          |Aramaic      |
          |Chilean      |
          |Ecuador      |
          |American     |
          |Romannn      |
          #This will run 5 times
          #We can increase the number columns as many as we want. It will provide data for each scenario

