package com.prueba.tecnica.questions;

import java.text.MessageFormat;

public class CorreoDisponible {

    private static String mensajeDeErrorParaCampoFaltante(String clase) {
        return MessageFormat.format("El campo {0} no fue encontrada", clase);
    }
}
