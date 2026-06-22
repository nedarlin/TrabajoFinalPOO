/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Modelo.Paciente;

/**
 *
 * @author Neil
 */
public class DaoPaciente {

    private Connection con;

    public DaoPaciente(Connection con) {
        this.con = con;
    }

    public boolean registrarPaciente(Paciente p) {
        String sql = "INSERT INTO paciente (dni, nombres, apellidos, fecha_nacimiento, sexo, direccion, telefono, correo, tipo_sangre, alergias, fecha_registro, id_usuario) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, p.getDni());
            ps.setString(2, p.getNombres());
            ps.setString(3, p.getApellidos());
            ps.setString(4, p.getFechaNacimiento());
            ps.setString(5, p.getSexo());
            ps.setString(6, p.getDireccion());
            ps.setString(7, p.getTelefono());
            ps.setString(8, p.getCorreo());
            ps.setString(9, p.getTipoSangre());
            ps.setString(10, p.getAlergias());
            ps.setString(11, p.getFechaRegistro());
            ps.setInt(12, p.getIdUsuario());

            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
