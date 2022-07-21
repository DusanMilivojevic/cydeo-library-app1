package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.LibraryDashboardPage;
import com.cydeo.library.pages.LibraryUsersPage;
import com.cydeo.library.utilities.BrowserUtils;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.util.List;

public class UsersStepDef {

    LibraryUsersPage users = new LibraryUsersPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    LibraryDashboardPage dashboard = new LibraryDashboardPage();
    int numberOfUsers;

    @When("user is on Users module")
    public void user_is_on_users_module() {
        BrowserUtils.waitForVisibilityOf(dashboard.numberOdUsers);
        numberOfUsers = Integer.parseInt(dashboard.numberOdUsers.getText());
        users.users.click();
        System.out.println(numberOfUsers);
    }

    @When("librarian clicks add user and fills out the form")
    public void librarianClicksAddUserAndFillsOutTheForm() {
        users.inputNewUser();
    }

    @Then("librarian can add users")
    public void librarianCanAddUsers() throws InterruptedException {
        BrowserUtils.waitForVisibilityOf(users.confirmedMessageForNewUser);
        Assert.assertTrue(users.confirmedMessageForNewUser.isDisplayed());
        dashboard.dashboard.click();
        BrowserUtils.waitForVisibilityOf(dashboard.numberOdUsers);
        Assert.assertTrue(Integer.parseInt(dashboard.numberOdUsers.getText()) == numberOfUsers + 1);

    }

    @When("librarian chooses the option from user group")
    public void librarianChoosesTheOptionFromUserGroup() throws InterruptedException {
        Select userGroups = new Select(users.usersGroups);
        userGroups.selectByVisibleText("Librarian");
    }


    @Then("librarian can see filtered search results by user group")
    public void librarianCanSeeFilteredSearchResultsByUserGroup() {
        BrowserUtils.waitFor(1);
        wait.until(ExpectedConditions.visibilityOfAllElements(users.groupNames));
        for (WebElement each : users.groupNames) {
            Assert.assertEquals("Librarian", each.getText());
        }
    }

    @When("librarian chooses the option from status")
    public void librarianChoosesTheOptionFromStatus() {
        Select select = new Select(users.usersStatus);
        select.selectByVisibleText("ACTIVE");

    }

    @Then("librarian can see filtered search results by status")
    public void librarianCanSeeFilteredSearchResultsByStatus() {
        for (WebElement each : users.statuses) {
            Assert.assertEquals("ACTIVE", each.getText());
        }
    }

    @When("librarian types in name in the search bar")
    public void librarianTypesInNameInTheSearchBar() {
        users.search.sendKeys("Ratko");
    }

    @Then("librarian can see the information about the user")
    public void librarianCanSeeTheInformationAboutTheUser() {
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//td[3]")).getText().contains("Ratko"));
    }

    @When("librarian types in non existing name in the search bar")
    public void librarianTypesInNonExistingNameInTheSearchBar() {
        users.search.sendKeys("Tkdfjg");
    }

    @Then("librarian can see error message {string}")
    public void librarianCanSeeErrorMessage(String arg0) {
        Assert.assertTrue(users.errorMessage.isDisplayed());
    }
}