package com.fleet_project.step_definitions;

import com.fleet_project.pages.BasePage;
import com.fleet_project.pages.VehicleOdometerPage_FS;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US11_VehiclesOdometersStepDefs extends BasePage {

    VehicleOdometerPage_FS vehicleOdometerPageFS = new VehicleOdometerPage_FS();

    @When("user goes in to Odometer Page")
    public void user_goes_in_to_odometer_page() {
        getPageSubTitle();
        waitUntilLoaderScreenDisappear();

        navigateToModule("Fleet", "Vehicle Odometer");
    }

    @Then("driver should be see page number {int} and view per page {int}")
    public void driver_should_be_see_page_number_and_view_per_page(Integer pageNumber, Integer viewPerPage) {

        String expectedPageNumber = String.valueOf(pageNumber);
        String expectedViewPerPage =  String.valueOf(viewPerPage);

        navigateToModule("Fleet", "Vehicle Odometer");

        String actualPageNumber = vehicleOdometerPageFS.pageNumber.getAttribute("value");
        String actualViewPerPage = vehicleOdometerPageFS.viewPerPage.getText();

        Assert.assertEquals(expectedPageNumber, actualPageNumber);
        System.out.println("actualPageNumber = " + actualPageNumber);
        Assert.assertEquals(expectedViewPerPage, actualViewPerPage);

    }


    @Then("user should see an error message {string}")
    public void userShouldSeeAnErrorMessage(String expectedMessage) {

        waitUntilLoaderScreenDisappear();

        String actualMessage = vehicleOdometerPageFS.errorMessage.getText();

        System.out.println("actualMessage = " + actualMessage);

        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Then("driver should be see page number {string}")
    public void driver_should_be_see_page_number(String pageNumber) {
        String actualPageNumber = vehicleOdometerPageFS.pageNumber.getAttribute("value");

        System.out.println("actualPageNumber = " + actualPageNumber);

        Assert.assertEquals(pageNumber, actualPageNumber);

    }

    @Then("driver should be see view per page {string}")
    public void driver_should_be_see_view_per_page(String viewPerPage) {
        String actualViewPerPage = vehicleOdometerPageFS.viewPerPage.getText();
        System.out.println("actualViewPerPage = " + actualViewPerPage);
        Assert.assertEquals(viewPerPage, actualViewPerPage);
    }


}
