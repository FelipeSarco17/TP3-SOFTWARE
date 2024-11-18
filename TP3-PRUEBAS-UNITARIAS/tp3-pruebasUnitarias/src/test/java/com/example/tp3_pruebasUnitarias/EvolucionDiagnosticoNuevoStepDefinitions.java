package com.example.tp3_pruebasUnitarias;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.BeforeEach;

import java.sql.Date;
import java.util.List;

import static org.mockito.Mockito.*;

public class EvolucionDiagnosticoNuevoStepDefinitions {

    private Medico medico;
    private Paciente paciente;
    private List<Diagnostico> diagnosticos;
    private Evolucion evolucion;
    private SistemaClinica sistemaClinica;


    @Given("el medico {string} ha iniciado sesion")
    public void elMedicoHaIniciadoSesion(String nombreMedico) {

        medico = new Medico(123,4234,new Date(1990),"sarco@gmail.com",123123,"Felipe","Sarco","bascary","1234");
    }

    @And("el médico ha buscado la historia clínica del paciente con CUIL\\/Pasaporte {string}")
    public void elMédicoHaBuscadoLaHistoriaClínicaDelPacienteConCUILPasaporte(String arg0) {
    }

    @Given("el medico selecciono el {string}")
    public void elMedicoSeleccionoEl(String arg0) {
    }

    @When("el medico escribe la evolucion  {string}")
    public void elMedicoEscribeLaEvolucion(String arg0) {
    }

    @Then("se guarda la nueva evolucion")
    public void seGuardaLaNuevaEvolucion() {
    }


}
