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
        String workText = "Character Count Online is an online tool that lets you easily calculate and count the number of characters, words, sentences and paragraphs in your text.";
        System.out.println("Copied Text:  " + workText.length());
        profilePage.setUserInput(workText);
        int length = profilePage.validateInput().length();
        System.out.println("After Pasting Text: " + length);
        if (length <= 80) {
            System.out.println("Found string less than or equal to "+length);
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
    @Test(priority = 7)
    public void EduInputTest() {
        profilePage.setEducationEdit();
        System.out.println("Education Edit Option Clicked Successfully");
        String EduText = "Character Count Online is an online tool that lets you easily calculate and count the number of characters, words, sentences and paragraphs in your text.";
        System.out.println("Copied Text:  " + EduText.length());
        profilePage.setUserInput(EduText);
        int length = profilePage.validateInput().length();
        System.out.println("After Pasting Text: " + length);
        if (length <= 120) {
            System.out.println("Found string less than or equal to " + length);
        } else {
            System.out.println("Greater than expected value");
        }
        profilePage.setEditSaveBtn();
    }
    @Test(priority = 8)
    public void LivingInLabelTest() throws InterruptedException {
        Thread.sleep(1000);
        String LivingLabel = profilePage.ValidateLivingLabel();
        System.out.println("Found Label  :" + LivingLabel);
        String[] strAr1 = new String[]{"আবাসস্থল", "Living in"};
        boolean found = false;
        for (int i = 0; i <= strAr1.length; i++) {
            if (LivingLabel.contains(strAr1[i])) {
                ex = strAr1[i].toString();
                System.out.println("Matched Label::" + ex);
                Assert.assertEquals(LivingLabel, ex);
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
    @Test(priority = 9)
    public void LivingInputTest() {
        profilePage.LivingEdit();
        System.out.println("Living In Edit Option Clicked Successfully");
        String LivingText = "Character Count Online is an online tool that lets you easily calculate and count the number of characters, words, sentences and paragraphs in your text.";
        System.out.println("Copied Text:  " + LivingText.length());
        profilePage.setUserInput(LivingText);
        int length = profilePage.validateInput().length();
        System.out.println("After Pasting Text: " + length);
        if (length <= 80) {
            System.out.println("Found string less than or equal to " + length);
        } else {
            System.out.println("Greater than expected value");
        }
        profilePage.setEditSaveBtn();
    }
    @Test(priority = 10)
    public void AboutLabelTest() throws InterruptedException {
        Thread.sleep(1000);
        String AboutLabel = profilePage.ValidateAboutYouLabel();
        System.out.println("Found Label  :" + AboutLabel);
        String[] strAr1 = new String[]{"আপনার সম্পর্কে কিছু লিখুন", "About you"};
        boolean found = false;
        for (int i = 0; i <= strAr1.length; i++) {
            if (AboutLabel.contains(strAr1[i])) {
                ex = strAr1[i].toString();
                System.out.println("Matched Label::" + ex);
                Assert.assertEquals(AboutLabel, ex);
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
    @Test(priority = 11)
    public void AboutYouInputTest() {
        profilePage.AboutYouEdit();
        System.out.println("Living In Edit Option Clicked Successfully");
        String AboutYouText = "Character Count Online is an online tool that lets you easily calculate and count the number of characters, words, sentences and paragraphs in your text.";
        System.out.println("Copied Text:  " + AboutYouText.length());
        profilePage.setUserInput(AboutYouText);
        int length = profilePage.validateInput().length();
        System.out.println("After Pasting Text: " + length);
        if (length <= 80) {
            System.out.println("Found string less than or equal to " + length);
        } else {
            System.out.println("Greater than expected value");
        }
        profilePage.setEditSaveBtn();
    }
    @AfterSuite
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }

    }
}