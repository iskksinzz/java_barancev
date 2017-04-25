package com.bek_qa.addressbook.tests;

import com.bek_qa.addressbook.TestBase;
import org.testng.annotations.Test;

public class GroupDeletionTest extends TestBase {

    @Test
    public void GroupDeletionTest() {
        //We don't need this code because it's really a login() that is in TestBase
//        wd.get("http://localhost/addressbook/index.php");
//        wd.findElement(By.name("user")).click();
//        wd.findElement(By.name("user")).clear();
//        wd.findElement(By.name("user")).sendKeys("admin");
//        wd.findElement(By.name("pass")).click();
//        wd.findElement(By.name("pass")).clear();
//        wd.findElement(By.name("pass")).sendKeys("secret");
//        wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();

//        wd.findElement(By.linkText("groups")).click(); is deleted and we use
//        previously created method gotoGroupPage()
        applicationManager.getNavigationHelper().gotoGroupPage();
        applicationManager.getGroupHelper().selectGroup(); //Created a new method, didn't make earlier
        applicationManager.getGroupHelper().deletSelectedGroups(); //Created a new method, didn't make earlier

        //we use previously created method instead of
        //wd.findElement(By.linkText("group page")).click();
        applicationManager.getGroupHelper().returnToGroupPage();
    }

}
