Feature: Determine if String is Palindrome or not. A string is a palindrome if it reads
  the same backwards as forwards.

  Scenario Outline: Check if String is Palindrome
    Given I entered word <wordToTest>
    When I test it for Palindrome
    Then the output should be <output>

    Examples:
      | wordToTest | output  |
      | "Refer"    | "true"  |
      | "Coin"     | "false" |
      | "Space"    | "false" |
      | "racecar"  | "true"  |