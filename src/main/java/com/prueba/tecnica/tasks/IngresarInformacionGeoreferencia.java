package com.prueba.tecnica.tasks;

import com.prueba.tecnica.user_interface.RegisterUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarInformacionGeoreferencia implements Task {

    private String ciudad;
    private String pais;
    private String codigo;

    public IngresarInformacionGeoreferencia(String ciudad, String pais, String codigo) {
        this.ciudad = ciudad;
        this.pais = pais;
        this.codigo = codigo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RegisterUI.BOTON_SIGUIENTE_1));
        //actor.attemptsTo(Enter.theValue(ciudad).into(RegisterUI.CIUDAD));
        //actor.attemptsTo(Enter.theValue(pais).into(RegisterUI.PAIS));
        //actor.attemptsTo(Enter.theValue(codigo).into(RegisterUI.ZIP));
    }

    public static Performable registerUser (String ciudad, String codigo, String pais) {
        return instrumented(IngresarInformacionGeoreferencia.class, ciudad, pais, codigo);
    }
}
