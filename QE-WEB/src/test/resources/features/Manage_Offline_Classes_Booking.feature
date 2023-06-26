Feature: As a admin i want to manage offline classes booking so that i can see detail offline classes booking

  Background:
    Given admin on login page
    And admin click menu class
    And admin click manage booking menu
    And admin on manage booking page

  @BookingOffline-1
  Scenario: as a admin i want to see all offline classes booking
    When admin click offline menu
    Then admin can see all offline classes booking

  @BookingOffline-2
  Scenario: as a admin i want to see detail offline classes booking
    When admin click offline menu
    And admin click point three
    And admin click view detail button
    Then admin can see detail offline classes booking