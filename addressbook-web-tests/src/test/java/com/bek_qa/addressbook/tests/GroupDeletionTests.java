package com.bek_qa.addressbook.tests;

import org.testng.annotations.Test;

//This class contains the actual test in the form of method that
//has test methods inside it, which are located in different class
//'ApplicationManager' to which this test method is connected
//through ref obj 'app' that was created in class 'TestBase'
public class GroupDeletionTests extends TestBase {

    @Test
    public void GroupDeletionTests() {
        app.goToGroupPage();
        app.selectGroup();
        app.deleteSelectedGroups();
        app.returnToGroupPage();
    }

}
