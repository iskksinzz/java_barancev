package com.bek_qa.addressbook;

import com.bek_qa.addressbook.appManager.ApplicationManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by Bek on 4/24/2017.
 */
public class TestBase {

    protected final ApplicationManager applicationManager = new ApplicationManager();

    @BeforeMethod
    public void setUp() throws Exception {
        applicationManager.init();
    }

    @AfterMethod
    public void tearDown() {
        applicationManager.stop();
    }

}
