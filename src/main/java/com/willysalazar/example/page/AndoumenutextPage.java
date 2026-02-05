package com.willysalazar.example.page;

import com.mongodb.assertions.Assertions;
import com.willysalazar.example.utils.BaseTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;

public class AndoumenutextPage {

    private WebDriver driver;
    @FindBy(xpath = "//a[@href='/context_menu']")
    private WebElement contextmenu;
    @FindBy(xpath = "//div[@id='hot-spot']")
    private WebElement myrightclik;

    public AndoumenutextPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public AndoumenutextPage contextmenu(){
        contextmenu.click();
        Actions actions=new Actions(driver);
        actions.contextClick(myrightclik).perform();
        Alert alert = driver.switchTo().alert();

     String alerttext=alert.getText();
        alert.accept();

        return this;
    }
    public String getmytitle(){
        Alert alert=driver.switchTo().alert();
        return alert.getText();
    }



}
