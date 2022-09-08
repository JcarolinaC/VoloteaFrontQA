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

public class PassengerStepDefinition {
    @Managed
    private WebDriver myBrowser;

    @Before
    public void setUpOnstage() {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Carolina Ceballos");
    }

    @Given("^the user is on the volotea page$")
    public void theUserIsOnTheVoloteaPage() {
    }

    @Given("^click on the passenger field$")
    public void clickOnThePassengerField() {

    }

    @When("^the list is displayed$")
    public void theListIsDisplayed() {

    }

    @Then("^check that this$")
    public void checkThatThis() {

    }
}

