package com.bek_qa.addressbook.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Bek on 4/24/2017.
 */
public class NavigationHelper {
    private WebDriver wd; //This object is used by all test classes

    public NavigationHelper(WebDriver wd) {
        this.wd =wd;
    }

    //Helper methods refactored from Selenium generated code inside testGroupCreation()
    public void gotoGroupPage() {
         wd.findElement(By.linkText("groups")).click();
    }
}
