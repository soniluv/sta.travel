package org.qatest.statravel.stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.qatest.statravel.pages.BasePage;
import org.qatest.statravel.pages.TourPage;

public class TourStepDefs extends BasePage {
    TourPage tourPage = new TourPage();

    @Given("^user is on the tours page$")
    public void user_is_on_the_tours_page() {
        Assert.assertTrue(driver.findElement(By.xpath("//span[contains(text(),'Tours Worldwide')]")).isDisplayed());
    }

    @When("^user selects destination \"([^\"]*)\"$")
    public void user_selects_destination(String destination){
        tourPage.selectDestination(destination);

    }

    @When("^click on \"([^\"]*)\" button$")
    public void click_on_button(String tabName) {
       tourPage.clickOnButton(tabName);
    }

    @Then("^user could see the tour options displayed$")
    public void user_could_see_the_tour_options_displayed() {
        Assert.assertTrue(driver.findElement(By.id("lblTotalSearchResult")).isDisplayed());
    }

    @When("^user change the sort order on the search results to “Price \\(Low-High\\)\"$")
    public void user_change_the_sort_order_on_the_search_results_to_Price_Low_High() {
        tourPage.sortSearchOrder();
    }

    @Then("^user could see more and all the results displayed$")
    public void user_could_see_more_and_all_the_results_displayed(){
        tourPage.viewMoreResults();
    }
}
