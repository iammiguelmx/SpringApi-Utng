package com.utng.giti.SpringApi.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Login {

    private String pass;
    private String nombrePaciente;

    public Login(String pass, String nombrePaciente) {
        this.pass = pass;
        this.nombrePaciente = nombrePaciente;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }
}
