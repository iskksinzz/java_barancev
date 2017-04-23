package com.bek_qa.addressbook.appmanager;

import com.bek_qa.addressbook.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Bek on 4/22/2017.
 */
public class GroupHelper {
    private FirefoxDriver wd;

    public GroupHelper(FirefoxDriver wd) {
        this.wd = wd;
    }

    public void returnToGroupPage() {
        click(By.linkText("group page"));
    }

    public void submitGroupCreation() {
        click(By.name("submit"));
    }

    private void click(By locator) {
        wd.findElement(locator).click();
    }

    public void fillGroupForm(GroupData groupData) {
        type("group_name", groupData.getGroupName());
        type("group_header", groupData.getGroupHeader());
        type("group_footer", groupData.getGroupFooter());
    }

    private void type(String locator, String text) {
        click(By.name(locator));
        wd.findElement(By.name(locator)).clear();
        wd.findElement(By.name(locator)).sendKeys(text);
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
