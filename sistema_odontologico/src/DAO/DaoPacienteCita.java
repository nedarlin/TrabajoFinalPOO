/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import Modelo.PacienteCita;
/**
 *
 * @author Neil
 */
public class DaoPacienteCita {
    private Connection con;

    public DaoPacienteCita(Connection con) {
        this.con = con;
    }

    public List<PacienteCita> listarPacienteCita() {
        List<PacienteCita> lista = new ArrayList<>();
        String sql = "SELECT p.nombres, p.fecha_registro, c.motivo_consulta, c.estado_cita " +
                     "FROM paciente p INNER JOIN cita c ON p.id_paciente = c.id_paciente";

        try (PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                PacienteCita pc = new PacienteCita(
                    rs.getString("nombres"),
                    rs.getString("fecha_registro"),
                    rs.getString("motivo_consulta"),
                    rs.getString("estado_cita")
                );
                lista.add(pc);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
