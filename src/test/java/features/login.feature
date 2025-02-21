Feature: : Login Funitonality

  Scenario: single user login with valid credential
    Given user is on the login page
    When user enters username
    When user enters password
    And clicks on login button
    Then user should be redirected to the homepage