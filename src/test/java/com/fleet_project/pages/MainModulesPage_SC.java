package com.fleet_project.pages;

import com.fleet_project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;

import java.util.ArrayList;
import java.util.List;

public class MainModulesPage_SC {
    public MainModulesPage_SC() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text() = 'You do not have permission to perform this action.']")
    public WebElement divYouDoNotHave;


    @FindBy(xpath = "//thead")
    public List<WebElement> theadAllVisibleNoneModel2;










}
