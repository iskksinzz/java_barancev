package com.bek_qa.addressbook.tests;

import com.bek_qa.addressbook.TestBase;
import org.testng.annotations.Test;

/**
 * Created by Bek on 4/25/2017.
 */
public class ContactDeletionTest extends TestBase {
    @Test
    public void testContactDeletion() {
        applicationManager.getContactHelper().selectTopContact();
        applicationManager.getContactHelper().deleteSelectedContact();
        applicationManager.getContactHelper().clickDialogBox();
    }
}
