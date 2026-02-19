package com.willysalazar.example.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AndouformAuthentication {

    WebDriver driver;


    @FindBy(xpath = "//a[@href='/login']")
    private WebElement  authlogin;
    public AndouformAuthentication(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver,this);
    }
}
