
@Users
Feature: users feature functionality

  User Story: As a librarian i should be able to access USERS module so i can manage users

  Background:
    Given that librarian is logged in
    When user is on Users module
  @wip
  Scenario: Verify that librarian can add users
    When librarian clicks add user and fills out the form
    Then librarian can add users

  Scenario: Verify that librarian filter users by User Group
    When librarian chooses the option from user group
    Then librarian can see filtered search results by user group

  Scenario: Verify that librarian filter users by status
    When librarian chooses the option from status
    Then librarian can see filtered search results by status

  Scenario: Verify that librarian can search users by typing their name in search bar
  When librarian types in name in the search bar
    Then librarian can see the information about the user

  Scenario: Verify that librarian can see error message when types the wrong name in search bar -> Negative test
    When librarian types in non existing name in the search bar
    Then librarian can see error message "No data available in table"
