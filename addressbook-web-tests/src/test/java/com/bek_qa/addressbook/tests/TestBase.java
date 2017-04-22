package com.bek_qa.addressbook.tests;

import com.bek_qa.addressbook.appmanager.ApplicationManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by Bek on 4/20/2017.
 */
//1st Layer. This class initializes ApplicationManager object
// before each test method like GroupCreationTests runs
public class TestBase {

//ApplicationManager's methods are accessed with creation of
//reference object 'app'
    protected final ApplicationManager app = new ApplicationManager();

    @BeforeMethod
    public void setUp() throws Exception {
//This method 'init()' is accessed in 'ApplicationManager' through
// ref obj 'app' that we created above
        app.init();
    }

    @AfterMethod
    public void tearDown() {
//Same thing applies here
        app.stop();
    }

}

// And then each object is destroyed by GC once test method finishes running