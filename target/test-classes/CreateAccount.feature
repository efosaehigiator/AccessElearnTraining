Feature: SignIn

@Test
  Scenario: As a customer I should be able to create an account

    Given I navigate to http://automationpractice.com/index.php
    And I click on the signIn button
    When I enter my email address
    And I click on the create an account button
    Then a create an account page is displayed

@Test
  Scenario: I want to be able to enter my personal information.
    Given I click on the title button
    And I enter my firstName and LastName
    When I enter my password
    And I select my date of birth

@Test
  Scenario: I want to be able to enter my Address details
    Given I enter my address fields and values as below
    |  Fields                  | Values             |
    |   AddressFirstName       |   EveryOne         |
    |    AddressLastName       |     Good           |
    |   Address                |  10 xyz way        |
    | City                     |   Oslo             |
    |   State                  |   Alaska           |
    |Zip/PostalCode            |   81636           |
    |AdditionalInformation     | Every where Good   |
    |HomePhoneNumber           | 045421225          |
    |MobilePhoneNumber         | 0784545555         |
    |AddressAlias              | Selenium           |
    And I click on the register button
    Then I should be registered



