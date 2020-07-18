Feature: Check the functionality of buying at wong.pe

  @BuyProduct
  Scenario Outline: Buy product
    Given The client is on the cyberwong special page
    When Add <Product> to cart
    Then Verify that the <Product> has been added

    Examples:
      | Product |
      | 12463   |