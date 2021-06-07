Feature: Modifying a board

    @api
  Scenario: Modify a board
    Given the user has logged in
    When the user create a board
    Then the status code should be 200, and content-type should be "application/json"
    When the user adds two card to the board
    Then the status code should be 200
    When the user update one of the card
    Then the status code should be 200
    When delete all cards and board
    Then the status code should be 200