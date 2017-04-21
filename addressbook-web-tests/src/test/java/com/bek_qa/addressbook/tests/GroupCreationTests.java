package com.bek_qa.addressbook.tests;

import com.bek_qa.addressbook.model.GroupData;
import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        app.getNavigationHelper().goToGroupPage();
        app.createNewGroup();
        app.fillGroupForm(new GroupData("test7", "test8", "test9"));
        app.submitGroupCreation();
        app.returnToGroupPage();
    }

}
