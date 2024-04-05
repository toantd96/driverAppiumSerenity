Feature: login Test

  Background:
    Given Open app

  @TC_01  @smoke  @mobile
  Scenario: login Test
    When Click GetStarted button
    And Choose topics
    And Click Continue button

    And Go to google
    And Search "airpods" in google

    Given I have an user
    When I call API to get user
    Then the API should return status 200

  @TC_02  @smoke
  Scenario: search Item Test
    When Click GetStarted button
    And Choose topics
    And Click Continue button
    And Search "airpods" in FlipBoard
    Then Verify search text is "airpods"