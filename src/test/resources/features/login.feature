@login
Feature: OrangeHRM Login


    Scenario: Verify valid login from login page
      Given I am on OrangeHRM login page
      When I enter Admin into username field on the login page
      And I enter admin123 into password field on the login page
      And I click on login button on login page
      Then I verify valid login message on sign in page



    Scenario: Verify Invalid login from login page
      Given I am on OrangeHRM login page
      When I enter incorrect username into username field on the login page
      And I enter incorrect password into password field on the login page
      And I click on login button on login page
      Then I see the error message on the login page
