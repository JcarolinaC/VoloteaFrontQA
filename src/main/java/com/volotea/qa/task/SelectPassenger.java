package com.volotea.qa.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.volotea.qa.userinterfaces.Passanger.*;

public class SelectPassenger implements Task {

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(CLOSE_COOKIES));
        actor.attemptsTo(Click.on(CLICK_IN_PASSANGER));
        actor.attemptsTo(Click.on(SELECT_PASSANGER));
        actor.attemptsTo(Click.on(SELECT_PASSANGER));
        actor.attemptsTo(Click.on(SELECT_PASSANGER));
        actor.attemptsTo(Click.on(SELECT_PASSANGER));
        actor.attemptsTo(Click.on(DELETE_PASSANGER));
    }
    public static SelectPassenger selectPassenger(){
        return Tasks.instrumented(SelectPassenger.class);
    }
}

