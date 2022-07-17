Feature: Payment Gateway functional test

  @Smoke
  Scenario: Verify that user can buy a product
    Given The user wants to  go to Payment Gateway Website
    # When The user wants to buy elephant toy
    Then The user wants verify  header text as "Mother Elephant With Babies Soft Toy"


  @Smoke
  Scenario: Verify toy price
    Given The user wants to  go to Payment Gateway Website
    # When The user wants to buy elephant toy
    Then The user wants verify  that the toy price as "20"

  @Smoke
  Scenario: Verify that the URL should contain text as “payment-gateway”
    Given The user wants to  go to Payment Gateway Website
    When The user wants to  buy elephant toy
    Then The user wants verify  that the URL should contain text as "payment-gateway"

  @Smoke
  Scenario: Verify that user can buy multiple products
    Given The user wants to  go to Payment Gateway Website
    When The user wants to  buy elephant toys as "5"
    Then The user wants to  enter Credit Card Number as "4500000000001990"
    And The user wants to  enter Expiration Month as "01"
    And The user wants to  enter Expiration Year as "2027"
    And The user wants to  enter CVVCode as "909"
    Then The user wants to  click on pay now
    And The user wants to  verify message as "Payment successfull!"

  @Smoke
  Scenario Outline: Verify that user can buy a product
    Given The user wants to  go to Payment Gateway Website
    When The user wants to  buy elephant "<Quantity>" toys
    Then The user wants to  enter payment information as
    |CNumber|4500000000001990|
    |EMonth |09              |
    |EYear  |2025            |
    |CVVCode|111             |
    Then The user wants to  click on pay now
    And The user wants to  verify message as "Payment successfull!"

    Examples:
      |Quantity|
      |8       |
      |5       |
      |9       |
      |2       |
      |4       |

