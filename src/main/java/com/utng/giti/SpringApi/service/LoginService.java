package com.utng.giti.SpringApi.service;

import com.utng.giti.SpringApi.model.Login;
import com.utng.giti.SpringApi.model.Medicamento;
import com.utng.giti.SpringApi.model.Message;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface LoginService {

    List<Login> signIn(String nombre, String pass) throws IOException;
}
