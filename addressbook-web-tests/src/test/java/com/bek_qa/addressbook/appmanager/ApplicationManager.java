package com.bek_qa.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Bek on 4/20/2017.
 */
//Video 9.
// 2nd Layer. This class has all reusable methods for all our tests
// This class interacts with the actual testing system
public class ApplicationManager {
//When Delegation happens ref obj is created to connect to class
//in which needed methods are located
    FirefoxDriver wd;
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
        groupHelper = new GroupHelper( wd);
        login("admin", "secret");
    }

    public void login(String username, String password) {
        wd.findElement(By.name("pass")).click();
        wd.findElement(By.name("pass")).clear();
        wd.findElement(By.name("pass")).sendKeys(password);
        wd.findElement(By.name("user")).click();
        wd.findElement(By.name("user")).clear();
        wd.findElement(By.name("user")).sendKeys(username);
        wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
    }

    public void goToGroupPage() {
        wd.findElement(By.linkText("groups")).click();
    }

    public void stop() {
        wd.quit();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }
}
