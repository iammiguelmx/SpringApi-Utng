package com.utng.giti.SpringApi.dao;

import com.utng.giti.SpringApi.model.Recordatorio;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface RecordatorioDAO {

    int addRecordatorios(Recordatorio r) throws IOException;

    Optional<Recordatorio> getRecordatorios(int medicamentoId);

    int updateRecordatorios(Recordatorio r) throws IOException;

    int deleteRecordatorio(int recordatorioId);
}
