package com.willysalazar.example.utils;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import com.willysalazar.example.driver.DriverFactory;
import com.willysalazar.example.page.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import com.willysalazar.example.report.ReportListener;

import static com.willysalazar.example.utils.PropertyLoader.returnConfigValue;

@Listeners({ExtentITestListenerClassAdapter.class, ReportListener.class})
public abstract class BaseTest {

    protected static WebDriver driver;
    protected WelcomePage welcomePage;
    protected AbPage abPage;
    protected AddRemoveElementsPage addRemoveElementsPage;
    protected BasicAuthPage basicAuthPage;
    protected ChallengingDomAndou challengingDomAndou;
    protected AndoumenutextPage andoumenutextpage;

    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeMethod
    public void preCondition() {
        driver = new DriverFactory().createInstance();
        driver.manage().window().maximize();
        driver.get(returnConfigValue("url.base"));
        welcomePage = new WelcomePage(driver);
        abPage = new AbPage(driver);
        addRemoveElementsPage = new AddRemoveElementsPage(driver);
        basicAuthPage = new BasicAuthPage(driver);
        challengingDomAndou=new ChallengingDomAndou(driver);
        andoumenutextpage=new AndoumenutextPage(driver);
    }

    @AfterMethod
    public void postCondition(){
        driver.quit();
    }
}