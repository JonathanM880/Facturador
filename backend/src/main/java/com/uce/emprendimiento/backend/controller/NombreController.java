package com.uce.emprendimiento.backend.controller;

import com.uce.emprendimiento.backend.dto.NombreRequest;
import com.uce.emprendimiento.backend.dto.NombreResponse;
import com.uce.emprendimiento.backend.service.NombreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class NombreController {
    
    @Autowired
    private NombreService nombreService;
    
    @PostMapping("/nombre")
    public ResponseEntity<?> procesarNombre(@RequestBody NombreRequest request) {
        try {
            String nombreProcesado = nombreService.procesarNombre(request.getNombre());
            return ResponseEntity.ok(new NombreResponse(nombreProcesado));
        } catch (IllegalArgumentException e) {
            Map<String, String> error = new HashMap<>();
            error.put("error", e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
        }
    }
}
