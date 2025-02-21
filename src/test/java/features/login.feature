Feature: : Login Funitonality

  Scenario: single user login with valid credential
    Given user is on the login page
    When user enters username
    When user enters password
    And clicks on login button
    Then user should be redirected to the homepage

  Scenario Outline: User logs in with valid credentials
    Given User is on login page
    When User enters username "<username>" and password "<password>"
    And Clicks on login button
    Then User should be logged in successfully
    Examples:
      | username        | password     |
      | standard_user   | secret_sauce |
      | locked_out_user | secret_sauce |
      | problem_user    | secret_sauce |