/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Modelo.PacienteTratamiento;

/**
 *
 * @author Neil
 */
public class DaoPacienteTratamiento {

    private Connection con;

    public DaoPacienteTratamiento(Connection con) {
        this.con = con;
    }

    public List<PacienteTratamiento> listarPacienteTratamiento() {
        List<PacienteTratamiento> lista = new ArrayList<>();
        String sql = "SELECT p.nombres, p.alergias, t.nombre_tratamiento, t.fecha_inicio "
                + "FROM paciente p "
                + "INNER JOIN cita c ON p.id_paciente = c.id_paciente "
                + "INNER JOIN tratamiento t ON c.id_cita = t.id_cita";

        try (PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                PacienteTratamiento pt = new PacienteTratamiento(
                        rs.getString("nombres"),
                        rs.getString("alergias"),
                        rs.getString("nombre_tratamiento"),
                        rs.getString("fecha_inicio")
                );
                lista.add(pt);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
