@activity2
Feature: Login Test
@SmokeTest
Scenario: Testing Login
    Given User is on Login page
    When User enters username and password
    And clicks the submit button
    Then get the confirmation text and verify message as "Welcome Back, admin"
    