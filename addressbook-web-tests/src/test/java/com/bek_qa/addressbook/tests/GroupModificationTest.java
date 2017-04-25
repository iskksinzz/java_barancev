package com.bek_qa.addressbook.tests;

import com.bek_qa.addressbook.TestBase;
import com.bek_qa.addressbook.model.GroupData;
import org.testng.annotations.Test;

/**
 * Created by Bek on 4/25/2017.
 */
public class GroupModificationTest extends TestBase {
    @Test
    public void testGroupModification(){
        applicationManager.getNavigationHelper().gotoGroupPage();
        applicationManager.getGroupHelper().selectGroup();
        applicationManager.getGroupHelper().editGoup();
        applicationManager.getGroupHelper().fillGroupForm(new GroupData("group name modified", "group header test", "group footer modified"));
        applicationManager.getContactHelper().submitUpdate();
        applicationManager.getNavigationHelper().gotoGroupPage();
    }
}
