package com.bek_qa.addressbook.appManager;

import com.bek_qa.addressbook.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Bek on 4/24/2017.
 */
public class GroupHelper extends HelperBase{

    public GroupHelper(FirefoxDriver wd) {
        super(wd); //this is a call to constructor in base class
    }

    public void initGroupCreation() {
        click(By.name("new"));
    }

    public void fillGroupForm(GroupData groupData) {

        type(By.name("group_name"), groupData.getGroupName());
        type(By.name("group_header"), groupData.getGroupHeader());
        type(By.name("group_footer"), groupData.getGroupFooter());
    }

    public void submitGroupCreation() {
        click(By.name("submit"));
    }

    public void returnToGroupPage() {
        click(By.linkText("group page"));
    }

    // This method came from GroupDeletionTest when we created this method there
    // and access modifier was private there
    public void deletSelectedGroups() {
        click(By.name("delete"));
    }

    // This method came from GroupDeletionTest when we created this method there
    // and access modifier was private there
    public void selectGroup() {
        if (!wd.findElement(By.name("selected[]")).isSelected()) {
            click(By.name("selected[]"));
        }
    }
}
