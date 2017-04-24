package com.bek_qa.addressbook.appmanager;

import com.bek_qa.addressbook.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Bek on 4/22/2017.
 */
public class GroupHelper extends HelperBase {

    public GroupHelper(FirefoxDriver wd) {
        super(wd); //This is a constructor of a base class
    }

    public void returnToGroupPage() {
        click(By.linkText("group page"));
    }

    public void submitGroupCreation() {
        click(By.name("submit"));
    }

    public void fillGroupForm(GroupData groupData) {
         type(By.name("group_name"), groupData.getGroupName());
        type(By.name("group_header"), groupData.getGroupHeader());
        type(By.name("group_footer"), groupData.getGroupFooter());
    }

    public void createNewGroup() {
        click(By.name("new"));
    }

    public void deleteSelectedGroups() {
        click(By.xpath("//div[@id='content']/form/input[5]"));
    }

    public void selectGroup() {
        if (!wd.findElement(By.xpath("//div[@id='content']/form/span[3]/input")).isSelected()) {
            click(By.xpath("//div[@id='content']/form/span[3]/input"));
        }
    }
}
