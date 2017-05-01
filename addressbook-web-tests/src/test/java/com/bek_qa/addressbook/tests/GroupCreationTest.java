package com.bek_qa.addressbook.tests;

import com.bek_qa.addressbook.model.GroupData;
import com.bek_qa.addressbook.TestBase;
import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() {
        applicationManager.getNavigationHelper().gotoGroupPage();
        applicationManager.getGroupHelper().initGroupCreation();
        applicationManager.getGroupHelper().fillGroupForm(new GroupData("group name text", null, null));
        applicationManager.getGroupHelper().submitGroupCreation();
        applicationManager.getGroupHelper().returnToGroupPage();
    }

}
