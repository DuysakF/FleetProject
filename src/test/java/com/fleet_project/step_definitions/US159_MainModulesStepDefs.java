package com.fleet_project.step_definitions;

import com.fleet_project.pages.BasePage;
import com.fleet_project.pages.MainModulesPage_FD;
import io.cucumber.java.en.Then;
import org.junit.Assert;


import java.util.List;

public class US159_MainModulesStepDefs extends BasePage {


    MainModulesPage_FD modulesPage = new MainModulesPage_FD();

    @Then("the user should see the following modules:")
    public void the_user_should_see_the_following_modules(List<String> expectedModules) {
        waitUntilLoaderScreenDisappear();
        List<String> actualModules = modulesPage.getModuleNames();
        Assert.assertEquals(expectedModules, actualModules);
    }


}
