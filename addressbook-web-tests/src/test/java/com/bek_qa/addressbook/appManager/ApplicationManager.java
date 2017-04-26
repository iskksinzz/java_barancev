package com.bek_qa.addressbook.appManager;

import org.openqa.selenium.firefox.FirefoxDriver;
import sun.plugin2.util.BrowserType;

import java.util.concurrent.TimeUnit;

/**
 * Created by Bek on 4/24/2017.
 */
public class ApplicationManager {
    FirefoxDriver wd;
    private SessionHelper sessionHelper;
    private ContactHelper contactHelper;
    private NavigationHelper navigationHelper;
    private GroupHelper groupHelper; //word final should be deleted

    public void init() {
        String browser = BrowserType.FIREFOX;
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/");
        groupHelper = new GroupHelper(wd);
        navigationHelper = new NavigationHelper(wd);
        contactHelper = new ContactHelper(wd);
        sessionHelper = new SessionHelper(wd);
        sessionHelper.login("admin", "secret"); //used to be login() before refactoring
    }


    public void stop() {
          wd.quit();
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
