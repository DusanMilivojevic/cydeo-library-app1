package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.LibraryHomePage;
import com.cydeo.library.pages.LibraryLoginPage;
import com.cydeo.library.pages.LibraryUsersPage;
import com.cydeo.library.utilities.ConfigurationReader;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchStepDef {
    LibraryLoginPage login = new LibraryLoginPage();
    LibraryHomePage home = new LibraryHomePage();
    LibraryUsersPage usersPage = new LibraryUsersPage();

    @Given("that I am on login page")
    public void that_i_am_on_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }

    @When("I login as a librarian")
    public void i_login_as_a_librarian() {
        login.loginLibrarian();
    }

    @When("I click on Users link")
    public void i_click_on_users_link() {
        home.users.click();
    }

    @Then("I should see following columns:")
    public  void I_should_see_following_columns(List<String> names) {
        for (int i = 0; i < usersPage.headers.size(); i++) {
            Assert.assertTrue(usersPage.headers.get(i).getText().equals((names.get(i))));
        }
    }

}
