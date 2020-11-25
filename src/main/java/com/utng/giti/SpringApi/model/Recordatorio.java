package com.utng.giti.SpringApi.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Recordatorio {

    private int recordatorioId;
    private String nombreRec;
    private String fechaIni;
    private String fechaFin;
    private int tiempo;
    private String medicamento;
    private int dosis;
    private boolean tomado;
    private int medicamentoId;
    private String tipoMedicamento;


    public Recordatorio(int recordatorioId, String nombreRec,String medicamento, String tipoMedicamento,
                        String fechaIni, String fechaFin, int tiempo,
                         int dosis, boolean tomado) {
        this.recordatorioId = recordatorioId;
        this.nombreRec = nombreRec;
        this.medicamento = medicamento;
        this.tipoMedicamento = tipoMedicamento;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.tiempo = tiempo;
        this.dosis = dosis;
        this.tomado = tomado;
    }

    public String getNombreRec() {
        return nombreRec;
    }

    public void setNombreRec(String nombreRec) {
        this.nombreRec = nombreRec;
    }

    public String getTipoMedicamento() {
        return tipoMedicamento;
    }

    public void setTipoMedicamento(String tipoMedicamento) {
        this.tipoMedicamento = tipoMedicamento;
    }

    public int getMedicamentoId() {
        return medicamentoId;
    }

    public void setMedicamentoId(int medicamentoId) {
        this.medicamentoId = medicamentoId;
    }

    public int getRecordatorioId() {
        return recordatorioId;
    }

    public void setRecordatorioId(int recordatorioId) {
        this.recordatorioId = recordatorioId;
    }

    public String getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(String fechaIni) {
        this.fechaIni = fechaIni;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public int getDosis() {
        return dosis;
    }

    public void setDosis(int dosis) {
        this.dosis = dosis;
    }

    public boolean isTomado() {
        return tomado;
    }

    public void setTomado(boolean tomado) {
        this.tomado = tomado;
    }
}
