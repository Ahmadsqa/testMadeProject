Feature: Search for newly added range in stock
  as a customer
  i wannt the ability to search all newly arrival items
  so that i can review the details of items before adding into basket.
  // Scenario No. 1 for new arrival of stock in may 2020
  Scenario Outline: new arrival search
    Given i navigate to madeCom homepage
    When i click on new tab
    And i click  new living room link
    And i click colour tab
    And i click on red colour
    And i click the done button
    And i click product type tab
    And i click the sofa checkbox
    And i click on corner sofa checkbox
    And i click on done button
    And i click dispatch tab
    And i click on arrive in 2 weeks checkbox
    And i click the done button
    And i enter the minimum price as "<minPrice>"
    And i enter maximum price as "<maxPrice>"
    And i click the done button
    And i click the style tab
    And i click modern checkbox
    And i click retro checkbox
    And i click the done button
    And i click the room type check box
    And i click on bedroom checkbox
    And i click on office
    And i click the done button
    Then the results based on above criteria are displayed on the same homepage.
    Examples:
      | minPrice | maxPrice |
      |    £15   |£1,699    |
      |£1267     |£1557     |

