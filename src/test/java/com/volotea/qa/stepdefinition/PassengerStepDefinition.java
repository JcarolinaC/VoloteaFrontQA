package com.volotea.qa.stepdefinition;

import com.volotea.qa.task.Cookies;
import com.volotea.qa.task.OpenBrowser;
import com.volotea.qa.task.SelectPassenger;
import cucumber.api.java.After;
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
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenBrowser.browser());
    }

    @When("^click on the passenger$")
    public void theListIsDisplayed() {
        OnStage.theActorInTheSpotlight().wasAbleTo(SelectPassenger.selectPassenger());

    }

    @Then("^check that this$")
    public void checkThatThis() {

    }
}

