package com.bek_qa.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        goToGroupPage();
        createNewGroup();
        fillGroupForm(new GroupData("test7", "test8", "test9"));
        submitGroupCreation();
        returnToGroupPage();
    }

}
