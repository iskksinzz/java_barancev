package com.bek_qa.addressbook.tests;

import com.bek_qa.addressbook.TestBase;
import com.bek_qa.addressbook.model.GroupData;
import org.testng.annotations.Test;

public class GroupDeletionTest extends TestBase {

    @Test
    public void GroupDeletionTest() {
        applicationManager.getNavigationHelper().gotoGroupPage();
        if(!applicationManager.getGroupHelper().isThereAGroup()){
            applicationManager.getGroupHelper().createGroup(new GroupData("test1", null, null));
        }
        applicationManager.getGroupHelper().selectGroup();
        applicationManager.getGroupHelper().deletSelectedGroups();
        applicationManager.getGroupHelper().returnToGroupPage();
    }

}
