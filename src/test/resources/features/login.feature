Feature: Library app login functionality
  Story: As a user, I should be able to login with correct credentials to different accounts. And dashboard should be displayed.
  Accounts are: librarian, student

  Scenario: login as a student
    Given User is on the login page
    When User enters student username
    And User enters student password
    Then User should see the dashboard


    Scenario: login as a librarian
      Given User is on the login page
      When User enters librarian username
      And User enters librarian password
      Then User should see the dashboard