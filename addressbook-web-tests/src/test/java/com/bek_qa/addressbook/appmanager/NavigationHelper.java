package com.bek_qa.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Bek on 4/21/2017.
 */
public class NavigationHelper {
    private FirefoxDriver wd;

    public NavigationHelper(FirefoxDriver wd) {
        this.wd =wd;
    }

    public void goToGroupPage() {
        wd.findElement(By.linkText("groups")).click();
    }
}
