package com.bek_qa.addressbook;

import com.bek_qa.addressbook.appmanager.ApplicationManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by Bek on 4/20/2017.
 */
//1st Layer. This class initializes ApplicationManager object
// before each test method like GroupCreationTests runs
public class LinkToApplicationManager {

    protected final ApplicationManager applicationManager = new ApplicationManager();

    @BeforeMethod
    public void setUp() throws Exception {
//This method 'init()' is accessed in 'ApplicationManager' through
// ref obj 'applicationManager' that we created above
        applicationManager.init();
    }

    @AfterMethod
    public void tearDown() {
//Same thing applies here
        applicationManager.stop();
    }

}

//Video 9
//ApplicationManager's methods are accessed with creation of
//reference object 'applicationManager'
// And then each object is destroyed by GC once test method
// finishes running

//Video 10
//When Delegation happens ref obj is created to connect to class
//in which needed methods are located through getters
