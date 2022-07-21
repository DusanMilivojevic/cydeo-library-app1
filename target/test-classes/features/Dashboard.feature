
@Dashboard
Feature:  dashboard module

  User Story: As a librarian i should see number of users, books and borrowed books on dashboard

Scenario: Verify that as librarian i can se number of users, books and borrowed books
    Given that librarian is logged in
    When user is on dashboard module
    Then user should see number of users
    Then user should see number of books
    Then user should see number of borrowed books