package com.utng.giti.SpringApi.dao.impl;

import com.utng.giti.SpringApi.dao.PasienteDAO;
import com.utng.giti.SpringApi.model.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PacienteDAOImpl implements PasienteDAO {

    @Autowired
    private JdbcTemplate template;

    @Override
    public int addPaciente(Paciente p) {

        return template.update("INSERT INTO paciente(nombre,edad,peso,estatura,imc) VALUES(?,?,?,?,?)",
                p.getNombre(),p.getEdad(),p.getPeso(),p.getEstatura(),p.getImc());
    }
}
