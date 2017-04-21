package com.bek_qa.addressbook.appmanager;

import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Bek on 4/21/2017.
 */


public class SessionHelper {

    private FirefoxDriver wd;

    public SessionHelper(FirefoxDriver wd) {
        this.wd =wd;
    }
}
