package com.example.ridmikchat_pom;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ProfilePage;
import org.testng.Assert;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

public class profileTest extends TestBase {

    ProfilePage profilePage;
    String ex = null;

    public profileTest() {
        super();
    }

    @BeforeMethod
    public void setup() throws MalformedURLException {

        initialization();

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
    public void workLabelTest() throws InterruptedException {
        Thread.sleep(1000);
        String workLabel = profilePage.ValidateWorkLabel();
        System.out.println("Found Label  :" + workLabel);
        String[] strAr1 = new String[]{"কর্মস্থল", "Work"};
        boolean found = false;
        for (int i = 0; i <= strAr1.length; i++) {
            if (workLabel.contains(strAr1[i])) {
                ex = strAr1[i].toString();
                System.out.println("Matched Label::" + ex);
                Assert.assertEquals(workLabel, ex);
                found = true;
                break;
            }

        }
        if (found) {
            System.out.println("Found successfully :: " + ex.toString());
        } else {
            System.out.println("Error");
        }


    }

    @Test(priority = 5)
    public void workInputTest() {
        profilePage.setWorkEdit();
        System.out.println("Work Option Clicked Successfully");
        int i = 80;
        String workText = "Character Count Online is an online tool that lets you easily calculate and count the number of characters, words, sentences and paragraphs in your text.";
        System.out.println("Copied Text:  " + workText.length());
        profilePage.setUserInput(workText);
        int length = profilePage.validateworkinput().length();
        System.out.println("After Pasting Text: " + length);
        if (length <= 80) {
            System.out.println("less than equal to 80");
        } else {
            System.out.println("Greater than expected value");
        }
        profilePage.setEditSaveBtn();
    }

    @Test(priority = 6)
    public void EduLabelTest() throws InterruptedException {
        Thread.sleep(1000);
        String EduLabel = profilePage.ValidateEducationLabel();
        System.out.println("Found Label  :" + EduLabel);
        String[] strAr1 = new String[]{"শিক্ষা", "Education"};
        boolean found = false;
        for (int i = 0; i <= strAr1.length; i++) {
            if (EduLabel.contains(strAr1[i])) {
                ex = strAr1[i].toString();
                System.out.println("Matched Label::" + ex);
                Assert.assertEquals(EduLabel, ex);
                found = true;
                break;
            }

        }
        if (found) {
            System.out.println("Found successfully :: " + ex.toString());
        } else {
            System.out.println("Error");
        }


    }
    @AfterSuite
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }

    }
}