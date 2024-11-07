@Login
Feature: Login page

  Background: 
    Given I am on the saucedemo login page

  @Sanity @Regression @pravin
  Scenario: Sucessfull Login
    When I entered valid username and password
    And I click on login button
    Then I verify user land on home page

 