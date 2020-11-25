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
    private String tipoMedic;
    private String nombrePaciente;


    public Medicamento(int medicamentoId, String nombre, /*byte img_medicamento,*/ int pacienteId, String tipoMedic,
                       String nombrePaciente) {
        this.medicamentoId = medicamentoId;
        this.nombre = nombre;
        //this.img_medicamento = img_medicamento;
        this.pacienteId = pacienteId;
        this.tipoMedic = tipoMedic;
        this.nombrePaciente = nombrePaciente;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
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

    public String getTipoMedic() {
        return tipoMedic;
    }

    public void setTipoMedic(String tipoMedic) {
        this.tipoMedic = tipoMedic;
    }
}
