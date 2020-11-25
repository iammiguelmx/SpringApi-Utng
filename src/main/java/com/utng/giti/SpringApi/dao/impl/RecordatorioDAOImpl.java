package com.utng.giti.SpringApi.dao.impl;

import com.utng.giti.SpringApi.dao.RecordatorioDAO;
import com.utng.giti.SpringApi.model.Recordatorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.Optional;

@Repository
public class RecordatorioDAOImpl implements RecordatorioDAO {

    @Autowired
    private JdbcTemplate template;

    @Override
    public int addRecordatorios(Recordatorio r) throws IOException {

        return template.update("INSERT INTO recordatorio(nombre,fecha_ini,fecha_fin,tiempo,medicamento_id, dosis, " +
                        "medicamento_tomado) VALUES(?,?,?,?,?,?,?)",
                r.getNombreRec(), r.getFechaIni(), r.getFechaFin(), r.getTiempo(), r.getMedicamentoId(), r.getDosis(), r.isTomado());
    }

    @Override
    public Optional<Recordatorio> getRecordatorios(int medicamentoId) {
        return template.queryForObject(
                "select r.recordatorio_id, r.nombre as nombre_recordatorio, me.nombre as nombre_medicamento, " +
                        "me.tipo_medicamento, r.fecha_ini, r.fecha_fin, r.tiempo, r.dosis, r.medicamento_tomado " +
                        "from recordatorio r join medicamento me using(medicamento_id) WHERE me.medicamento_id = ?",
                new Object[]{medicamentoId},(rs, rowNum) ->
                        Optional.of(new Recordatorio(
                                rs.getInt("recordatorio_id"),
                                rs.getString("nombre_recordatorio"),
                                rs.getString("nombre_medicamento"),
                                rs.getString("tipo_medicamento"),
                                rs.getString("fecha_ini"),
                                rs.getString("fecha_fin"),
                                rs.getInt("tiempo"),
                                rs.getInt("dosis"),
                                rs.getBoolean("medicamento_tomado")
                        ))
        );
    }

    @Override
    public int updateRecordatorios(Recordatorio r) throws IOException {
        return template.update(
                "update recordatorio set nombre = ?, fecha_ini = ?, fecha_fin = ?, tiempo = ?," +
                        "dosis = ?, medicamento_id = ?, medicamento_tomado = ? where recordatorio_id = ?",
                r.getNombreRec(), r.getFechaIni(), r.getFechaFin(), r.getTiempo(), r.getDosis(),
                r.getMedicamentoId(),r.isTomado(), r.getRecordatorioId());
    }

    @Override
    public int deleteRecordatorio(int recordatorioId) {
        return template.update(
                "delete from recordatorio where recordatorio_id = ?",
                recordatorioId);
    }
}
