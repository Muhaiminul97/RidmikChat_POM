package com.example.ridmikchat_pom;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ProfilePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

public class profileTest extends TestBase {

    ProfilePage profilePage;

    public profileTest() {
        super();
    }

    @BeforeMethod
    public void setup() {
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
    public void DisplayedUserName() {
        Assert.assertTrue(profilePage.UserName());
    }

    @Test(priority = 3)
    public void profileEditBtnTest() {
        profilePage.setProfileEditBtn();
        System.out.println("Profile Edit Button Clicked Successfully");
    }

    @Test(priority = 4)
    public void workTest() throws InterruptedException {
        Thread.sleep(1000);
        String workLabel = profilePage.ValidateWorkLabel();
        System.out.println("Found Label  :" + workLabel);
        String[] strAr1 = new String[]{"কর্মস্থল", "Work"};
        boolean found = false;
        for (int i = 0; i <= strAr1.length; i++) {
            if (workLabel.contains(strAr1[i])) {
                String ex = strAr1[i].toString();
                System.out.println("Got Label::" + ex);
                Assert.assertEquals(workLabel, ex);
                found = true;
                break;
            }

        }
        if (found) {
            System.out.println("Label Matched Successfully");
        } else {
            System.out.println("Error");
        }
        profilePage.setWorkEdit();
        System.out.println("Work Option Clicked Successfully");


    }


}