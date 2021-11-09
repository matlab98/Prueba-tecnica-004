package com.prueba.tecnica.tasks;

import com.prueba.tecnica.model.FechaBuilder;
import com.prueba.tecnica.model.busqueda.FechaDeSalida;
import com.prueba.tecnica.user_interface.RegisterUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.time.LocalDate;

public class IngresarInformacionDispositivo implements Task {

    private String  movil, modeloMovil, osMovil, computadorOs, versionPc, lenguajePc;

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
        actor.attemptsTo(SelectFromOptions.byVisibleText(movil).from(RegisterUI.FECHA_DIA));
        actor.attemptsTo(SelectFromOptions.byVisibleText(modeloMovil).from(RegisterUI.FECHA_DIA));
        actor.attemptsTo(SelectFromOptions.byVisibleText(osMovil).from(RegisterUI.FECHA_DIA));
        actor.attemptsTo(SelectFromOptions.byVisibleText(computadorOs ).from(RegisterUI.FECHA_DIA));
        actor.attemptsTo(SelectFromOptions.byVisibleText(versionPc).from(RegisterUI.FECHA_DIA));
        actor.attemptsTo(SelectFromOptions.byVisibleText(lenguajePc).from(RegisterUI.FECHA_ANIO));
    }

    public static Performable registerUser (String movil, String modeloMovil, String osMovil, String computadorOs, String versionPc, String lenguajePc) {
        return instrumented(IngresarInformacionDispositivo.class, movil, modeloMovil, osMovil, computadorOs, versionPc, lenguajePc);
    }
}
