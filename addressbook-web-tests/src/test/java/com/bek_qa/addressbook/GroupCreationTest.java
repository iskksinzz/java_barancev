package com.bek_qa.addressbook;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class GroupCreationTest {
    FirefoxDriver wd;
    
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

    @Test
    public void testGroupCreation() {
        gotoGroupPage();
        initGroupCreation();

//used to be just fillGroupForm() until we refactored by extracting param obj, that created a separate class GroupData
        fillGroupForm(new GroupData("group name text", "group header test", "group footer test"));

        submitGroupCreation();
        returnToGroupPage();
    }

    //Helper methods refactored from Selenium generated code inside testGroupCreation()
    private void gotoGroupPage() {
        wd.findElement(By.linkText("groups")).click();
    }
    private void initGroupCreation() {
        wd.findElement(By.name("new")).click();
    }
    private void fillGroupForm(GroupData groupData) {
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
    private void submitGroupCreation() {
        wd.findElement(By.name("submit")).click();
    }
    private void returnToGroupPage() {
        wd.findElement(By.linkText("group page")).click();
    }

    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
