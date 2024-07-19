package com.fleet_project.step_definitions;
import com.fleet_project.pages.BasePage;
import com.fleet_project.pages.MainModulesPage_SC;
import com.fleet_project.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import java.util.List;
public class US163_MainModulesStepDefs extends BasePage{
    MainModulesPage_SC mainModulesPageSc = new MainModulesPage_SC();
    @Given("user goes on  Vehicles Model")
    public void user_goes_on_vehicles_model() {
        navigateToModule("Fleet", "Vehicles Model");
    }
    @Then("users should see a message")
    public void usersShouldSeeA() {
        waitUntilLoaderScreenDisappear();
        String expectedMessage = "You do not have permission to perform this action.";
        String actualMessage = mainModulesPageSc.divYouDoNotHave.getText();
        Assert.assertEquals(expectedMessage,actualMessage);
    }
    @Then("user sees ten columns on the Vehicle Model page")
    public void userSeesTenColumnsOnTheVehicleModelPage(List<String> columns) {
        BrowserUtils.getElementsText(mainModulesPageSc.theadAllVisibleNoneModel2);
    }
}
