Feature: Practice site Insurance page functional test

Background: The User on Renas Practice home page
  Scenario: Verify that "Get Quote" button  is navigating application
  Given The user wants to go to Insurance page
  When The user wants to click on "Get Quote"
  Then The user wants to verify that navigating application  opens


Scenario: Verify that in finance detail user should be able to select only one option.
  Given The user wants to go to Insurance page
  When The user wants to click on "Get Quote"
  And The user wants to choose on "finance detail"
  Then The user wants to choose only one option
  And The user wants to verify only one option is selected others are enabled


Scenario: Verify that when user complete application user should be able to see "Let us call you" button
  Given The user wants to go to Insurance page
  When The user wants to click on "Get Quote"
  Then The user wants to enter all required information
    |Year       |2012         |
    |vMake      |Toyota       |
    |vModel     |2026         |
    |dDist      |99000        |
    |coverDate  |6/20/2022    |
    |LicenceN   |CA99-001-008 |
  Then The user wants to submit all information
  And The user wants to verify message as  "Let us call you"