package com.prueba.tecnica.tasks;

import com.prueba.tecnica.user_interface.RegisterUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarClaves implements Task {

    private String pass;

    public IngresarClaves(String pass) {
        this.pass = pass;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RegisterUI.BOTON_SIGUIENTE_3));
        actor.attemptsTo(Enter.theValue(pass).into(RegisterUI.CLAVE));
        actor.attemptsTo(Enter.theValue(pass).into(RegisterUI.CLAVE_VALIDAR));
        actor.attemptsTo(Click.on(RegisterUI.OK_CONSENT));
        actor.attemptsTo(Click.on(RegisterUI.OK_CONSENT));
        actor.attemptsTo(Click.on(RegisterUI.BOTON_FINAL));
    }

    public static Performable registerUser (String clave) {
        return instrumented(IngresarClaves.class, clave);
    }
}
