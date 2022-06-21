Feature: Functional testing on Orange HRM

 @Smoke
  Scenario: Login to Orange HRM
    Given The user wants to go to Orange HRM Website
    When The user wants to enter username and password
    Then The user wants to click on Login button
    And The user wants to verify that browser landed on Dashboard

   @dryRunTest @ParatemerizedDashboard
  Scenario: Login to OrangeHRM with Parameterized message
    Given The user wants to go to Orange HRM Website
    When The user wants to enter username and password
    Then The user wants to click on Login button
    And The user wants to verify that browser landed on "Dashboard"