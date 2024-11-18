Feature: Evolución simple con diagnóstico nuevo

  Agregamos la evolución de un paciente con diagnostivo no utilizado previamente en la historia clinica
  y se escribe la misma en texto simple.

  Background: El médico ha iniciado sesión
    Given el medico "Sarco Felipe" ha iniciado sesion
    And el médico ha buscado la historia clínica del paciente con CUIL/Pasaporte "44658630"

  Scenario:
    Given el medico selecciono el "Dengue"
    When el medico escribe la evolucion  "El paciente posee sintomas consistentes con Dengue (fiebre, hemorragias, etc)"
    Then se guarda la nueva evolucion


  Scenario:
    Given el medico selecciono el "COVID"
    When el medico escribe la evolucion  "El paciente posee sintomas consistentes con COVID (fiebre, dolores corporales, vomito, etc)"
    Then se guarda la nueva evolucion





