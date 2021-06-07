Feature: User should be able to login
  @wip
  Scenario: Login as a user
    Given the user is on the home page
    When the user navigates to login page
    And the user enters username and password
    Then the user should be able to login successfully