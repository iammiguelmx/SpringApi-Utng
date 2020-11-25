package com.utng.giti.SpringApi.service;

import com.utng.giti.SpringApi.model.Medicamento;
import com.utng.giti.SpringApi.model.Message;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface MedicamentoService {

    Message addMedicamento (String nombreMedicamenteo, int pacienteId, String tipoMedic, MultipartFile file) throws IOException;

    List<Medicamento> getMedicamentos(int id);

    Message updateMedicamentos(MultipartFile file , String nombre, String tipoMedic, int medicamentoId, int pacienteId) throws IOException;

    Message deleteMedicamento(int medicamentoId);
}
