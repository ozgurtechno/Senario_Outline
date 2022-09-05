Feature: Calculator
  As a user
  I want to use a calculator to add numbers
  So that I don't need to add myself

  Scenario: Add two numbers
    Given I have a calculator
    When I add 12 and 3
    Then the result should be 15

