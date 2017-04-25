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
        applicationManager.getContactHelper().fillContactForm(new ContactData("Stepan", "Ivanov", "Columbia Home Health Care ", "3354 E.Broad St", "3354 E.Broad St\nSTE H", "3354 E.Broad St\nSTE H\nColumbus, OH 43230", "614-308-0100", "info@columbiahhc.com"));
        applicationManager.getContactHelper().submitUpdate();
    }

}
