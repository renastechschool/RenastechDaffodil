Feature: Visit Insurance application and get Quote


  Scenario: The user get quote with valid information
    Given The user landing to the insurance app home page
    When The user click the Get a Quote button
    Then The user fill the input fields
      |Vehicle_Year|1994|
      |Make        |BMW |
      |Series      |3 Series|
      |Finance_Details|Leased|
      |Driving_Distance|20000|
      |Coverage_Date|7/18/2022|
      |Winter_Tire|Yes|
      |TD_Advantage|Yes|
      |Licence_Number|taylantonka|
      |Foreign_Licence|Yes|
      And Verify that in finance detail you should be able to select only one option
      And Verify that when you complete application you should be able to see "Let us call you" button
