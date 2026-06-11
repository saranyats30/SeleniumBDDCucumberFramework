Feature: Cart

  Scenario Outline: Verify item in Cart
    Given user is on login page
    When user enters username "<username>"and password "<password>"
    Then user should be logged in
    When user adds item "<product>" to cart
    And user clicks cart Icon
    Then cart Page should display item "<product>"
    When user clicks checkout button
    And user enters checkout information "<firstname>","<lastname>","<postalcode>"
    Examples:
      | username      | password     | product             | firstname | lastname | postalcode |
      | standard_user | secret_sauce | Sauce Labs Backpack | Sara      | Bijin    | T2X3A5     |