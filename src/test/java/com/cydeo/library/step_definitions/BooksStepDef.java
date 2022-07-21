package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.LibraryBooksPage;
import com.cydeo.library.pages.LibraryDashboardPage;
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

public class BooksStepDef {

LibraryBooksPage books = new LibraryBooksPage();
WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
LibraryDashboardPage dashboardPage = new LibraryDashboardPage();
int numberOfBooks;

    @When("user is on Books module")
    public void user_is_on_books_module() {
        BrowserUtils.waitForVisibilityOf(dashboardPage.numberOfBooks);
        numberOfBooks = Integer.parseInt(dashboardPage.numberOfBooks.getText());
        books.books.click();
    }

    @When("librarian clicks add book and fills out the form")
    public void librarianClicksAddBookAndFillsOutTheForm() {
        books.addBooks.click();
        books.addBook();
    }

    @Then("librarian can added book")
    public void librarianCanAddedBook() {
        BrowserUtils.waitForVisibilityOf(books.bookHasBeenAddedMessage);
        Assert.assertTrue(books.bookHasBeenAddedMessage.isDisplayed());
        dashboardPage.dashboard.click();
        BrowserUtils.waitForVisibilityOf(dashboardPage.numberOfBooks);
        BrowserUtils.waitFor(1);
        Assert.assertEquals(Integer.parseInt(dashboardPage.numberOfBooks.getText()), numberOfBooks + 1);
    }

    @When("librarian click book category dropdown and select any category")
    public void librarianClickBookCategoryDropdownAndSelectAnyCategory() {
        Select select = new Select(books.bookCategories);
        select.selectByVisibleText("Drama");
    }

    @Then("librarian should see all books by that category")
    public void librarianShouldSeeAllBooksByThatCategory() {
        BrowserUtils.waitFor(1); // explicate wait doesn't work here AGAIN!
        wait.until(ExpectedConditions.visibilityOfAllElements(books.categories));
        for(WebElement each : books.categories){
            Assert.assertTrue(each.getText().equals("Drama"));
        }
    }

    @When("librarian input the name of the book")
    public void librarianInputTheNameOfTheBook() {
        books.search.sendKeys("Open water");
    }

    @Then("librarian should see that book on the top of the results")
    public void librarianShouldSeeThatBookOnTheTopOfTheResults() {
        BrowserUtils.waitFor(1);
        Assert.assertEquals("Open Water",Driver.getDriver().findElement(By.xpath("//td[3]")).getText());
    }

    @When("librarian inputs the non existing name of the book")
    public void librarianInputsTheNonExistingNameOfTheBook() {
        books.search.sendKeys("Bla bla bla");
    }

    @Then("librarian should see error message {string}")
    public void librarianShouldSeeErrorMessage(String msg) {
        BrowserUtils.waitForVisibilityOf(books.errorMessage);
        Assert.assertTrue(books.errorMessage.isDisplayed());
        Assert.assertEquals(msg,books.errorMessage.getText());
    }
}
