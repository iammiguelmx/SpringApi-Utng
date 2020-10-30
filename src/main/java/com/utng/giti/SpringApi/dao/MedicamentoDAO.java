package com.utng.giti.SpringApi.dao;

import com.utng.giti.SpringApi.model.Medicamento;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface MedicamentoDAO {

    Boolean addMedicamento (String nombreMedicamenteo, int pacienteId,int tipoId, MultipartFile file) throws IOException;

    List<Medicamento> getMedicamentos(int pacienteId);

}
