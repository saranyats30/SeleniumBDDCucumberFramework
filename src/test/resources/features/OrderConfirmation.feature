@regression
Feature: Order Confirmation

  Scenario Outline: Verify item in Cart
    Given user is on login page
    When user enters username "<username>"and password "<password>"
    Then user should be logged in
    When user adds item "<product>" to cart
    And user clicks cart Icon
    Then cart Page should display item "<product>"
    When user clicks checkout button
    And user enters checkout information "<firstname>","<lastname>","<postalcode>"
    Then user clicks continue button
    Then user validated the total amount "<amount>"
    Then user clicks finish button
    Then user verify the order confirmation message "<confirmation>"
    Examples:
      | username      | password     | product             | firstname | lastname | postalcode | amount        | confirmation              |
      | standard_user | secret_sauce | Sauce Labs Backpack | Sara      | Bijin    | T2X3A5     | Total: $32.39 | Thank you for your order! |
      | visual_user   | secret_sauce | Sauce Labs Backpack | Sara      | Bijin    | T2X3A5     | Total: $32.39 | Thank you for your order! |