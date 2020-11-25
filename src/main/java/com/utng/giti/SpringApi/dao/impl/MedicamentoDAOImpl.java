package com.utng.giti.SpringApi.dao.impl;

import com.utng.giti.SpringApi.dao.MedicamentoDAO;
import com.utng.giti.SpringApi.model.Medicamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

@Repository
public class MedicamentoDAOImpl implements MedicamentoDAO {

    @Autowired
    private JdbcTemplate template;

    @Override
    public Boolean addMedicamento(String nombreMedicamenteo, int pacienteId, String tipoMedic, MultipartFile file) throws IOException {

        byte[] fileBytes = file.getBytes();
        boolean res = true;
        String sql = "INSERT INTO medicamento(nombre,img_medicamento,paciente_id,tipo_medicamento) VALUES(?,?,?,?)";
        //try{
        return template.execute(sql, new PreparedStatementCallback<Boolean>() {
            @Override
            public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
                ps.setString(1, nombreMedicamenteo);
                ps.setBytes(2, fileBytes);
                ps.setInt(3, pacienteId);
                ps.setString(4, tipoMedic);

                System.out.println("ps" + ps);
                return ps.execute();

            }

        });
        /*} catch(Exception e){
            System.out.println(e);
            res = true;
            return res;
        }*/
    }

    @Override
    public Boolean updateMedicamentos(MultipartFile file , String nombre, String tipoMedic, int medicamentoId, int pacienteId)  throws IOException{

        byte[] fileBytes = file.getBytes();
        boolean res = true;

        String sql ="update medicamento set img_medicamento = ?, nombre = ?, tipo_medicamento = ? " +
                        "where medicamento_id = ? and paciente_id = ?";

        return template.execute(sql, new PreparedStatementCallback<Boolean>() {
            @Override
            public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
                ps.setBytes(1, fileBytes);
                ps.setString(2, nombre);
                ps.setString(3, tipoMedic);
                ps.setInt(4, medicamentoId);
                ps.setInt(5, pacienteId);

                System.out.println("ps" + ps);
                return ps.execute();

            }

        });
    }

    @Override
    public List<Medicamento> getMedicamentos(int pacienteId) {
        return template.query("SELECT me.medicamento_id as medicamento_id, me.nombre AS medicamento, " +
                        " pa.paciente_id, pa.nombre AS paciente " +
                        "FROM medicamento AS me JOIN paciente AS pa USING (paciente_id)  " +
                        "WHERE me.paciente_id = ?",
                new Object[]{pacienteId}, (rs, rowNum) -> new Medicamento(
                        rs.getInt("medicamento_id"),
                        rs.getString("medicamento"),
                        rs.getInt("paciente_id"),
                        rs.getString("paciente"),
                        rs.getString("tipo_medicamento")

                )
        );
    }

     @Override
    public int deleteMedicamento(int medicamentoId) {

        System.out.println("medicamentoId" + medicamentoId);
        return template.update(
                "delete from medicamento where medicamento_id = ? ",
                medicamentoId);
    }


}
