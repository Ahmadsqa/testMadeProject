package com.made.stepDefinitions;

import com.made.pages.BasePage;
import com.made.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class NewlyAddedRangeSearchSteps extends BasePage {
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);


    @Given("i navigate to madeCom homepage")
    public void i_navigate_to_madeCom_homepage() {
        launchUrl();
    }

    @When("i click on new tab")
    public void i_click_on_new_tab() {

    }

    @When("i click  new living room link")
    public void i_click_new_living_room_link() {

    }

    @When("i click colour tab")
    public void i_click_colour_tab() {

    }

    @When("i click on red colour")
    public void i_click_on_red_colour() {

    }

    @When("i click the done button")
    public void i_click_the_done_button() {

    }

    @When("i click product type tab")
    public void i_click_product_type_tab() {

    }

    @When("i click the sofa checkbox")
    public void i_click_the_sofa_checkbox() {

    }

    @When("i click on corner sofa checkbox")
    public void i_click_on_corner_sofa_checkbox() {

    }

    @When("i click on done button")
    public void i_click_on_done_button() {

    }

    @When("i click dispatch tab")
    public void i_click_dispatch_tab() {

    }

    @When("i click on arrive in {int} weeks checkbox")
    public void i_click_on_arrive_in_weeks_checkbox(Integer int1) {

    }

    @When("i enter the minimum price as {string}")
    public void i_enter_the_minimum_price_as(String string) {

    }

    @When("i enter maximum price as {string}")
    public void i_enter_maximum_price_as(String string) {

    }

    @When("i click the style tab")
    public void i_click_the_style_tab() {
        ;
    }

    @When("i click modern checkbox")
    public void i_click_modern_checkbox() {

    }

    @When("i click retro checkbox")
    public void i_click_retro_checkbox() {

    }

    @When("i click the room type check box")
    public void i_click_the_room_type_check_box() {

    }

    @When("i click on bedroom checkbox")
    public void i_click_on_bedroom_checkbox() {

    }

    @When("i click on office")
    public void i_click_on_office() {

    }

    @Then("the results based on above criteria are displayed on the same homepage.")
    public void the_results_based_on_above_criteria_are_displayed_on_the_same_homepage() {

    }
}
