package com.volotea.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Passanger {

    public static final Target CLOSE_COOKIES = Target
            .the("Se cierran las cookies")
            .located(By.xpath("//*[@id='onetrust-accept-btn-handler']"));

    public static final Target CLICK_IN_PASSANGER = Target
            .the("Se da click en pasajero")
            .located(By.xpath("//input[@id='input-text_sf-passenger']"));

    public static final Target SELECT_PASSANGER = Target
            .the("Se Selecciona un pasajero")
            .located(By.xpath("//sf-passengers-counter[1]/span[3]"));

    public static final Target DELETE_PASSANGER = Target
            .the("Se elimina pasajero")
            .located(By.xpath("//*[@class='ng-star-inserted v7-btn-circle v7-btn-circle--sm']"));

            //.located(By.xpath("//*[@class='v7-passenger__counter']"));
}
//v7-passenger__counter
//v7-passenger__number ng-star-inserted
//ng-star-inserted v7-btn-circle