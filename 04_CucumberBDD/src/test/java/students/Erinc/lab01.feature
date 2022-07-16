Feature:Functional Testing on Renas-practice.herokuapp Website

  Background:
    Given The user wants to go Renas-practice.herokuapp Website
    When The user wants to go to Insurance Page
    And The user wants to click on Get Quote Button

  Scenario: "Get Quote" Button Verification
    Then The user wants to verify that Get Quote button navigates application

    Scenario Outline: Select only one option in Finance Detail Verification
      Given The user wants to click on finance detail
      When The user wants to click on "<financeDetailsOptions>"
      Then The user wants to click on next button
      Then The user should be able to see Driving Distance is opened
      Examples:
      |financeDetailsOptions|
      |Owned                |
      |Financed             |
      |Leased               |
      Given The user wants to enter Select driving instance
      When The user wants to select annualDrivingDistance
      Then The user wants to click next button
      Then The user should be able to see coverage start date subheader opens
      Given The user wants to choose a date
      Then The user wants to click next button on coverage start date
      Then The user should be able to see Saving and Discounts subheader opens
      And The user wants to select answer first question on Saving and Discounts
      And The user wants to select answer second question on Saving and Discounts
      Then The user wants to click next button on Saving and Discounts
      Then The user should be able to see The Driver subheader opens
      And The users wants to enter driver licence number
      Then The user wants to click next button on the driver
      Then The user should be able to see Driver's License History subheader opens
      Then The user wants to choose options on Driver's License History
      Then The user wants to click on submit button
      Then The user should be able to see "Let us call you" button



