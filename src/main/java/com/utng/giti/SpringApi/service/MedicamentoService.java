package com.utng.giti.SpringApi.service;

import com.utng.giti.SpringApi.model.Medicamento;
import com.utng.giti.SpringApi.model.Message;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface MedicamentoService {

    Message addMedicamento (String nombreMedicamenteo, int pacienteId, int tipoId, MultipartFile file) throws IOException;

    List<Medicamento> getMedicamentos(int id);
}
