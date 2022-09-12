package com.volotea.qa.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.volotea.qa.userinterfaces.Passanger.SELECT_BABY;

public class SelectBabys implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SELECT_BABY));
    }

    public static SelectBabys selectBabys() {
        return Tasks.instrumented(SelectBabys.class);
    }
}

