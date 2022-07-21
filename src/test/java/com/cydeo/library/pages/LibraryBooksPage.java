package com.cydeo.library.pages;

import com.cydeo.library.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class LibraryBooksPage {

    public LibraryBooksPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[.='Books']")
    public WebElement books;

    @FindBy(id = "book_categories")
    public WebElement bookCategories;

    @FindBy (xpath = "//input[@type='search']")
    public WebElement search;

    @FindBy(css = ".portlet-title [data-target]")
    public WebElement addBooks;

    @FindBy(xpath = "//td[5]")
    public List<WebElement> categories;

    @FindBy(xpath ="//td[.='No data available in table']")
    public WebElement errorMessage;

    // inside add books web elements

    @FindBy (xpath = "//input[@name='name']")
    public WebElement bookName;

    @FindBy(xpath = "//input[@name='isbn']")
    public WebElement isbn;

    @FindBy (xpath = "//input[@name='year']")
    public WebElement year;

    @FindBy (xpath = "//input[@name='author']")
    public WebElement author;

    @FindBy (id = "book_group_id")
    public WebElement bookGroupId;

    @FindBy (xpath = "//textarea[@name='description']")
    public WebElement description;

    @FindBy (xpath = "//button[.='Save changes']")
    public WebElement saveChanges;

    @FindBy(xpath = "//div[.='The book has been created.']")
    public WebElement bookHasBeenAddedMessage;

    public void addBook(){
        Faker faker = new Faker();
        bookName.sendKeys(faker.book().title());
        isbn.sendKeys(faker.number().digits(10));
        year.sendKeys(faker.numerify("19##"));
        author.sendKeys(faker.book().author());
        Select select = new Select(bookGroupId);
        select.selectByValue(String.valueOf((faker.number().numberBetween(1,10))));
        description.sendKeys(faker.book().genre() + " " + faker.book().publisher());
        saveChanges.click();
    }
}
