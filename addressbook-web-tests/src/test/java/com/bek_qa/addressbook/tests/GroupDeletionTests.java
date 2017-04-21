package com.bek_qa.addressbook.tests;

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {

    @Test
    public void GroupDeletionTests() {
        app.getNavigationHelper().goToGroupPage();
        app.selectGroup();
        app.deleteSelectedGroups();
        app.returnToGroupPage();
    }

}
