/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Neil
 */
public class PacienteCita {

    private String nombrePaciente;
    private String fechaRegistro;
    private String motivo;
    private String estado;
    
    public PacienteCita(){}
    
    public PacienteCita(String nombrePaciente, String fechaRegistro, String motivo, String estado) {
        this.nombrePaciente = nombrePaciente;
        this.fechaRegistro = fechaRegistro;
        this.motivo = motivo;
        this.estado = estado;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
