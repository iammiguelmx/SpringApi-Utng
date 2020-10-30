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
import java.util.Optional;

@Repository
public class MedicamentoDAOImpl implements MedicamentoDAO {

    @Autowired
    private JdbcTemplate template;

    @Override
    public Boolean addMedicamento(String nombreMedicamenteo, int pacienteId,int tipoId, MultipartFile file) throws IOException {

        byte[] fileBytes = file.getBytes();
        boolean res = true;
        String sql = "INSERT INTO medicamento(nombre,img_medicamento,paciente_id,tipo_id) VALUES(?,?,?,?)";
        //try{
        return template.execute(sql, new PreparedStatementCallback<Boolean>() {
            @Override
            public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
                ps.setString(1, nombreMedicamenteo);
                ps.setBytes(2, fileBytes);
                ps.setInt(3, pacienteId);
                ps.setInt(4, tipoId);

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
    public List<Medicamento> getMedicamentos(int pacienteId) {
        return template.query("SELECT pa.paciente_id, " +
                        "pa.nombre AS paciente, me.nombre AS medicamento," +
                        "ti.nombre AS tipo_medicamento  " +
                "FROM medicamento AS me JOIN paciente AS pa USING (paciente_id)  " +
                "JOIN tipo AS ti USING(tipo_id) WHERE me.paciente_id = ?",
                new Object[]{pacienteId}, (rs, rowNum) -> new Medicamento(
                        rs.getInt("paciente_id"),
                        rs.getString("paciente"),
                        rs.getString("medicamento"),
                        rs.getString("tipo_medicamento")//,
                        //rs.getByte("imagen")
                )
                );
    }


}
