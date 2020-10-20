package com.utng.giti.SpringApi.service;

import com.utng.giti.SpringApi.model.Paciente;

import java.util.List;

public interface PacienteService {

    int addPaciente (Paciente p);

    List<Paciente> getPacientes();
}
