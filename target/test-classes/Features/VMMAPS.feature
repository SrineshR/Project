Feature: Verify VMMAPS Accounts Login Page

  Scenario: Validate Login with Valid Credentials
    Given User is on VMMAPS Accounts login page
    When User enter Username and Password and click on Login Button
    Then VMMAPS Homepage will be displayed

  Scenario: Validate Registration with Valid Credentials
    Given User is on VMMAPS Accounts login page
    When Click on Register here Button
    Then Sign Up Page will be displayed

  Scenario: Validate Forget Password with Valid Credentials
    Given User is on VMMAPS Accounts login page
    When Click on Forget Password Button
    Then Give the Email ID and Enter
