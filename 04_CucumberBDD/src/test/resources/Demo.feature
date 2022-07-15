Feature: Payment Gateway functional test

  @Smoke @TC10 @BuyingAProduct
  Scenario: Verify that user can buy a product
    Given The user wants to go to Payment Gateway Website
    When The user wants to buy elephant toy
    Then The user wants to enter payment information as
    #We are using key and value format in the scenario below. We will be using keys in order to call values. This is a map
    |CNumber|44444433344333456433|
    |EMonth | 11             |
    |EYear  |2029            |
    |CVVCode| 778           |
    Then The user wants to click on pay now
    And The user wants to verify messeage as "Payment successfull!"
    
    @Smoke @BuyingMultiProducts @Regression
  Scenario: Verify that user can buy multiple products
    Given The user wants to go to Payment Gateway Website
    When The user wants to buy elephant toys as "8"
    Then The user wants to enter Credit Card Number as "4444443334433333"
    And The user wants to enter Expiration Month as "11"
    And The user wants to enter Expiraton Year as "2029"
    And The user wants to enter CVVCode as "177"
    Then The user wants to click on pay now
    And The user wants to verify message as "Payment successful!"



    Scenario: Verify that user can buy multiple products
      Given The user  user wants to go to Payment Gateway Website
      When The wants to buy elephant toys as "5"
      Then The user wants to enter Credit Card Number as"44444333443333"
      And The user wants to enter Expiration Month as "11"
      And The user wants to enter Expiration Year as "2029"
      And The user wants to enter CVV Code as "177"
      Then The user wants to click on pay now
      And The user wants to verify message as "Payment successful!"