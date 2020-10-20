package com.utng.giti.SpringApi.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Paciente {
    private  int pacienteId;
    private String nombre;
    private int edad;
    private double peso;
    private double estatura;
    private double imc;

    public Paciente(int pacienteId, String nombre, int edad, double peso, double estatura, double imc) {
        this.pacienteId = pacienteId;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
        this.imc = imc;
    }

    public int getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId(int pacienteId) {
        this.pacienteId = pacienteId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }
}
