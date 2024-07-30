@activity4
Feature: Data driven test without Example

@loginTest @loginSuccess
Scenario: Testing Login
    Given User is on Test Login page
    When User enters "admin" and "password" in login form
    Then Read the page title and confirmation message after login
    And Teardown the browser
    

  