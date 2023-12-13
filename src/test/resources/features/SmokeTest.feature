Feature: this feature is for smoke tests

  @smoke
  Scenario: Smoke Test
    Given I print Hello World
    Then everybody is happy

  @regression
  Scenario: This is for Cucumber test
    Given I run Cucumber test
    Then verify this is Cucumber