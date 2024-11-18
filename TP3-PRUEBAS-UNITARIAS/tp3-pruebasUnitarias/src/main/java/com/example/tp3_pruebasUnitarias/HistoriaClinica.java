package com.example.tp3_pruebasUnitarias;

import java.util.List;
import java.util.Date;

public class HistoriaClinica {


    private long id;

    private Date fechaCreacion;

    private Paciente paciente;

    private List<Diagnostico> diagnosticos;

    public HistoriaClinica() {
    }

    public HistoriaClinica(Date fechaCreacion, Paciente paciente) {
        this.fechaCreacion = fechaCreacion;
        this.paciente = paciente;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public List<Diagnostico> getDetalles() {
        return diagnosticos;
    }

    public void setDetalles(List<Diagnostico> diagnosticos) {
        this.diagnosticos = diagnosticos;
    }


}
