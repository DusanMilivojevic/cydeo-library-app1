package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.LibraryHomePage;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LogoutStepDef {
LibraryHomePage home = new LibraryHomePage();

    @When("user clicks logout")
    public void user_clicks_logout() {
        home.userBar.click();
        home.logOut.click();
    }
    @Then("user should navigated to login page")
    public void user_should_navigated_to_login_page() {
        Assert.assertEquals("Login - Library", Driver.getDriver().getTitle());
    }

}
