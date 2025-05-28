Feature: OrangeHRM Login Functionality

  Scenario: Failed login with invalid credentials
    Given I am on the OrangeHRM login page
    When I enter invalid username and password
    And I click on the login button
    Then I should see an error message
    
  Scenario: Successful login with valid credentials
    Given I am on the OrangeHRM login page
    When I enter valid username and password
    And I click on the login button
    Then I should be logged in successfully
    And I should see the dashboard page

