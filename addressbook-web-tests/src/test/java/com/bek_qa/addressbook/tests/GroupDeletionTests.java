package com.bek_qa.addressbook.tests;

import com.bek_qa.addressbook.LinkToApplicationManager;
import org.testng.annotations.Test;

//This class contains the actual test in the form of method that
//has test methods inside it, which are located in different class
//'ApplicationManager' to which this test method is connected
//through ref obj 'applicationManager' that was created in class 'LinkToApplicationManager'
public class GroupDeletionTests extends LinkToApplicationManager {

    @Test
    public void GroupDeletionTests() {
        applicationManager.getNavigationHelper().goToGroupPage();
        applicationManager.getGroupHelper().selectGroup();
        applicationManager.getGroupHelper().deleteSelectedGroups();
        applicationManager.getGroupHelper().returnToGroupPage();
    }

}
