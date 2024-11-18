package com.example.tp3_pruebasUnitarias;

import java.util.Date;

public class Evolucion {


    private long id;

    private String texto;

    private Date fecha;

    private Diagnostico diagnostico;

    Medico medico;

    public Evolucion() {
    }

    public Evolucion(long id, String texto, Date fecha, Diagnostico detalleDiagnostico,
                     Medico medico) {
        this.id = id;
        this.texto = texto;
        this.fecha = fecha;
        this.diagnostico = detalleDiagnostico;
        this.medico = medico;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Diagnostico getDetalleDiagnostico() {
        return diagnostico;
    }

    public void setDetalleDiagnostico(Diagnostico detalleDiagnostico) {
        this.diagnostico = detalleDiagnostico;
    }


    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

}
