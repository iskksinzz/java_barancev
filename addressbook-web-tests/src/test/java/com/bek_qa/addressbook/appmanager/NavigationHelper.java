package com.bek_qa.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Bek on 4/23/2017.
 */
public class NavigationHelper extends HelperBase {
// We don't need a reference obj to FirefoxDricer since we inherit it from base call
        private FirefoxDriver wd;

    public NavigationHelper(FirefoxDriver wd) {
        super(wd); // 1. We call constructor of a base class
    }

    public void goToGroupPage() {
        click(By.linkText("groups"));

    //We change this code to click()
        //wd.findElement(By.linkText("groups")).click();
    }
}
