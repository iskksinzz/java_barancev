package com.bek_qa.addressbook.appManager;

import com.bek_qa.addressbook.model.ContactData;
import com.bek_qa.addressbook.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Bek on 4/24/2017.
 */
public class ApplicationManager {
    FirefoxDriver wd; //This object is used by all test classes

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public void init() {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/");
        login("admin", "secret"); //used to be login() before refactoring
    }

    public void login(String username, String password) {
        wd.findElement(By.name("user")).click();
        wd.findElement(By.name("user")).clear();
        wd.findElement(By.name("user")).sendKeys(username); //used to be sendKeys("admin")
        wd.findElement(By.name("pass")).click();
        wd.findElement(By.name("pass")).clear();
        wd.findElement(By.name("pass")).sendKeys(password);//used to be sendKeys("secret")
        wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
    }

    //Helper methods refactored from Selenium generated code inside testGroupCreation()
    public void gotoGroupPage() {
        wd.findElement(By.linkText("groups")).click();
    }

    public void initGroupCreation() {
        wd.findElement(By.name("new")).click();
    }

    public void fillGroupForm(GroupData groupData) {
//used to be just fillGroupForm()
//1. We refactored by extracting parameters fillGroupForm(String groupName, String groupHeader, String groupFooter)
//2. We refactored by extracting parameter objects. class GroupData was created

        wd.findElement(By.name("group_name")).click();
        wd.findElement(By.name("group_name")).clear();

//used to be sendKeys("group name text") before refac/extract parameters
//used to be sendKeys(groupName) before refac/extract parameter obj
        wd.findElement(By.name("group_name")).sendKeys(groupData.getGroupName());

        wd.findElement(By.name("group_header")).click();
        wd.findElement(By.name("group_header")).clear();

//used to be sendKeys("group header text") before refac/extract parameters
//used to be sendKeys(groupHeader) before refac/extract parameter obj
        wd.findElement(By.name("group_header")).sendKeys(groupData.getGroupHeader());//used to be ("group header test")

        wd.findElement(By.name("group_footer")).click();
        wd.findElement(By.name("group_footer")).clear();

//used to be sendKeys("group footer text") before refac/extract parameters
//used to be sendKeys(groupFooter) before refac/extract parameter obj
        wd.findElement(By.name("group_footer")).sendKeys(groupData.getGroupFooter());//used to be ("group footer test")
    }

    public void submitGroupCreation() {
        wd.findElement(By.name("submit")).click();
    }

    public void returnToGroupPage() {
        wd.findElement(By.linkText("group page")).click();
    }

    public void stop() {
        wd.quit();
    }

    // This method came from GroupDeletionTest when we created this method there
    // and access modifier was private there
    public void deletSelectedGroups() {
        wd.findElement(By.name("delete")).click();
    }

    // This method came from GroupDeletionTest when we created this method there
    // and access modifier was private there
    public void selectGroup() {
        if (!wd.findElement(By.name("selected[]")).isSelected()) {
            wd.findElement(By.name("selected[]")).click();
        }
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

    public void returnToHomePage() {
        wd.findElement(By.linkText("home page")).click();
    }
}