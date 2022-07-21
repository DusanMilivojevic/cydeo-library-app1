package com.cydeo.library.pages;

import com.cydeo.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryHomePage {

    public LibraryHomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy ( xpath = "//a[@id='navbarDropdown']/span")
    public WebElement userBar;

    @FindBy(xpath = "//span[.='Users']")
    public WebElement users;

    @FindBy (xpath = "//a[.='Log Out']")
    public WebElement logOut;

}