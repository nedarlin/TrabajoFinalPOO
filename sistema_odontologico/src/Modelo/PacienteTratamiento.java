/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Neil
 */
public class PacienteTratamiento {

    private String nombrePaciente;
    private String alergias;
    private String nombreTratamiento;
    private String fechaInicio;

    public PacienteTratamiento() {
    }

    public PacienteTratamiento(String nombrePaciente, String alergias, String nombreTratamiento, String fechaInicio) {
        this.nombrePaciente = nombrePaciente;
        this.alergias = alergias;
        this.nombreTratamiento = nombreTratamiento;
        this.fechaInicio = fechaInicio;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public String getAlergias() {
        return alergias;
    }

    public String getNombreTratamiento() {
        return nombreTratamiento;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }
}
