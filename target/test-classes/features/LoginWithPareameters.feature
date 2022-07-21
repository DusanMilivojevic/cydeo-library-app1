Feature: login functionality

  User Story:
  As a user, I should be able to login with correct
  credentials to different accounts

  Background:
    Given user is on login page


  Scenario: login for student with parameterization
    When student enters "student1@library" and "d5fv9BtX"
    Then student should see his credentials on the top right of the page


  Scenario: login for librarian with parameterization
    When librarian enters "librarian1@library" and "qU9mrvur"
    Then librarian should see his credentials on the top right of the page

    Scenario: Login as librarian in the same line