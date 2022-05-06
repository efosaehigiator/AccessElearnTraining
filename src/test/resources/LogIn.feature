Feature: Login

@SignIn
  Scenario: As a user I want to be able to log in
    Given I am on the Landing Page of http://automationpractice.com/index.php
    And I click on the "signIn" button
    When I enter my emailAddress and Password
    And I click on Sign in Button
    Then I should be signed in  and a logout button should be visible
