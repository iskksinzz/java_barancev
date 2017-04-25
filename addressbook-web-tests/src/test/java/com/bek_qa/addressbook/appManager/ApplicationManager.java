package com.bek_qa.addressbook.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Bek on 4/24/2017.
 */
public class ApplicationManager {
    FirefoxDriver wd;
    private ContactHelper contactHelper;
    private NavigationHelper navigationHelper;
    private GroupHelper groupHelper; //word final should be deleted

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
        groupHelper = new GroupHelper(wd);
        navigationHelper = new NavigationHelper(wd);
        contactHelper = new ContactHelper(wd);
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

    public void stop() {
          wd.quit();
    }

    public void returnToHomePage() {
          wd.findElement(By.linkText("home page")).click();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }
}
