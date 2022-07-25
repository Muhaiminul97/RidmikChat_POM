package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProfilePage {

    @FindBy(id = "profile_button")
    WebElement profileBtn;

    @FindBy(id = "button_edit_profile")
    WebElement profileEditBtn;




}
