Feature: Calculator
  As a user
  I want to use a calculator to add numbers
  So that I don't need to add myself

  Scenario Outline: Add two numbers
    Given I have a calculator
    When I add <num1> and <num2>
    Then the result should be <total>

    Examples:
      | num1  | num2  | total |
      | 12    | 7     | 19 |
      | 11    | 8     | 19 |
      | 44    | 22    | 66 |
