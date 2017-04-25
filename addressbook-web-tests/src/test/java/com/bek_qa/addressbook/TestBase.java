package com.bek_qa.addressbook;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by Bek on 4/24/2017.
 */
public class TestBase extends ApplicationManager {

    @BeforeMethod
    public void setUp() throws Exception {
        init();
    }

    @AfterMethod
    public void tearDown() {
        stop();
    }

}
