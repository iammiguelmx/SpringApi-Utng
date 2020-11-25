package com.utng.giti.SpringApi.service.impl;

import com.utng.giti.SpringApi.dao.PacienteDAO;
import com.utng.giti.SpringApi.model.Message;
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
    public Message addPaciente(Paciente p) {

        Message message = new Message();
        if (service.addPaciente(p) == 1) {
            message.setCode("1");
            message.setMessage("Exito");
            message.setDescription("Los Datos se han guardado");
        } else {
            message.setCode("0");
            message.setMessage("Error");
            message.setDescription("Los Datos no se han guardado");
        }
        return message;
    }

    @Override
    public List<Paciente> getPacientes() {
        return service.getPacientes();
    }

    @Override
    public Message updatePaciente(Paciente paciente)  {

        Message message = new Message();
        if (service.updatePaciente(paciente) == 1) {
            message.setCode("1");
            message.setMessage("Exito");
            message.setDescription("Los Datos se han actualizado");
        } else {
            message.setCode("0");
            message.setMessage("Error");
            message.setDescription("Los Datos no se han actualizado");
        }
        return message;
    }



}
