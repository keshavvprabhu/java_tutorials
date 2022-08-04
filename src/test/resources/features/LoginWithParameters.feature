Feature: Verify Login with Parameterized Values

  Scenario Outline: Verify Successful Login with Valid Credentials
    Given User is on Login Page
    When User Enters <username> and <password>
    When User Clicks Login Button
    Then User can access Home Page
    Examples:
    |username|password|
    |deadpool|12345   |
    |batman  |12345  |
    |superman|12345   |
