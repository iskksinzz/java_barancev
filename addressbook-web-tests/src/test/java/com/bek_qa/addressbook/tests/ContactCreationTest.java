package com.bek_qa.addressbook.tests;

        import com.bek_qa.addressbook.model.ContactData;
        import com.bek_qa.addressbook.TestBase;
        import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase {
    @Test
    public void testContactCreation() {
        applicationManager.getContactHelper().initContactCreation();
        applicationManager.getContactHelper().fillContactForm(new ContactData("Ivan", "Ivanov", "Columbia Home Health Care ", "3354 E.Broad St", "3354 E.Broad St\nSTE H", "3354 E.Broad St\nSTE H\nColumbus, OH 43230", "614-308-0100", "info@columbiahhc.com"));
        applicationManager.getContactHelper().submitContactCreation();

    }


}
