package com.fleet_project.pages;

import com.fleet_project.utilities.BrowserUtils;
import com.fleet_project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainModulesPage_FD {

    public MainModulesPage_FD() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='title title-level-1']")
    public List<WebElement> moduleElements;

    public List<String> getModuleNames() {
        return BrowserUtils.getElementsText(moduleElements);
    }
}
