package com.bek_qa.addressbook.tests;

import com.bek_qa.addressbook.model.GroupData;
import com.bek_qa.addressbook.TestBase;
import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() {
        applicationManager.getNavigationHelper().gotoGroupPage();
        applicationManager.getGroupHelper().createGroup(new GroupData("test1", null, null));
    }

}
