@regression
Feature: Inventory

  Scenario Outline: Verify inventory
    Given user is on login page
    When user enters username "<username>"and password "<password>"
    Then user should be logged in
    When user adds item "<product>" to cart
    Then Cart badge count should be 1
    Examples:
      | username      | password     | product             |
      | standard_user | secret_sauce | Sauce Labs Backpack |