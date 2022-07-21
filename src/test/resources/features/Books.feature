@Books
Feature: books module functionality

  User Story: As a librarian i should be able to access BOOKS module so i can manage books

  Background:
    Given that librarian is logged in
    When  user is on Books module
  @wip
  Scenario: Verify that librarian can add books
    When librarian clicks add book and fills out the form
    Then librarian can added book

  Scenario: Verify that librarian can filter books by book category
    When librarian click book category dropdown and select any category
    Then librarian should see all books by that category

  Scenario: Verify that librarian can search book by inputting the name in search box
    When librarian input the name of the book
    Then librarian should see that book on the top of the results

  Scenario: Verify that librarian can see error message when inputting the non existing books name
    When librarian inputs the non existing name of the book
    Then librarian should see error message "No data available in table"