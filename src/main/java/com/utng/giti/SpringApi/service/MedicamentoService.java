package com.utng.giti.SpringApi.service;

import com.utng.giti.SpringApi.model.Medicamento;
import com.utng.giti.SpringApi.model.Message;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface MedicamentoService {

    Message addMedicamento (String nombreMedicamenteo, int pacienteId, int tipoId, MultipartFile file) throws IOException;

    List<Medicamento> getMedicamentos(int id);

    Message updateMedicamentos(MultipartFile file , String nombre, int tipoId, int medicamentoId, int pacienteId) throws IOException;

    int deleteMedicamento(int medicamentoId);
}
