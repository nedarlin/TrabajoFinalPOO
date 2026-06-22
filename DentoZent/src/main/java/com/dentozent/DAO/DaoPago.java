/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dentozent.DAO;
import com.dentozent.conexion.Conection; 
import com.dentozent.Modelo.PagoModelo;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class DaoPago {
    public List<PagoModelo> buscarPorNombre(String nombre) {
        List<PagoModelo> lista = new ArrayList<>();

        String sql = "SELECT p.nombres, pa.monto, pa.metodo_pago, pa.fecha_pago " +
                     "FROM pago pa INNER JOIN paciente p ON pa.id_paciente = p.id_paciente " +
                     "WHERE p.nombres LIKE ?";
                     
        try (Connection con = new Conection().getConnection(); // Ajuste según su método de conexión
             PreparedStatement ps = con.prepareStatement(sql)) {
             
            ps.setString(1, "%" + nombre + "%");
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                PagoModelo pago = new PagoModelo();
                pago.setNombrePaciente(rs.getString("nombres"));
                pago.setMonto(rs.getDouble("monto"));
                pago.setTipoPago(rs.getString("metodo_pago"));
                pago.setFecha(rs.getDate("fecha_pago"));
                lista.add(pago);
            }
        } catch (SQLException e) {
            System.err.println("Error en búsqueda: " + e.getMessage());
        }
        return lista;
    }
    
    
        public List<PagoModelo> listarTodos() {
        List<PagoModelo> lista = new ArrayList<>();
        String sql = "SELECT p.nombres, pa.monto, pa.metodo_pago, pa.fecha_pago " +
                     "FROM pago pa INNER JOIN paciente p ON pa.id_paciente = p.id_paciente";

        try (Connection con = new Conection().getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                PagoModelo pago = new PagoModelo();
                pago.setNombrePaciente(rs.getString("nombres"));
                pago.setMonto(rs.getDouble("monto"));
                pago.setTipoPago(rs.getString("metodo_pago"));
                pago.setFecha(rs.getDate("fecha_pago"));
                lista.add(pago);
            }
        } catch (SQLException e) {
            System.err.println("Error al listar pagos: " + e.getMessage());
        }
        return lista;
        }
    
}
