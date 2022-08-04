Feature: Testing Login Functionality

  Scenario: Verify Successful Login with Valid Credentials
    Given User is on Login Page
    When User Enters username and password
    When User Clicks Login Button
    Then User can access Home Page


#  Scenario: Verify That Logger In User can Logout
#    Given User is on Home Page
#    When User Clicks on Logout Button
#    Then User can see the Login Page