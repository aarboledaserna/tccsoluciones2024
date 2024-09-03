package com.example.BODEGASTCCAPI.helpers.validaciones;

public class MercanciaValidacion {

    public boolean validarVolumen(Double volumen){
        return volumen > 0;
    }

    public boolean validarPeso(Double peso){
        return peso>0;
    }

    public boolean validarNombre(String nombre){
        if(nombre.length()>50){
            return false;
        }
        return nombre.matches("^[a-zA-Z\\s]+$");
    }



}
