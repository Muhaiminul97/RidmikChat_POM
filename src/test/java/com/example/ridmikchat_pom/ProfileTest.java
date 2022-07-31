package com.example.ridmikchat_pom;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ProfilePage;
import com.crm.qa.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.time.Duration;

public class ProfileTest extends TestBase {

    ProfilePage profilePage;
    String ex = null;

    public ProfileTest() {
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
        System.out.println(profilePage.GetUserName());
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
                ex = strAr1[i];
                System.out.println("Matched Label::" + ex);
                Assert.assertEquals(workLabel, ex);
                found = true;
                break;
            }

        }
        if (found) {
            System.out.println("Found successfully :: " + ex);
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
            System.out.println("Found string less than or equal to " + length);
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
                ex = strAr1[i];
                System.out.println("Matched Label::" + ex);
                Assert.assertEquals(EduLabel, ex);
                found = true;
                break;
            }

        }
        if (found) {
            System.out.println("Found successfully :: " + ex);
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
                ex = strAr1[i];
                System.out.println("Matched Label::" + ex);
                Assert.assertEquals(LivingLabel, ex);
                found = true;
                break;
            }

        }
        if (found) {
            System.out.println("Found successfully :: " + ex);
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
        System.out.println("Found Label  : " + AboutLabel);
        String[] strAr1 = new String[]{"আপনার সম্পর্কে", "About you"};
        boolean found = false;
        for (int i = 0; i <= strAr1.length; i++) {
            if (AboutLabel.contains(strAr1[i])) {
                ex = strAr1[i];
                System.out.println("Matched Label :: " + ex);
                Assert.assertEquals(AboutLabel, ex);
                found = true;
                break;
            }

        }
        if (found) {
            System.out.println("Found successfully :: " + ex);
        } else {
            System.out.println("Error");
        }


    }

    @Test(priority = 11)
    public void AboutYouInputTest() {
        profilePage.AboutYouEdit();
        System.out.println("About You Edit Option Clicked Successfully");
        String AboutYouText = "Character Count Online is an online tool that lets you easily" +
                " A biography, or simply bio, is a detailed description of a person's life." +
                " It involves more than just the basic facts like education, work, relationships, and death; " +
                "it portrays a person's experience of these life events. Unlike a profile or curriculum vitae" +
                " (résumé), a biography presents a subject's life story, highlighting various aspects of their " +
                "life, including intimate details of experience, and may include an analysis of the subject's " +
                "personality.\n" +
                "\n" +
                "Biographical works are usually non-fiction, but fiction can also be used to portray a person's" +
                " life. One in-depth form of biographical coverage is called legacy writing. Works in diverse media, from literature to film, form the genre known as biography.";
        System.out.println("Copied Text:  " + AboutYouText.length());
        profilePage.setUserInput(AboutYouText);
        int length = profilePage.validateInput().length();
        System.out.println("After Pasting Text: " + length);
        if (length <= 500) {
            System.out.println("Found string less than or equal to " + length);
        } else {
            System.out.println("Greater than expected value");
        }
        profilePage.setEditSaveBtn();
        driver.navigate().back();
    }
    @Test(priority = 12)
    public void ProfileImageTest()
    {
        profilePage.setUploadProfilePhoto();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));
        Assert.assertTrue(profilePage.ValidateThumbnail());
    }
    @AfterSuite
    public void teardown() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));

        if (driver != null) {
            driver.quit();
        }

    }
}