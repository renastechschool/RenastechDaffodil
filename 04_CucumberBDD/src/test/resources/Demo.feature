Feature: Payment Gateway functional test

  Scenario: Verify that user can buy a product
    Given The user wants to go to Payment Gateway Website
    When The user wants to buy elephant toy
    Then The user wants to enter payment information as
    |CNumber|4444443334433333|
    |EMonth | 12             |
    |EYear  |2026            |
    |CVVCode| 777            |
    Then The user wants to click on pay now
    And The user wants to verify messeage as "Payment successfull!"