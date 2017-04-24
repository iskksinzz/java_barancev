package com.bek_qa.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Bek on 4/23/2017.
 */
public class SessionHelper extends HelperBase {
//We don't need a field (ref obj) of type FirefoxDrive, because it already
// gets inherited from base class
    //private final FirefoxDriver wd;

    public SessionHelper(FirefoxDriver wd) {
        super(wd);
    }
    public void login(String username, String password) {
        type(By.name("user"), username);
        type(By.name("pass"), password);
        click(By.xpath("//form[@id='LoginForm']/input[3]"));

        /* We used type() to substitute code for username below
        wd.findElement(By.name("user")).click();
        wd.findElement(By.name("user")).clear();
        wd.findElement(By.name("user")).sendKeys(username);
        */
        /* We used type() to substitute code for password below
        wd.findElement(By.name("pass")).click();
        wd.findElement(By.name("pass")).clear();
        wd.findElement(By.name("pass")).sendKeys(password);
        */
        /* We used click() to substitute code for submitting
        wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
        */
    }
}
