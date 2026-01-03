package com.willysalazar.example.page;

import com.willysalazar.example.utils.BaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AndouAuthTest extends BaseTest {
    private static final Logger LOGGER = LogManager.getLogger();

    @Test
    public void shouldValidateBasicAuth(){
        String titlePageAuthorized =
                basicAuthPage.
                        clickLinkBasicAuth().
                        navigateToBasicAuth("admin", "admin").
                        getTextTitleBasicAuth();
        Assert.assertEquals(titlePageAuthorized, "Basic Auth");
        LOGGER.info("Test Basic Auth successful");
    }


}