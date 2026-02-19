package com.willysalazar.example.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AndounewAction {

    WebDriver webDriver;

    @FindBy(xpath ="//a[@href='/digest_auth']")
    private WebElement myclicknow;
    @FindBy(xpath = "//*[@id='content']/div/h3")
    private WebElement basictitle;

    public AndounewAction(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
    }

    public String getTextTitleBasicAuthandou() {
        return basictitle.getText();
    }

    public AndounewAction myclicknow(){
        myclicknow.click();
        return this;
    }

    public AndounewAction navigateToBasicAuth(String user, String pass){
        webDriver.navigate().to("http://" + user + ":" + user + "@the-internet.herokuapp.com/digest_auth");
        return this;
    }
}
