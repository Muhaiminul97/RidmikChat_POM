package com.example.ridmikchat_pom;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ProfilePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class profileTest extends TestBase {

    ProfilePage profilePage;

    public profileTest() {
        super();
    }

    @BeforeMethod
    public void setup()  {
        try {
            initialization();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        profilePage = new ProfilePage();

    }

    @Test(priority = 1)
    public void profileBtn() {
        profilePage.ClickProfileBtn();
        System.out.println("Clicked Successfully");
    }
    @Test(priority = 2)
    public void DisplayedUserName()
    {
        Assert.assertTrue(profilePage.UserName());
    }
    @Test(priority = 3)
    public void profileEditBtnTest()
    {
        profilePage.setProfileEditBtn();
        System.out.println("Profile Edit Button Clicked Successfully");
    }
    @Test(priority = 4)
    public void workTest() throws InterruptedException {
       String workLabel = profilePage.ValidateWorkLabel();
       System.out.println("Label :"+workLabel);
       Assert.assertEquals(workLabel,"Work");
        profilePage.setWorkEdit();
        System.out.println("Work Option Clicked Successfully");
    }
}
