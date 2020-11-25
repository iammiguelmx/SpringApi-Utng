package com.utng.giti.SpringApi.service.impl;

import com.utng.giti.SpringApi.dao.PacienteDAO;
import com.utng.giti.SpringApi.dao.RecordatorioDAO;
import com.utng.giti.SpringApi.model.Message;
import com.utng.giti.SpringApi.model.Recordatorio;
import com.utng.giti.SpringApi.service.RecordatorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Optional;

@Service
public class RecordatorioServiceImpl implements RecordatorioService {

    @Autowired
    private RecordatorioDAO service;
    @Override
    public Message addRecordatorios(Recordatorio r) throws IOException {
        Message message = new Message();
        if (service.addRecordatorios(r) == 1) {
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
    public Optional<Recordatorio> getRecordatorios(int medicamentoId) {
        return service.getRecordatorios(medicamentoId);
    }

    @Override
    public Message updateRecordatorios(Recordatorio r) throws IOException {
        Message message = new Message();
        if (service.updateRecordatorios(r) == 1) {
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

    @Override
    public Message deleteRecordatorio(int recordatorioId) {

        Message message = new Message();
        if (service.deleteRecordatorio(recordatorioId) == 1) {
            message.setCode("1");
            message.setMessage("Exito");
            message.setDescription("Los Datos se han eliminado");
        } else {
            message.setCode("0");
            message.setMessage("Error");
            message.setDescription("Los Datos no se han eliminado");
        }
        return message;
    }
}
