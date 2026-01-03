package com.willysalazar.example.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChallengingDomAndou {

    private WebDriver webDriver;

    @FindBy(xpath ="//a[@href='/challenging_dom']")
    private WebElement challengedom;

    @FindBy(tagName = "h3")
    private WebElement pagetitle;

    public ChallengingDomAndou(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
    }


   public ChallengingDomAndou monclick(){
        challengedom.click();
        return this;
    }

    public String thetitle(){
        return  pagetitle.getText();

    }
}
