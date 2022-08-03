package com.example.ridmikchat_pom;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ExploreFeed;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class FeedTest extends TestBase {
    ExploreFeed exploreFeed;
    ProfileEditTest profileEditTest;

    public FeedTest() {
        super();
    }

    @BeforeMethod
    public void setup() throws MalformedURLException {
        initialization();
        exploreFeed = new ExploreFeed();
    }

    @Test(priority = 1)
    public void ExploreBtn() {
     exploreFeed.ValidateExploreBtn();
    }

    @Test
    public void FeedClickTest() {
        exploreFeed.FeedClickBtn();
    }

    @Test
    public void GalleryImageTest() throws InterruptedException {
    exploreFeed.GalleryBtnClick();
    exploreFeed.GalleryImageEditor();

    }

    @AfterTest
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }

    }
}

