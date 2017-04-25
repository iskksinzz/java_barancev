package com.bek_qa.addressbook.appManager;

import com.bek_qa.addressbook.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Bek on 4/24/2017.
 */
public class GroupHelper {
    private FirefoxDriver wd; //This object is used by all test classes

    public GroupHelper(FirefoxDriver wd) {
        this.wd =wd;
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
}
