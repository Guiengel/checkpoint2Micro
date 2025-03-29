package br.com.fiap.checkpoint1.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

public class PacienteController {
    @PostMapping
    public ResponseEntity<String> createPaciente() {
        return ResponseEntity.status(201).body("Paciente criado");
    }

    @DeleteMapping
    public ResponseEntity<Void> delete(){
        return ResponseEntity.status(204).build();
    }

    @PutMapping
    public ResponseEntity<String> update(){
        return ResponseEntity.status(202).body("Cliente Atualizado");
    }

    @GetMapping
    public ResponseEntity<String> find(){
        return ResponseEntity.status(200).body(null);
    }

}
