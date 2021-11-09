package com.prueba.tecnica.model.busqueda;

import net.serenitybdd.screenplay.Performable;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuscarVuelosSoloIdaBuilder {

    private String origen;
    private String destino;

    public BuscarVuelosSoloIdaBuilder de(String origen) {
        this.origen = origen;
        return this;
    }

    public BuscarVuelosSoloIdaBuilder a(String destino) {
        this.destino = destino;
        return this;
    }


}
