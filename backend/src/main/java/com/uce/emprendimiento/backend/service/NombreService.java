package com.uce.emprendimiento.backend.service;

import org.springframework.stereotype.Service;

@Service
public class NombreService {
    
    public String procesarNombre(String nombre) throws IllegalArgumentException {
        // Validar que no esté vacío
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        
        // Validar que sea una sola palabra (sin espacios)
        if (nombre.trim().contains(" ")) {
            throw new IllegalArgumentException("El nombre debe ser una sola palabra");
        }
        
        // Validar que contenga solo letras
        if (!nombre.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("El nombre debe contener solo letras");
        }
        
        // Convertir a minúsculas y luego capitalizar la primera letra
        String nombreProcesado = nombre.trim().toLowerCase();
        return nombreProcesado.substring(0, 1).toUpperCase() + nombreProcesado.substring(1);
    }
}
