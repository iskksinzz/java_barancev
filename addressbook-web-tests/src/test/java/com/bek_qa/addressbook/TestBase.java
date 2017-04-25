package com.bek_qa.addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * Created by Bek on 4/24/2017.
 */
public class TestBase {
    FirefoxDriver wd; //This object is used by all test classes

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    @BeforeMethod
    public void setUp() throws Exception {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/");
        login("admin", "secret"); //used to be login() before refactoring
    }

    private void login(String username, String password) {
        wd.findElement(By.name("user")).click();
        wd.findElement(By.name("user")).clear();
        wd.findElement(By.name("user")).sendKeys(username); //used to be sendKeys("admin")
        wd.findElement(By.name("pass")).click();
        wd.findElement(By.name("pass")).clear();
        wd.findElement(By.name("pass")).sendKeys(password);//used to be sendKeys("secret")
        wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
    }

    //Helper methods refactored from Selenium generated code inside testGroupCreation()
    protected void gotoGroupPage() {
        wd.findElement(By.linkText("groups")).click();
    }

    protected void initGroupCreation() {
        wd.findElement(By.name("new")).click();
    }

    protected void fillGroupForm(GroupData groupData) {
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

    protected void submitGroupCreation() {
        wd.findElement(By.name("submit")).click();
    }

    protected void returnToGroupPage() {
        wd.findElement(By.linkText("group page")).click();
    }

    @AfterMethod
    public void tearDown() {
        wd.quit();
    }

    // This method came from GroupDeletionTest when we created this method there
    // and access modifier was private there
    protected void deletSelectedGroups() {
        wd.findElement(By.name("delete")).click();
    }

    // This method came from GroupDeletionTest when we created this method there
    // and access modifier was private there
    protected void selectGroup() {
        if (!wd.findElement(By.name("selected[]")).isSelected()) {
            wd.findElement(By.name("selected[]")).click();
        }
    }

    protected void initContactCreation() {
        wd.findElement(By.linkText("add new")).click();
    }

    protected void fillContactForm(ContactData contactData) {
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

    protected void submitContactCreation() {
        wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
    }

    protected void returnToHomePage() {
        wd.findElement(By.linkText("home page")).click();
    }
}
