package com.bek_qa.addressbook.tests;

import com.bek_qa.addressbook.model.GroupData;
import com.bek_qa.addressbook.TestBase;
import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() {
        applicationManager.gotoGroupPage();
        applicationManager.initGroupCreation();
//used to be just fillGroupForm() until we refactored by extracting param obj, that created a separate class GroupData
        applicationManager.fillGroupForm(new GroupData("group name text", "group header test", "group footer test"));
        applicationManager.submitGroupCreation();
        applicationManager.returnToGroupPage();
    }

}
