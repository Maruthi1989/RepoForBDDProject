Feature: Login functionality

  Scenario: Validate the login functionality with the valid credentials
    Given User is on the login page
    When User enters the username and password
    When User click on the login button
    Then User is navigated to homepage
