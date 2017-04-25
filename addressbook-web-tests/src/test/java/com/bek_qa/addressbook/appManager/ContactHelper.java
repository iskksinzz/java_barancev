package com.bek_qa.addressbook.appManager;

import com.bek_qa.addressbook.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Bek on 4/24/2017.
 */
public class ContactHelper {
    private FirefoxDriver wd;

    public ContactHelper(FirefoxDriver wd) {
        this.wd = wd;
    }

    public void initContactCreation() {
          wd.findElement(By.linkText("add new")).click();
    }

    public void fillContactForm(ContactData contactData) {
          wd.findElement(By.name("firstname")).click();
          wd.findElement(By.name("firstname")).clear();
          wd.findElement(By.name("firstname")).sendKeys(contactData.getfName());
          wd.findElement(By.name("lastname")).click();
          wd.findElement(By.name("lastname")).clear();
          wd.findElement(By.name("lastname")).sendKeys(contactData.getlName());
          wd.findElement(By.name("company")).click();
          wd.findElement(By.name("company")).clear();
          wd.findElement(By.name("company")).sendKeys(contactData.getCompanyName());
          wd.findElement(By.name("address")).click();
          wd.findElement(By.name("address")).clear();
          wd.findElement(By.name("address")).sendKeys(contactData.getAddress());
          wd.findElement(By.name("address")).click();
          wd.findElement(By.name("address")).clear();
          wd.findElement(By.name("address")).sendKeys(contactData.getSuite());
          wd.findElement(By.name("address")).click();
          wd.findElement(By.name("address")).clear();
          wd.findElement(By.name("address")).sendKeys(contactData.getCityStateZip());
          wd.findElement(By.name("work")).click();
          wd.findElement(By.name("work")).clear();
          wd.findElement(By.name("work")).sendKeys(contactData.getWorkPhone());
          wd.findElement(By.name("email")).click();
          wd.findElement(By.name("email")).clear();
          wd.findElement(By.name("email")).sendKeys(contactData.getEmail());
    }

    public void submitContactCreation() {
          wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
    }
}
