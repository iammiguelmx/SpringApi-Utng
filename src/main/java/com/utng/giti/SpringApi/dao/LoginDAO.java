package com.utng.giti.SpringApi.dao;

import com.utng.giti.SpringApi.model.Login;

import java.util.List;
import java.util.Optional;

public interface LoginDAO {

    List<Login> signIn(String nombre, String pass);
}
