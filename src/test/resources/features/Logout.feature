@smoke @logout

Feature: Logout functionality
  User Story: User should be able to logout after logging in

  Scenario:
    Given that librarian is logged in
    When user clicks logout
    Then user should navigated to login page