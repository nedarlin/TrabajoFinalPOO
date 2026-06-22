/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Neil
 */
public class Paciente {

    private int idPaciente;
    private String dni;
    private String nombres;
    private String apellidos;
    private String fechaNacimiento;
    private String sexo;
    private String direccion;
    private String telefono;
    private String correo;
    private String tipoSangre;
    private String alergias;
    private String fechaRegistro;
    private int idUsuario;

    public Paciente() {
    }

    public Paciente(String dni, String nombres, String apellidos, String fechaNacimiento, String sexo,
            String direccion, String telefono, String correo, String tipoSangre, String alergias,
            String fechaRegistro, int idUsuario) {
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.tipoSangre = tipoSangre;
        this.alergias = alergias;
        this.fechaRegistro = fechaRegistro;
        this.idUsuario = idUsuario;
    }

    public String getDni() {
        return dni;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public String getAlergias() {
        return alergias;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public int getIdUsuario() {
        return idUsuario;
    }
}
