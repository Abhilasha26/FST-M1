#Sample Feature Definition Template
@activity5
Feature: Login Test with Example
  I want to use this template for my feature file

  Scenario Outline: Testing Login with Example
    Given User is on LoginTest
    When User enters "<Usernames>" and "<Passwords>"
    Then Read the page title and confirmation message
    And Close the Browser

    Examples: 
      | Usernames | Password |
      | admin     | password|
      | adminuser | password |
