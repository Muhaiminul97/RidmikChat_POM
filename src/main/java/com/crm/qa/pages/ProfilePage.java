package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.crm.qa.base.TestBase.driver;

public class ProfilePage {

    public ProfilePage()
    {
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "profile_button")
    WebElement profileBtn;

    

    @FindBy(id = "button_edit_profile")
    WebElement profileEditBtn;

    @FindBy(id = "tvEditWork")
    WebElement workEdit;

    @FindBy(id="etUserInput2")
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


}
