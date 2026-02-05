package com.willysalazar.example.page;

import com.willysalazar.example.utils.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class AndoumenutextPageTest extends BaseTest {

    private static final String TITLE_ALERT_EXPECTED= "You selected a context menu";
    @Test
    void contextmenu(){
        andoumenutextpage.contextmenu();

//   Assertions.assertTrue(andoumenutextpage.getmytitle().startsWith(TITLE_ALERT_EXPECTED));


    }


}
