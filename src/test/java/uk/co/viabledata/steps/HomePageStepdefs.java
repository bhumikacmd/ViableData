package uk.co.viabledata.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import uk.co.viabledata.page.HomePage;

public class HomePageStepdefs {
    @Given("^User is on HomePage$")
    public void userIsOnHomePage() {

    }
    @When("^User to click on main tab$")
    public void userToClickOnMainTab() {
        new HomePage().clickOnTab();

    }
    @And("^User to click on any of the lists$")
    public void userToClickOnAnyOfTheLists() {
        new HomePage().clickOnSubTab("Careers");
    }
    @Then("^User to verify \"([^\"]*)\" page$")
    public void userToVerifyPage(String tex)  {
        Assert.assertEquals(tex,new HomePage().verifyCareersText(tex));

    }

}
