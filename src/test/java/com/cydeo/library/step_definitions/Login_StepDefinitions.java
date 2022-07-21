package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.LibraryHomePage;
import com.cydeo.library.pages.LibraryLoginPage;
import com.cydeo.library.utilities.ConfigurationReader;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_StepDefinitions {

    LibraryLoginPage login = new LibraryLoginPage();
    LibraryHomePage home = new LibraryHomePage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);


    @Given("user is on login page")
    public void user_is_on_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }

    @When("student enters username and password")
    public void studentEntersUsernameAndPassword() {
        login.loginStudent();
    }

    @Then("student should see his username on the top right of the page")
    public void studentShouldSeeHisUsernameOnTheTopRightOfThePage() {
        wait.until(ExpectedConditions.visibilityOf(home.userBar));
        Assert.assertTrue(home.userBar.getText().equals("Test Student 1"));
    }

    @When("librarian enters username and password")
    public void librarianEntersUsernameAndPassword() {
        login.loginLibrarian();
    }

    @Then("librarian should see his username on the top right of the page")
    public void librarianShouldSeeHisUsernameOnTheTopRightOfThePage() {
        wait.until(ExpectedConditions.visibilityOf(home.userBar));
        Assert.assertTrue(home.userBar.getText().equals("Test Librarian 1"));
    }

    @When("student enters {string} and {string}")
    public void studentEntersAnd(String username, String password) {
        login.emailBox.sendKeys(username);
        login.passwordBox.sendKeys(password);
        login.signIn.click();
    }

    @When("librarian enters {string} and {string}")
    public void librarianEntersAnd(String username, String password) {
        login.emailBox.sendKeys(username);
        login.passwordBox.sendKeys(password);
        login.signIn.click();
    }

    @When("user enters {string} and {string}")
    public void userEntersAnd(String username, String password) {
        login.emailBox.sendKeys(username);
        login.passwordBox.sendKeys(password);
        login.signIn.click();
    }

    @Then("user should see his {string} on the top right of the page")
    public void userShouldSeeHisOnTheTopRightOfThePage(String name) {
        wait.until(ExpectedConditions.visibilityOf(home.userBar));
        Assert.assertTrue(home.userBar.getText().equals(name));
    }

    @Then("student should see his credentials on the top right of the page")
    public void studentShouldSeeHisCredentialsOnTheTopRightOfThePage() {
    }

    @Then("librarian should see his credentials on the top right of the page")
    public void librarianShouldSeeHisCredentialsOnTheTopRightOfThePage() {
    }
}