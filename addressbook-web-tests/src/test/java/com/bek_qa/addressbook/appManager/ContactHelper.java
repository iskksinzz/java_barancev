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
          click(By.xpath("//div[@id='content']/form/input[21]"));
    }
    public void returnToHomePage() {
        wd.findElement(By.linkText("home page")).click();
    }

    public void selectTopContact() {
        wd.findElement(By.name("selected[]"));
    }

    public void deleteSelectedContact() {
        wd.findElement(By.xpath("//div[@id='content']/form[2]/div[2]/input")).click();
    }

    public void clickDialogBox() {
        wd.switchTo().alert().accept();
    }

    public void editContact() {
        wd.findElement(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img")).click();
    }

    public void submitUpdate() {
        wd.findElement(By.name("update")).click();
    }
}
