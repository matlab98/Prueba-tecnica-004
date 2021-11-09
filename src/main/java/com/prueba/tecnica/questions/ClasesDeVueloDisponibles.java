package com.prueba.tecnica.questions;

import net.serenitybdd.screenplay.Consequence;

import java.text.MessageFormat;
import java.util.List;
import java.util.stream.Collectors;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class ClasesDeVueloDisponibles {



    private static String mensajeDeErrorParaClaseDeVueloFaltante(String clase) {
        return MessageFormat.format("La clase {0} no fue encontrada", clase);
    }
}
