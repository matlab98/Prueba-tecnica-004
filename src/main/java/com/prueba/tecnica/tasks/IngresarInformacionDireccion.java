package com.prueba.tecnica.tasks;

import com.prueba.tecnica.model.FechaBuilder;
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

    private String username;
    private String password;
    private String password2;
    private String genero;

    public IngresarInformacionBasica(String username, String password, String password2, String genero) {
        this.username = username;
        this.password = password;
        this.password2 = password2;
        this.genero = genero;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RegisterUI.REGISTER));
        actor.attemptsTo(Enter.theValue(username).into(RegisterUI.USER_NAME), Enter.theValue(password).into(RegisterUI.CLAVE), Enter.theValue(password2).into(RegisterUI.CLAVE_VALIDAR));
        if(genero.equalsIgnoreCase("Male")){
            actor.attemptsTo(Click.on(RegisterUI.GENEROMASCULINO));
        } else {
            actor.attemptsTo(Click.on(RegisterUI.GENEROFEMENINO));
        }

       // actor.attemptsTo(SelectFromOptions.byVisibleText(fechaDia).from(RegisterUI.FECHA_DIA));
      //  actor.attemptsTo(SelectFromOptions.byIndex(Integer.valueOf(fechaMes)).from(RegisterUI.FECHA_MES));
       // actor.attemptsTo(SelectFromOptions.byVisibleText(fechaAnio).from(RegisterUI.FECHA_ANIO));
    }

    public static Performable registerUser (String username, String password, String password2, String genero) {
        return instrumented(IngresarInformacionBasica.class, username, password, password2,  genero);
    }
}
