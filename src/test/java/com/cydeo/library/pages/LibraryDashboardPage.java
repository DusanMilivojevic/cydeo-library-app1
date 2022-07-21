package com.cydeo.library.pages;

import com.cydeo.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryDashboardPage {

    public LibraryDashboardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[.='Dashboard']")
    public WebElement dashboard;

    @FindBy (xpath = "(//h2)[1]")
    public WebElement numberOdUsers;

    @FindBy (xpath = "(//h2)[2]")
    public WebElement numberOfBooks;

    @FindBy (xpath = "(//h2)[3]")
    public WebElement numberOfBorrowedBooks;

}
