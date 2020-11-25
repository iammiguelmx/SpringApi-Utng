package com.utng.giti.SpringApi.controller;

import com.utng.giti.SpringApi.model.Message;
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
    public Message addPaciente(@RequestBody Paciente p){
        Message resp = service.addPaciente(p);
        return resp;
    }

    @GetMapping("/getPacientes")
    public List<Paciente> getPacientes(){

         return service.getPacientes();

    }

    @PutMapping("/updatePaciente")
    public Message updatePaciente(@RequestBody Paciente p){
        Message resp = service.updatePaciente(p);
        return resp;

    }

   /* @DeleteMapping("/deletePaciente/{pacienteId}")
    public int deletePaciente(@PathVariable int pacienteId){

        System.out.println("pacienteId" + pacienteId);

        return service.deletePaciente(pacienteId);

    }*/
}
