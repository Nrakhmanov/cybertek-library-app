Feature: Library app login functionality
  Story: As a user, I should be able to login with correct credentials to different accounts. And dashboard should be displayed.
  Accounts are: librarian, student


  Scenario Outline: login as a student
    Given User is on the login page
    When User enters student "<username>"
    And User enters "<password>"
    Then User should see the dashboard
    Examples:
      | username | password |
    |student11@library|tScBPCUr|
    |student12@library|UC0LC9Hj|
    |student13@library|zcVbvUWH|
    |student14@library|6SW236ia|

    @scenarioOutline
    Scenario Outline: login as a librarian
      Given User is on the login page
      When User enters librarian "<username>"
      And User enters "<password>"
      Then User should see the dashboard
      Examples:
        | username | password |
        |librarian13@library|9rf6axdD|
        |librarian14@library|87x8afWY|
        |librarian15@library|S5Ejblg1|

