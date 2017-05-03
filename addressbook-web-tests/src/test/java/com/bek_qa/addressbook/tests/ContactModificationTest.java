package com.bek_qa.addressbook.tests;

import com.bek_qa.addressbook.TestBase;
import com.bek_qa.addressbook.model.ContactData;
import org.testng.annotations.Test;

/**
 * Created by Bek on 4/25/2017.
 */
public class ContactModificationTest extends TestBase {
    @Test
    public void testContactModofocation(){
        applicationManager.getContactHelper().selectTopContact();
        applicationManager.getContactHelper().editContact();
        applicationManager.getContactHelper().fillContactForm(new ContactData("Stepan", "Ivanov", null), false);
        applicationManager.getContactHelper().submitUpdate();
    }

}
