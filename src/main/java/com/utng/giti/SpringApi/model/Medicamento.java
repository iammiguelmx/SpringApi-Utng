package com.utng.giti.SpringApi.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Medicamento {

    private  int medicamentoId;
    private String nombre;
    private byte img_medicamento;
    private  int pacienteId;
    private int tipoId;
    private String nombrePaciente;
    private String tipoJarabe;


    public Medicamento(int medicamentoId, String nombre,
                       String nombrePaciente, String tipoJarabe //, byte img_medicamento
    ) {
        this.medicamentoId = medicamentoId;
        this.nombre = nombre;
        this.nombrePaciente = nombrePaciente;
        this.tipoJarabe = tipoJarabe;
       // this.img_medicamento = img_medicamento;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getTipoJarabe() {
        return tipoJarabe;
    }

    public void setTipoJarabe(String tipoJarabe) {
        this.tipoJarabe = tipoJarabe;
    }

    public int getMedicamentoId() {
        return medicamentoId;
    }

    public void setMedicamentoId(int medicamentoId) {
        this.medicamentoId = medicamentoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getImg_medicamento() {
        return img_medicamento;
    }

    public void setImg_medicamento(byte img_medicamento) {
        this.img_medicamento = img_medicamento;
    }

    public int getPacienteId() {
        return pacienteId;
    }

    public void setPacienteId(int pacienteId) {
        this.pacienteId = pacienteId;
    }

    public int getTipoId() {
        return tipoId;
    }

    public void setTipoId(int tipoId) {
        this.tipoId = tipoId;
    }
}
