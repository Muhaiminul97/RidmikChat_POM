package com.crm.qa.pages;

import com.crm.qa.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

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

    @FindBy(id = "tvEducationLabel")
    WebElement EducationLabel;

    @FindBy(id = "tvLivingInLabel")
    WebElement LivingLabel;

    @FindBy(id = "tvEditLivingIn")
    WebElement EditLivingIn;

    @FindBy(id = "tvAboutYouLabel")
    WebElement AboutYouLabel;

    @FindBy(id = "tvEditAboutYou")
    WebElement EditAboutYou;

    @FindBy(id = "upload_cover_photo")
    WebElement UploadCoverPhoto;

    @FindBy(xpath = "//android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView[2]")
    WebElement Cam;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Take photo\"]")
    WebElement TakePhoto;

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

    public String GetUserName()
    {
       return UserName.getText();
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

    public void setUserInput(String test) {
        UserInput.click();
        UserInput.sendKeys(test);
    }

    public String validateInput() {
        return UserInput.getText();
    }

    public String ValidateEducationLabel() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));
        return EducationLabel.getText();

    }

    public void setEducationEdit()
    {
        EducationEditBtn.click();
    }

    public String ValidateLivingLabel()
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));
        return LivingLabel.getText();
    }
    public void LivingEdit()
    {
        EditLivingIn.click();
    }
    public String ValidateAboutYouLabel()
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));
        return AboutYouLabel.getText();
    }
    public void AboutYouEdit()
    {
        EditAboutYou.click();
    }

    public void setUploadProfilePhoto()
    {
        UploadProfilePhoto.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));
        Cam.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));
        TakePhoto.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));
        CamDone.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));
        ProfileImageConfirm.click();
    }
    public boolean ValidateThumbnail()
    {
        return ProfileThumbnail.isDisplayed();
    }
}
