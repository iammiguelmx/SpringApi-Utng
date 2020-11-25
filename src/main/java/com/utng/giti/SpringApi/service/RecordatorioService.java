package com.utng.giti.SpringApi.service;

import com.utng.giti.SpringApi.model.Message;
import com.utng.giti.SpringApi.model.Recordatorio;

import java.io.IOException;
import java.util.Optional;

public interface RecordatorioService {

    Message addRecordatorios(Recordatorio r) throws IOException;

    Optional<Recordatorio> getRecordatorios(int medicamentoId);

    Message updateRecordatorios(Recordatorio r) throws IOException;

    Message deleteRecordatorio(int recordatorioId);
}
