package com.utng.giti.SpringApi.controller;

import com.utng.giti.SpringApi.model.Paciente;
import com.utng.giti.SpringApi.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/getPacientes")
    public List<Paciente> getPacientes(){

         return service.getPacientes();

    }

    @PutMapping("/updatePaciente")
    public int updatePaciente(@RequestBody Paciente p){

        return service.updatePaciente(p);

    }

   /* @DeleteMapping("/deletePaciente/{pacienteId}")
    public int deletePaciente(@PathVariable int pacienteId){

        System.out.println("pacienteId" + pacienteId);

        return service.deletePaciente(pacienteId);

    }*/
}
