package com.volotea.qa.stepdefinition;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class OrigenStepDefinition {
    @Managed
    private WebDriver myBrowser;

    @Before
    public void setUpOnstage() {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Carolina Ceballos");
    }
    @Given("^click on the source field$")
    public void clickOnTheSourceField() {

    }

    @When("^select the country option$")
    public void selectTheCountryOption() {

    }

    @Then("^validate that a list with a box of countries is visible$")
    public void validateThatAListWithABoxOfCountriesIsVisible() {

    }
}
