package com.utng.giti.SpringApi.service.impl;

import com.utng.giti.SpringApi.dao.LoginDAO;
import com.utng.giti.SpringApi.dao.PacienteDAO;
import com.utng.giti.SpringApi.model.Login;
import com.utng.giti.SpringApi.model.Message;
import com.utng.giti.SpringApi.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginDAO service;

    @Override
    public List<Login> signIn(String nombre, String pass) throws IOException {
        return service.signIn(nombre, pass);
    }
}
