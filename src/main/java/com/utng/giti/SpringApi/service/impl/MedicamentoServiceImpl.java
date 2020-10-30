package com.utng.giti.SpringApi.service.impl;

import com.utng.giti.SpringApi.dao.MedicamentoDAO;
import com.utng.giti.SpringApi.model.Medicamento;
import com.utng.giti.SpringApi.model.Message;
import com.utng.giti.SpringApi.service.MedicamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;
import java.io.IOException;
import java.util.Optional;

@Service
public class MedicamentoServiceImpl implements MedicamentoService {

    @Autowired
    private MedicamentoDAO service;

    @Override
    public Message addMedicamento(String nombreMedicamenteo, int pacienteId, int tipoId, MultipartFile file)
            throws IOException {

        Message message = new Message();
        if(service.addMedicamento(nombreMedicamenteo,pacienteId,tipoId,file) == false){
            message.setCode("1");
            message.setMessage("Exito");
            message.setDescription("Los Datos se han guardado");
        }else {
            message.setCode("1");
            message.setMessage("Error");
            message.setDescription("Los Datos no se han guardado");
        }
        return message;
    }

    @Override
    public List<Medicamento> getMedicamentos(int pacienteId) {
        return service.getMedicamentos(pacienteId);
    }
}
