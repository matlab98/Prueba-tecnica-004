package com.prueba.tecnica.model;

import com.prueba.tecnica.tasks.IngresarInformacionBasica;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FechaBuilder {

    private int dia;

    public FechaBuilder de(int dia) {
        this.dia = dia;
        return this;
    }

    public Performable en(Target campoDeFecha) {
        return instrumented(IngresarInformacionBasica.class, dia, campoDeFecha);
    }
}
