package com.cydeo.library.pages;

import com.cydeo.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {

    public LibraryLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id = "inputEmail")
    public  WebElement emailBox;

    @FindBy (id = "inputPassword")
    public WebElement passwordBox;

    @FindBy (xpath = "//button[.='Sign in']")
    public WebElement signIn;

    public void loginStudent(){
        emailBox.sendKeys("student1@library");
        passwordBox.sendKeys("d5fv9BtX");
        signIn.click();
    }
    public void loginLibrarian(){
        emailBox.sendKeys("librarian1@library");
        passwordBox.sendKeys("qU9mrvur");
        signIn.click();
    }
}