package com.willysalazar.example.page;

import com.willysalazar.example.utils.BaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AndounewActionTest extends BaseTest {

    private static final Logger LOGGER = LogManager.getLogger();

    @Test
    void actioninbutton(){
        String titlePageAuthorized =
               andounewAction.
                        myclicknow().
                        navigateToBasicAuth("admin", "admin").
                        getTextTitleBasicAuthandou();
        Assert.assertEquals(titlePageAuthorized, "Digest Auth");
        LOGGER.info("Test Digest Auth Auth successful");

    }

}