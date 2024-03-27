Feature: login Test

  Background:
    Given Open app

  @TC_01  @smoke
  Scenario: login Test
    When Click GetStarted button
    And Choose topics
    And Click Continue button

  @TC_02  @smoke
  Scenario: search Item Test
    When Click GetStarted button
    And Choose topics
    And Click Continue button
    And Search "airpods" in FlipBoard
    Then Verify search text is "airpods"