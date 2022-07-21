Feature: As a user, i should
@Search
  Scenario:
    Given that I am on login page
    When I login as a librarian
    When I click on Users link
    Then I should see following columns:
      | Actions   |
      | User ID   |
      | Full Name |
      | Email     |
      | Group     |
      | Status    |