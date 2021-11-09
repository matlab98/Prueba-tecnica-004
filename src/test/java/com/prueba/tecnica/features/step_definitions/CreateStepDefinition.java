package com.prueba.tecnica.features.step_definitions;

import com.prueba.tecnica.model.busqueda.BuscarVuelos;
import com.prueba.tecnica.model.busqueda.FechaDeSalida;
import com.prueba.tecnica.tasks.IngresarInformacionBasica;
import com.prueba.tecnica.tasks.Navegar;
import cucumber.api.java.Before;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static com.prueba.tecnica.user_interface.Opcion.Inicio;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class CreateStepDefinition {

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^se abre la pagina web uTest$")
    public void se_abre_la_pagina_web_uTest() throws Throwable {
        theActorCalled("Hilder").attemptsTo(
                Navegar.a(Inicio)
        );


    }

    @When("^se diligencia los datos basicos (.+), (.+), (.+) y (.+)$")
    public void se_diligencia_los_datos_basicos_y(String nombre, String apellido, String fechadenacimiento, String correo) throws Throwable {
    theActorCalled("Hilder").attemptsTo(IngresarInformacionBasica.registerUser(nombre, apellido, correo, fechadenacimiento.substring(0,2), fechadenacimiento.substring(2,4), fechadenacimiento.substring(4) ));
    }

    @Then("^ella deberia ver las siguientes opciones de clase de vuelo:$")
    public void ellaDeberiaLasSiguientesOpcionesDeClaseDeVuelo(List<String> clasesDeVuelo) throws Throwable {
       /* EnUnFrame.llamado("FrameAmadeus")
                .entonces(theActorInTheSpotlight())
                .espera(verQueCadaClaseDeVueloEstaEn(clasesDeVuelo));*/
    }


}
