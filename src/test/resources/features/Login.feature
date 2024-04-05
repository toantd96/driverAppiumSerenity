Feature: login Test

  Background:
    Given Open app

  @TC_01  @smoke  @mobile
  Scenario: Internal money transfer
    When Click GetStarted Ipay
    And User transfer in bank
    And User transfer in Vietinbank
    And Choose Account To
    And Choose amount money to transfer "5000"
    And Confirm Transaction

    And Go to google
    And Search "airpods" in google

    Given I have an user
    When I call API to get user
    Then the API should return status 200

  @TC_02  @smoke
  Scenario: search Item Test
    When Mở app vietinBank iPay
    And Người dùng vào chức năng chuyển tiền
    And Choose Account To
    And Choose amount money to transfer "5000"