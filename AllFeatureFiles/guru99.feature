Feature: Test guru99 Application

  Scenario: Test RegisterPage Functionality
    Given User on Register Page
    When User Enter All Contact Information
    And User Enter All MAiling Information
    And User Enter All User Information
    Then User Click on Submit Button

  Scenario: Test RegisterSuccessPage Functionality
    When Validate HomePage Title
    Then Click on Sign In

  Scenario: Test Login Page Functionality
    When User Enter Username and Password
    Then Click on login button

  Scenario: Test LoginSuccessPage Functionality
    Then User validate LoginPage url and LOginPage Title
    And User Capture Physical text
