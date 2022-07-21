Feature: login functionality

  User Story:
  As a user, I should be able to login with correct
  credentials to different accounts

  Background:
    Given user is on login page

    @student
  Scenario: login for student
    When student enters username and password
    Then student should see his credentials on the top right of the page

      @librerian
    Scenario: login for librarian
      When librarian enters username and password
      Then librarian should see his credentials on the top right of the page