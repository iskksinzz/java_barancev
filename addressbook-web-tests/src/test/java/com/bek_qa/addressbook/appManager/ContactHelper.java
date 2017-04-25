package com.bek_qa.addressbook.appManager;

import com.bek_qa.addressbook.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Bek on 4/24/2017.
 */
public class ContactHelper extends HelperBase {

    public ContactHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void initContactCreation() {
          wd.findElement(By.linkText("add new")).click();
    }

    public void fillContactForm(ContactData contactData) {
        type(By.name("firstname"),contactData.getfName());
        type(By.name("lastname"),contactData.getlName());
        type(By.name("company"),contactData.getCompanyName());
        type(By.name("address"),contactData.getAddress());
        type(By.name("address"),contactData.getSuite());
        type(By.name("address"),contactData.getCityStateZip());
        type(By.name("work"),contactData.getWorkPhone());
        type(By.name("email"),contactData.getEmail());
    }

    public void submitContactCreation() {
          wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
    }
}
