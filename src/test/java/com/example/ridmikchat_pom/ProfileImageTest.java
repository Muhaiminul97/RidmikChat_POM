package com.example.ridmikchat_pom;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ProfilePage;
import com.crm.qa.util.TestUtil;
import net.bytebuddy.implementation.bind.annotation.Super;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.time.Duration;

public class ProfileImageTest extends TestBase  {
    ProfilePage profilePage;

    public ProfileImageTest() {
        super();
    }

    @BeforeTest
    public void setup() throws MalformedURLException {
        initialization();
        profilePage = new ProfilePage();
    }

    @Test(priority = 1)
    public void UserProfileImageTest() {

        profilePage.setUploadProfilePhoto();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));
        Assert.assertTrue(profilePage.ValidateThumbnail());
    }

    @AfterTest(alwaysRun = true,enabled = true)
    public void teardown() {

        if (driver != null) {
            driver.quit();
        }

    }
}
