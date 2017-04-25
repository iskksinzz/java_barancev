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
        click(By.name("new"));
    }

    public void fillGroupForm(GroupData groupData) {

        type(By.name("group_name"), groupData.getGroupName());
        type(By.name("group_header"), groupData.getGroupHeader());
        type(By.name("group_footer"), groupData.getGroupFooter());
    }

    private void type(By locator, String text) {
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    public void submitGroupCreation() {
        click(By.name("submit"));
    }

    private void click(By locator) {
        wd.findElement(locator).click();
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
