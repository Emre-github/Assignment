
Feature: Searching items


  Background: User has already logged in
    Given the user is on the home page
    When the user navigates to login page
    And the user enters username and password
    Then the user should be able to login
  @wip
  Scenario: User should be able to add an item to the basket
    Given the user enters name of the item in search box
    When the user navigates to item's second page
    And the user selects an item from second page of the item's page
    And the user keeps the information of the item in txt file
    Then the user adds the item to the basket



  Scenario: User should be able to modify basket
    Given the user has already added an item to the basket
    When the user increases the quantity of the item as 2
    And the user deletes items from the basket
    Then the basket should be empty