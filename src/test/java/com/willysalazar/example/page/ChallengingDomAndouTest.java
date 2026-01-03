package com.willysalazar.example.page;

import com.willysalazar.example.utils.BaseTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ChallengingDomAndouTest extends BaseTest {

    private static final Logger LOGGER = LogManager.getLogger();
    private static final String thetitle="Challenging DOM";

    @Test
    void launch(){
        challengingDomAndou.monclick();
        assertEquals(challengingDomAndou.thetitle(),thetitle);
        LOGGER.info("Challenging Dom Andou Success");
        LOGGER.info(challengingDomAndou.thetitle());
    }

}