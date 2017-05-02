package com.bek_qa.addressbook.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.NoSuchElementException;

/**
 * Created by Bek on 4/24/2017.
 */
public class HelperBase {
    protected WebDriver wd; //This object is used by all test classes

    public HelperBase(WebDriver wd) {
        this.wd =wd;
    }

    protected void type(By locator, String text) {
        click(locator);
        if(text !=null) {
            String existingText = wd.findElement(locator).getAttribute("value");
            if(!text.equals(existingText)) {
                wd.findElement(locator).clear();
                wd.findElement(locator).sendKeys(text);
            }
        }
    }

    protected void click(By locator) {
        wd.findElement(locator).click();
    }
    public boolean isAlertPresent() {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    protected boolean isElementPresent(By locator) {
        try{
            wd.findElement(locator);
            return true;
        } catch (NoSuchElementException ex){
            return false;
        }
    }
}
