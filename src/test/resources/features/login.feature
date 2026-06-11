@regression
Feature: Login

  Scenario Outline: Valid login
    Given user is on login page
    When user enters username "<username>"and password "<password>"
    Then user should be logged in
    Examples:
      | username      | password     |
      | standard_user | secret_sauce |