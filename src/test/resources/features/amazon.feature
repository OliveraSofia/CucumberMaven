Feature: Amazon user add items to cart

  @Amazon
  Scenario Outline: Load amazon page no logged user add item to cart

    Given Main page is load
    And Search for "<ItemName>" item
    And navigates to the "<pageSelected>" page
    And select the "<itemSelected>" item
    Then Verify item is aviable for purchase
    And Add the item to cart
    And Close page

    Examples:
      | TCID | ItemName |  pageSelected |  itemSelected |
      | 01   | Alexa    |  2            |  3            |