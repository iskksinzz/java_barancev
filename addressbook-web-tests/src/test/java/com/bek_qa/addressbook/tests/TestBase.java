package com.bek_qa.addressbook.tests;

import com.bek_qa.addressbook.appmanager.ApplicationManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by Bek on 4/20/2017.
 */
public class TestBase {

    //1st Layer. This class initializes ApplicationManager object  before each test method like GroupCreationTests runs
    protected final ApplicationManager app = new ApplicationManager();

    @BeforeMethod
    public void setUp() throws Exception {
        app.init();
    }

    @AfterMethod
    public void tearDown() {
        app.stop();
    }

}

// And then each object is destroyed by GC once test method finishes running