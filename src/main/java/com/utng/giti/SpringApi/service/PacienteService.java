package com.utng.giti.SpringApi.service;

import com.utng.giti.SpringApi.model.Message;
import com.utng.giti.SpringApi.model.Paciente;

import java.util.List;

public interface PacienteService {

    Message addPaciente (Paciente p);

    List<Paciente> getPacientes();

    Message updatePaciente(Paciente paciente);

}
