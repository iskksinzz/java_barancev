package com.bek_qa.addressbook.appmanager;

import com.bek_qa.addressbook.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Bek on 4/20/2017.
 */
public class ApplicationManager {
    FirefoxDriver wd;
    private NavigationHelper navigationHelper;
    private GroupHelper groupHelper;
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
        wd.get("http://localhost/dashboard/");
        wd.findElement(By.cssSelector("div.large-12.columns")).click();
        wd.get("http://localhost/addressbook/");
        groupHelper = new GroupHelper(wd);
        navigationHelper = new NavigationHelper(wd);
        login("admin", "secret");
    }

    public void login(String username, String password) {
        navigationHelper.wd.findElement(By.name("pass")).click();
        navigationHelper.wd.findElement(By.name("pass")).clear();
        navigationHelper.wd.findElement(By.name("pass")).sendKeys(password);
        navigationHelper.wd.findElement(By.name("user")).click();
        navigationHelper.wd.findElement(By.name("user")).clear();
        navigationHelper.wd.findElement(By.name("user")).sendKeys(username);
        navigationHelper.wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
    }

    public void returnToGroupPage() {
        wd.findElement(By.linkText("group page")).click();
    }

    public void submitGroupCreation() {
        wd.findElement(By.name("submit")).click();
    }

    public void fillGroupForm(GroupData groupData) {
        navigationHelper.wd.findElement(By.name("group_name")).click();
        navigationHelper.wd.findElement(By.name("group_name")).clear();
        navigationHelper.wd.findElement(By.name("group_name")).sendKeys(groupData.getGroupName());
        navigationHelper.wd.findElement(By.name("group_header")).click();
        navigationHelper.wd.findElement(By.name("group_header")).clear();
        navigationHelper.wd.findElement(By.name("group_header")).sendKeys(groupData.getGroupHeader());
        navigationHelper.wd.findElement(By.name("group_footer")).click();
        navigationHelper.wd.findElement(By.name("group_footer")).clear();
        navigationHelper.wd.findElement(By.name("group_footer")).sendKeys(groupData.getGroupFooter());
    }

    public void createNewGroup() {
        wd.findElement(By.name("new")).click();
    }

    public void stop() {
        wd.quit();
    }

    public void deleteSelectedGroups() {
        wd.findElement(By.xpath("//div[@id='content']/form/input[5]")).click();
    }

    public void selectGroup() {
        if (!navigationHelper.wd.findElement(By.xpath("//div[@id='content']/form/span[3]/input")).isSelected()) {
            navigationHelper.wd.findElement(By.xpath("//div[@id='content']/form/span[3]/input")).click();
        }
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }
}
