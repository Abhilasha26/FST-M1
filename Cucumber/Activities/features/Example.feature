@FirstExample
Feature: Basic Syntax

@FirstScenario @SmokeTest
Scenario: Opening a webpage using Selenium
    Given User login to app
    When User click on About button
    Then Show Title of the page
   