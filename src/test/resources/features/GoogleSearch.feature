Feature: Google Search Functionality
  Scenario: Validate Google Search is Working
    Given Browser is Open and Maximized
    When User is on Google Search Page
    When User Enters a text in the Search Box
    And User Hits Enter Key
    Then User gets Search Results
