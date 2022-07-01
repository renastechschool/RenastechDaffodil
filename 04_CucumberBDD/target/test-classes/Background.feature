Feature: We are testing background keyword in this file

  #We are pre-defining the steps below for each scenario in
  #this feature file which means it will run these steps for all scenarios
  #at the beginning

  # !! Background keyword is a possible interview question
  #You always need to place in the beginning
  Background: The user wants to go to Orange HRM Website
    Given The user wants to go to Orange HRM Website
    When The user wants to enter username and password
    Then The user wants to click on Login button
    And The user wants to verify that browser landed on Dashboard

    @Regression
  Scenario:  User wants to add employee
    Then The user wants to click on PIM module
    And The user wants to go to Add Employee page
    Then The user wants to add first name as "Gule"
    Then The user wants to add last name as "Eda"
    Then The user wants to save personal information
    Then The user should be able to see "Personal Details"

    @Regression
  Scenario: Adding a new employee - with background keyword
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



  Scenario Outline: Adding new nationality - with background keyword
    And The user wants to go to Admin Page
    Then The user wants to go to Nationalities section
    Then The user wants to click on add new nationality
    Then The user wants to add new nationalties as "<Nationalities>"
          #In the last step it will apply a different nationality in the each run

    Examples:
      |Nationalities |
      |Spartan       |
      |Nigerian      |
      |Quebecer      |
      |Tanzanian     |
      |Romannn       |
      |Atlantean     |

