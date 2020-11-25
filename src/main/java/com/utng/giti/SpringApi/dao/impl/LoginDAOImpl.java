package com.utng.giti.SpringApi.dao.impl;

import com.utng.giti.SpringApi.dao.LoginDAO;
import com.utng.giti.SpringApi.model.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class LoginDAOImpl implements LoginDAO {

    @Autowired
    private JdbcTemplate template;

    @Override
    public List<Login> signIn(String nombre, String pass) {
        return template.query(
                "select nombre, pass from paciente where nombre = ? and pass = ?",
                new Object[]{nombre, pass},
                (rs, rowNum) ->
                        new Login(
                                rs.getString("nombre"),
                                rs.getString("pass")
                        )
        );
    }
}
