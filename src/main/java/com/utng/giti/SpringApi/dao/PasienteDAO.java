package com.utng.giti.SpringApi.dao;

import com.utng.giti.SpringApi.model.Paciente;

import java.util.List;

public interface PasienteDAO {

    int addPaciente (Paciente p);

    List<Paciente> getPacientes();

}
