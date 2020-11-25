package com.utng.giti.SpringApi.service.impl;

import com.utng.giti.SpringApi.dao.PacienteDAO;
import com.utng.giti.SpringApi.service.PacienteService;
import com.utng.giti.SpringApi.model.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteServiceImpl implements PacienteService {

    @Autowired
    private PacienteDAO service;

    @Override
    public int addPaciente(Paciente p) {
        return service.addPaciente(p);
    }

    @Override
    public List<Paciente> getPacientes() {
        return service.getPacientes();
    }

    @Override
    public int updatePaciente(Paciente paciente)  {
        return service.updatePaciente(paciente);
    }



}
