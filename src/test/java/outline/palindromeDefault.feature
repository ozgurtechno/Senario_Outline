Feature: IsPalindrome

Scenario: Valid Palindrome
  Given I entered string "Refer"
  When I test it for Palindrome
  Then the result should be "true"

Scenario: Invalid Palindrome
  Given I entered string "Coin"
  When I test it for Palindrome
  Then the result should be "false"