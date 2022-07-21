package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.LibraryDashboardPage;
import com.cydeo.library.pages.LibraryLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DashboardStepDef {

    LibraryLoginPage login = new LibraryLoginPage();
    LibraryDashboardPage dashboardPage = new LibraryDashboardPage();


    @Given("that librarian is logged in")
    public void that_librarian_is_logged_in() {
        login.loginLibrarian();
    }

    @When("user is on dashboard module")
    public void user_is_on_dashboard_module() {
        dashboardPage.dashboard.click();
    }

    @Then("user should see number of users")
    public void user_should_see_number_of_users() {
        Assert.assertTrue(dashboardPage.numberOdUsers.isDisplayed());
    }


    @Then("user should see number of books")
    public void user_should_see_number_of_books() {
        Assert.assertTrue(dashboardPage.numberOfBooks.isDisplayed());
    }


    @Then("user should see number of borrowed books")
    public void user_should_see_number_of_borrowed_books() {
        Assert.assertTrue(dashboardPage.numberOfBorrowedBooks.isDisplayed());
    }
}
