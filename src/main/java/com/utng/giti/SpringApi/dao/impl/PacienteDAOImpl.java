package com.utng.giti.SpringApi.dao.impl;

import com.utng.giti.SpringApi.dao.PasienteDAO;
import com.utng.giti.SpringApi.model.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PacienteDAOImpl implements PasienteDAO {

    @Autowired
    private JdbcTemplate template;

    @Override
    public int addPaciente(Paciente p) {

        return template.update("INSERT INTO paciente(nombre,edad,peso,estatura,imc) VALUES(?,?,?,?,?)",
                p.getNombre(),p.getEdad(),p.getPeso(),p.getEstatura(),p.getImc());
    }

    @Override
    public List<Paciente> getPacientes() {
        return template.query(
                "select * from paciente",
                (rs, rowNum) ->
                        new Paciente(
                                rs.getInt("paciente_id"),
                                rs.getString("nombre"),
                                rs.getInt("edad"),
                                rs.getDouble("peso"),
                                rs.getDouble("estatura"),
                                rs.getDouble("imc")
                        )
        );
    }


}
