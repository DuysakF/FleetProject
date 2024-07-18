package com.fleet_project.step_definitions;


import com.fleet_project.pages.PinbarPage_MM;
import com.fleet_project.utilities.BrowserUtils;
import com.fleet_project.utilities.ConfigurationReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class US161_PinbarStepDefs{

   PinbarPage_MM pinbarPageMM = new PinbarPage_MM();

    @When("the user clicks Learn how to use this space link")
    public void the_user_clicks_learn_how_to_use_this_space_link(){
     BrowserUtils.clickWithTimeOut( pinbarPageMM.pinbarLink,10);


    }

    @Then("the user sees {string} header")
    public void the_User_Sees_Header(String expectedHeader) {
     String actualHeader= pinbarPageMM.pinbarHeader.getText();
    Assert.assertEquals("Header text is failed", expectedHeader, actualHeader);

    }


    @Then("the user sees {string} text")
    public void the_user_sees_text(String expectedText) {

     String actualText = pinbarPageMM.pinBarInfoText.getText();
     Assert.assertEquals("Info text is failed", expectedText, actualText);

    }

    @Then("users should see an image on the page.")
    public void users_should_see_an_image_on_the_page() {

     String expectedImgSrc = ConfigurationReader.getProperty("url") + "/bundles/oronavigation/images/pinbar-location.jpg";
     String actualImgSrc = pinbarPageMM.pinBarImage.getAttribute("src");
     Assert.assertEquals("Img source is failed to show", expectedImgSrc, actualImgSrc);

    }


}
