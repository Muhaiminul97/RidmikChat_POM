package com.crm.qa.pages;

import com.crm.qa.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static com.crm.qa.base.TestBase.driver;

public class ProfilePage {


    @FindBy(id = "profile_button")
    WebElement profileBtn;

    @FindBy(id = "button_edit_profile")
    WebElement profileEditBtn;

    @FindBy(id = "tvEditWork")
    WebElement workEdit;

    @FindBy(id = "tvWorkLabel")
    WebElement WorkLabel;

    @FindBy(id = "etUserInput2")
    WebElement UserInput;

    @FindBy(id = "saveButtonTopRight")
    WebElement EditSaveBtn;

    @FindBy(id = "tvEditEducation")
    WebElement EducationEditBtn;

    @FindBy(id = "upload_cover_photo")
    WebElement UploadCoverPhoto;

    @FindBy(xpath = "//android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView[2]")
    WebElement CoverCam;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Take photo\"]")
    WebElement TakeCoverPhoto;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Done\"]")
    WebElement CamDone;

    @FindBy(id = "settings")
    WebElement CoverSave;

    @FindBy(id = "tvUploadPhoto")
    WebElement UploadProfilePhoto;

    @FindBy(id = "btnConfirmCrop")
    WebElement ProfileImageConfirm;

    @FindBy(id = "profile_photo")
    WebElement ProfileThumbnail;

    @FindBy(id = "name_text")
    WebElement UserName;

    @FindBy(id = "tvUserName")
    WebElement UserNameEdit;

    public ProfilePage() {
        PageFactory.initElements(driver, this);
    }

    public void ClickProfileBtn() {
        profileBtn.click();

    }

    public boolean UserName() {
        return UserName.isDisplayed();
    }

    public void setProfileEditBtn() {
        profileEditBtn.click();
    }

    public void setWorkEdit() {
        workEdit.click();
    }

    public String ValidateWorkLabel() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));
       return WorkLabel.getText();

    }


    public void setEditSaveBtn() {
        EditSaveBtn.click();
    }

}
