package com.prueba.tecnica.tasks;

import com.prueba.tecnica.model.FechaBuilder;
import com.prueba.tecnica.model.busqueda.FechaDeSalida;
import com.prueba.tecnica.user_interface.RegisterUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.Keys;

import static java.lang.Thread.sleep;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.time.LocalDate;

public class IngresarInformacionDispositivo implements Task {

    private String  movil;
    private String modeloMovil;
    private String osMovil;
    private String computadorOs;
    private String versionPc;
    private String lenguajePc;

    public IngresarInformacionDispositivo(String movil, String modeloMovil, String osMovil, String computadorOs, String versionPc, String lenguajePc) {
        this.movil = movil;
        this.modeloMovil = modeloMovil;
        this.osMovil = osMovil;
        this.computadorOs = computadorOs;
        this.versionPc = versionPc;
        this.lenguajePc = lenguajePc;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RegisterUI.BOTON_SIGUIENTE_2));
        //actor.attemptsTo(Click.on(RegisterUI.ELEGIR_BRAND));
        //actor.attemptsTo(Enter.theValue(movil).into(RegisterUI.ELEGIR_BRAND));

        //actor.attemptsTo(Hit.the(Keys.ENTER).into());

        //actor.attemptsTo(SelectFromOptions.byVisibleText(modeloMovil).from(RegisterUI.MODEL));
        //actor.attemptsTo(SelectFromOptions.byVisibleText(osMovil).from(RegisterUI.ELEGIR_OS));
        //actor.attemptsTo(SelectFromOptions.byVisibleText(computadorOs ).from(RegisterUI.OS_LENGUAJE));
        //actor.attemptsTo(SelectFromOptions.byVisibleText(versionPc).from(RegisterUI.VERSION));
        //actor.attemptsTo(SelectFromOptions.byVisibleText(lenguajePc).from(RegisterUI.VERSION));
    }

    public static Performable registerUser (String movil, String modeloMovil, String osMovil, String computadorOs, String versionPc, String lenguajePc) {
        return instrumented(IngresarInformacionDispositivo.class, movil, modeloMovil, osMovil, computadorOs, versionPc, lenguajePc);
    }
}
