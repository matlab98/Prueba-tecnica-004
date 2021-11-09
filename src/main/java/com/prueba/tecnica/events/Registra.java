package com.prueba.tecnica.events;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Consequence;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Registra {

    private Actor actor;

    public static Registra llamado(String nombre) {
        WebDriver driver  = Serenity.getWebdriverManager().getCurrentDriver();
        driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
        driver.switchTo().frame(nombre);
        return new Registra();
    }
    
    public Registra entonces(Actor actor) {
        this.actor = actor;
        return this;
    }

    public void espera(Consequence... consequences) {
        actor.should(consequences);
        Serenity.getWebdriverManager().getCurrentDriver().switchTo().defaultContent();
    }
}
