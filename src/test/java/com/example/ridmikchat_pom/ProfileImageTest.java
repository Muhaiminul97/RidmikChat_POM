package com.example.ridmikchat_pom;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ProfilePage;
import com.crm.qa.util.TestUtil;
import net.bytebuddy.implementation.bind.annotation.Super;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.time.Duration;

public class ProfileImageTest extends TestBase {
    ProfilePage profilePage;

    public ProfileImageTest() {
        super();
    }

    @BeforeMethod
    public void setup() throws MalformedURLException {
   initialization();
   profilePage = new ProfilePage();
    }

    @Test
    public void UserProfileImageTest() {

        profilePage.setUploadProfilePhoto();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));
        Assert.assertTrue(profilePage.ValidateThumbnail());
    }

    @AfterTest
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }

    }
}
