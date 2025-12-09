package com.uce.emprendimiento.backend.dto;

public class NombreResponse {
    private String nombre;

    public NombreResponse(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
