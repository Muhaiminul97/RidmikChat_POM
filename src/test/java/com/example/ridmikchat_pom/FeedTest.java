package com.example.ridmikchat_pom;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ExploreFeed;
import org.testng.annotations.*;

import java.net.MalformedURLException;

public class FeedTest extends TestBase {
    ExploreFeed exploreFeed;

    public FeedTest() {
        super();
    }

    @BeforeTest
    public void setup() throws MalformedURLException {
        initialization();
        exploreFeed = new ExploreFeed();
    }

    @Test(priority = 1)
    public void ExploreBtn() {
     exploreFeed.ValidateExploreBtn();
    }

    @Test(priority = 2)
    public void FeedClickTest() {
        exploreFeed.FeedClickBtn();
    }

    @Test(priority = 3)
    public void GalleryImageTest() throws InterruptedException {
    exploreFeed.GalleryBtnClick();
    exploreFeed.GalleryImageEditor();

    }

    @AfterTest(alwaysRun = true)
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }

    }
}

