package com.utng.giti.SpringApi.controller;

import com.utng.giti.SpringApi.model.Paciente;
import com.utng.giti.SpringApi.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recordatorios")
public class PacienteController {

    @Autowired
    private PacienteService service;

    @PostMapping("/addPaciente")
    public int addPaciente(@RequestBody Paciente p){
        int resp = service.addPaciente(p);
        return resp;
    }
}
