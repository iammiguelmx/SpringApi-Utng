package com.utng.giti.SpringApi.dao;

import com.utng.giti.SpringApi.model.Medicamento;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface MedicamentoDAO {

    Boolean addMedicamento (String nombreMedicamenteo, int pacienteId,String tipoMedic, MultipartFile file) throws IOException;

    List<Medicamento> getMedicamentos(int pacienteId);

    Boolean updateMedicamentos(MultipartFile file , String nombre, String tipoMedic, int medicamentoId, int pacienteId) throws IOException;

    int deleteMedicamento(int medicamentoId);

}
