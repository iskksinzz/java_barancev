package com.bek_qa.addressbook;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase {
    @Test
    public void testContactCreation() {
        initContactCreation();
        fillContactForm(new ContactData("Ivan", "Ivanov", "Columbia Home Health Care ", "3354 E.Broad St", "3354 E.Broad St\nSTE H", "3354 E.Broad St\nSTE H\nColumbus, OH 43230", "614-308-0100", "info@columbiahhc.com"));
        submitContactCreation();
        returnToHomePage();
    }


}
