package com.fleet_project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PinbarPage_MM extends BasePage{

    @FindBy(xpath = "//a[text()='Learn how to use this space']")
    public WebElement pinbarLink;

    @FindBy(xpath = "//h3[.=\"How To Use Pinbar\"]")
    public WebElement pinbarHeader;

    @FindBy(xpath = "//p[normalize-space(text())='Use pin icon on the right top corner of page to create fast access link in the pinbar.']")
    public WebElement pinBarInfoText;

  /*  Alternative xpath:
    @FindBy(xpath = "//div[@class='clearfix']//p[1]")
    public WebElement pinBarText;
   */
    @FindBy(xpath = "//img[@src='/bundles/oronavigation/images/pinbar-location.jpg']")
    public WebElement pinBarImage;

}
