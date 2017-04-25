package com.bek_qa.addressbook.appManager;

import com.bek_qa.addressbook.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Bek on 4/24/2017.
 */
public class ApplicationManager {
    FirefoxDriver wd;
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
        groupHelper = new GroupHelper( wd);
        navigationHelper = new NavigationHelper(wd);
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

    public void initContactCreation() {
          wd.findElement(By.linkText("add new")).click();
    }

    public void fillContactForm(ContactData contactData) {
          wd.findElement(By.name("firstname")).click();
          wd.findElement(By.name("firstname")).clear();
          wd.findElement(By.name("firstname")).sendKeys(contactData.getfName());
          wd.findElement(By.name("lastname")).click();
          wd.findElement(By.name("lastname")).clear();
          wd.findElement(By.name("lastname")).sendKeys(contactData.getlName());
          wd.findElement(By.name("company")).click();
          wd.findElement(By.name("company")).clear();
          wd.findElement(By.name("company")).sendKeys(contactData.getCompanyName());
          wd.findElement(By.name("address")).click();
          wd.findElement(By.name("address")).clear();
          wd.findElement(By.name("address")).sendKeys(contactData.getAddress());
          wd.findElement(By.name("address")).click();
          wd.findElement(By.name("address")).clear();
          wd.findElement(By.name("address")).sendKeys(contactData.getSuite());
          wd.findElement(By.name("address")).click();
          wd.findElement(By.name("address")).clear();
          wd.findElement(By.name("address")).sendKeys(contactData.getCityStateZip());
          wd.findElement(By.name("work")).click();
          wd.findElement(By.name("work")).clear();
          wd.findElement(By.name("work")).sendKeys(contactData.getWorkPhone());
          wd.findElement(By.name("email")).click();
          wd.findElement(By.name("email")).clear();
          wd.findElement(By.name("email")).sendKeys(contactData.getEmail());
    }

    public void submitContactCreation() {
          wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
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
}
