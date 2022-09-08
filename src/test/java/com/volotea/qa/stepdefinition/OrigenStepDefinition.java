package com.volotea.qa.stepdefinition;

import com.volotea.qa.task.OpenBrowser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class OrigenStepDefinition {
    @Managed
    private static WebDriver myBrowser;

    @Before
    public static void setUpOnstage() {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Carolina Ceballos");
    }
    @Given("^click on the source field$")
    public void clickOnTheSourceField() {
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenBrowser.browser());

    }

    @When("^select the country option$")
    public void selectTheCountryOption() {

    }

    @Then("^validate that a list with a box of countries is visible$")
    public void validateThatAListWithABoxOfCountriesIsVisible() {

    }
}

