package com.crm.qa.pages;

import com.crm.qa.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import static com.crm.qa.base.TestBase.driver;

public class ExploreFeed {

    @FindBy(xpath = "//android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView[2]")
    WebElement Feed;
    @FindBy(id = "explore_button")
    WebElement ExploreBtn;
    @FindBy(id = "gallery")
    WebElement feedGallery;
    @FindBy(id = "next_button")
    WebElement NextBtn;
    @FindBy(id = "edit_button")
    WebElement EditBtn;
    @FindBy(id = "overlay")
    List<WebElement> RandomImageSelect;

    @FindBy(xpath = "//android.widget.FrameLayout/android.view.ViewGroup/android.widget.SeekBar/android.widget.SeekBar")
    WebElement SeekBarBtn;

    @FindBy(id = "brightness_button")
    WebElement BrightnessBtn;

    @FindBy(id = "contrast_button")
    WebElement ContrastBtn;

    @FindBy(id = "done_button")
    WebElement Done;

    public ExploreFeed() {
        PageFactory.initElements(driver, this);
    }

    public void ValidateExploreBtn() {
        ExploreBtn.click();
    }


    public boolean FeedClick() {
        return Feed.isDisplayed();
    }

    public void FeedClickBtn() {
        Feed.click();
    }

    public void GalleryBtnClick() {
        feedGallery.click();
    }

    public void GalleryImageEditor() throws InterruptedException {
        int max_group = RandomImageSelect.size();
        Random random = new Random();
        int randomSelect = random.nextInt(max_group);

        if (randomSelect > 0) {
            RandomImageSelect.get(randomSelect).click();
            NextBtn.click();
            Thread.sleep(500);
            EditBtn.click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));
            BrightnessBtn.click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));
            SeekBarBtn.click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));
            seekbar_countdown_1();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));
            Done.click();
            //contrast button
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));
            ContrastBtn.click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));
            seekbar_countdown_1();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));
            SeekBarBtn.click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));
            Done.click();

        } else {
            System.out.println("Error");
        }
    }

    public void seekbar_countdown_1() {
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(SeekBarBtn, 150, 920).build().perform();
    }
}

