package com.uce.emprendimiento.backend.dto;

public class NombreRequest {
    private String nombre;

    public NombreRequest() {
    }

    public NombreRequest(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
