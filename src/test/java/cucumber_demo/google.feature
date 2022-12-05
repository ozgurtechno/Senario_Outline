Feature: GoogleTest


  Scenario: Search technoStudy on google
    Given Open google.com page
    When I search for TechnoStudy
    Then Result should be displayed