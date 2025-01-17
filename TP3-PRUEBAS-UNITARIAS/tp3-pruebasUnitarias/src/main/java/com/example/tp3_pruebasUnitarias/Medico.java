package com.example.tp3_pruebasUnitarias;


import java.sql.Date;

public class Medico extends Usuario{


    private int matricula;

    private Especialidad especialidad;

    public Medico(int cuil, int dni, Date fechaNacimiento, String email, int telefono, String nombre, String apellido,
                  Direccion direccion, int numeroAfiliado, ObraSocial obraSocial, HistoriaClinica historiaClinica, String contrasenia, int matricula, Especialidad especialidad) {
        super(cuil, dni, fechaNacimiento, email, telefono, nombre, apellido, direccion, contrasenia);
        this.matricula = matricula;
        this.especialidad = especialidad;
    }

    public Medico(int cuil, int dni, Date fechaNacimiento, String email, int telefono, String nombre, String apellido,
                  Direccion direccion, String contrasenia) {
        super(cuil, dni, fechaNacimiento, email, telefono, nombre, apellido, direccion, contrasenia);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
}