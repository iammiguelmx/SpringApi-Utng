package com.utng.giti.SpringApi.dao.impl;

import com.utng.giti.SpringApi.dao.PacienteDAO;
import com.utng.giti.SpringApi.model.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PacienteDAOImpl implements PacienteDAO {

    @Autowired
    private JdbcTemplate template;

    @Override
    public int addPaciente(Paciente p) {

        return template.update("INSERT INTO paciente(nombre,edad,peso,estatura,imc, pass) VALUES(?,?,?,?,?,?)",
                p.getNombre(),p.getEdad(),p.getPeso(),p.getEstatura(),p.getImc(),p.getPassword());
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
                                rs.getDouble("imc"),
                                rs.getString("pass")
                        )
        );
    }

    @Override
    public int updatePaciente(Paciente paciente) {
        return template.update(
                "update paciente set edad = ?, peso = ?, estatura = ?, imc = ? where paciente_id = ?",
                paciente.getEdad(), paciente.getPeso(), paciente.getEstatura(),
                paciente.getImc(),paciente.getPacienteId());
    }


   /* @Override
    public int deletePaciente(int pacienteId) {

        System.out.println("pacienteId" + pacienteId);
        return template.update(
                "delete from paciente where paciente_id = ?",
                pacienteId);
    }*/

}
