package com.bek_qa.addressbook.tests;

import com.bek_qa.addressbook.LinkToApplicationManager;
import com.bek_qa.addressbook.model.GroupData;
import org.testng.annotations.Test;

//This class contains the actual test in the form of method that
//has test methods inside it, which are located in different class
//'ApplicationManager' to which this test method is connected
//through ref obj 'applicationManager' that was created in class 'LinkToApplicationManager'
public class GroupCreationTests extends LinkToApplicationManager {

    @Test
    public void testGroupCreation() {
        applicationManager.getNavigationHelper().goToGroupPage();
        applicationManager.getGroupHelper().createNewGroup();
        applicationManager.getGroupHelper().fillGroupForm(new GroupData("test7", "test8", "test9"));
        applicationManager.getGroupHelper().submitGroupCreation();
        applicationManager.getGroupHelper().returnToGroupPage();
    }

}

