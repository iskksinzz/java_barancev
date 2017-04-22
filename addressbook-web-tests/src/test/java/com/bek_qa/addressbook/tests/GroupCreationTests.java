package com.bek_qa.addressbook.tests;

import com.bek_qa.addressbook.model.GroupData;
import org.testng.annotations.Test;

//This class contains the actual test in the form of method that
//has test methods inside it, which are located in different class
//'ApplicationManager' to which this test method is connected
//through ref obj 'app' that was created in class 'TestBase'
public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        app.goToGroupPage();
        app.getGroupHelper().createNewGroup();
        app.getGroupHelper().fillGroupForm(new GroupData("test7", "test8", "test9"));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupPage();
    }

}
