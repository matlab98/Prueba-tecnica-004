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

public class IngresarInformacionBasica implements Task {

    private String nombre;
    private String apellido;
    private String correo;
    private String fechaDia;
    private String fechaMes;
    private String fechaAnio;

    private Target JOIN_TODAY;

    public IngresarInformacionBasica(String nombre, String apellido, String correo, String dia, String mes, String anio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.fechaDia = dia;
        this.fechaMes = mes;
        this.fechaAnio = anio;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RegisterUI.JOIN_TODAY));
        actor.attemptsTo(Enter.theValue(nombre).into(RegisterUI.FIRST_NAME));
        actor.attemptsTo(Enter.theValue(apellido).into(RegisterUI.LAST_NAME));
        actor.attemptsTo(Enter.theValue(correo).into(RegisterUI.EMAIL));
        actor.attemptsTo(SelectFromOptions.byVisibleText(fechaDia).from(RegisterUI.FECHA_DIA));
        actor.attemptsTo(SelectFromOptions.byIndex(Integer.valueOf(fechaMes)).from(RegisterUI.FECHA_MES));
        actor.attemptsTo(SelectFromOptions.byVisibleText(fechaAnio).from(RegisterUI.FECHA_ANIO));
    }

    public static Performable registerUser (String nombre, String apellido, String correo, String dia, String mes, String anio) {
        return instrumented(IngresarInformacionBasica.class, nombre, apellido, correo, dia, mes, anio);
    }
}
