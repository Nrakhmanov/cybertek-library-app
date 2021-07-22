Feature: Data tables task
  Story: As a user, I should be able to login as librarian. When I go to Users page, table
  should have following columns:
  • Actions
  • UserID
  • Full Name
  • Email
  • Group
  • Status

  @wip
  Scenario: login as a librarian
    Given User is on the login page
    When User enters librarian username
    And User enters librarian password
    When User clicks on Users link
    Then User should be able to see columns