package com.utng.giti.SpringApi.controller;

import com.utng.giti.SpringApi.model.Login;
import com.utng.giti.SpringApi.model.Message;
import com.utng.giti.SpringApi.model.Paciente;
import com.utng.giti.SpringApi.service.LoginService;
import com.utng.giti.SpringApi.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/recordatorios")
public class LoginController {

    @Autowired
    private LoginService service;

    @PostMapping("/signIn")
    public Message login(@PathParam("nombre") String nombre, @PathParam("pass") String pass) throws IOException {
        List<Login> resp = service.signIn(nombre, pass);
        Message message = new Message();
        if (resp.isEmpty() || resp == null){
                message.setCode("0");
                message.setMessage("Error");
                message.setDescription("Los Datos son incorrectos");
            } else {
                message.setCode("1");
                message.setMessage("Exito");
                message.setDescription("Los Datos son correctos");
            }
        return message;
    }
}
