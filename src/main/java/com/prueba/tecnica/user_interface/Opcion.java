package com.prueba.tecnica.user_interface;

public enum Opcion {

    Inicio("https:utest.com");

    private final String url;

    Opcion(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }
}
