package com.bek_qa.addressbook.tests;

        import com.bek_qa.addressbook.model.ContactData;
        import com.bek_qa.addressbook.TestBase;
        import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase {
    @Test
    public void testContactCreation() {
        applicationManager.getContactHelper().initContactCreation();
        applicationManager.getContactHelper().fillContactForm(new ContactData("Ivan", "Ivanov", "group_test1"), true);
        applicationManager.getContactHelper().submitContactCreation();

    }


}
