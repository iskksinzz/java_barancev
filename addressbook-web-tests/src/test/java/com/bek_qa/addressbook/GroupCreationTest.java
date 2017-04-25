package com.bek_qa.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() {
        gotoGroupPage();
        initGroupCreation();

//used to be just fillGroupForm() until we refactored by extracting param obj, that created a separate class GroupData
        fillGroupForm(new GroupData("group name text", "group header test", "group footer test"));

        submitGroupCreation();
        returnToGroupPage();
    }

}
