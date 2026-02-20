package com.willysalazar.example.page;

import com.willysalazar.example.utils.BaseTest;

import org.testng.annotations.Test;

public class AndoumenutextPageTest extends BaseTest {

    private static final String TITLE_ALERT_EXPECTED= "You selected a context menu";
    @Test
    void contextmenu(){
        andoumenutextpage.contextmenu();

//   Assertions.assertTrue(andoumenutextpage.getmytitle().startsWith(TITLE_ALERT_EXPECTED));


    }


}
