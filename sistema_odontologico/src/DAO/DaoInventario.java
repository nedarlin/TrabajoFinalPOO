/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Conexion.Conection;
import Modelo.InventarioModelo;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class DaoInventario {
    public List<InventarioModelo> buscarPorNombre(String nombre) {
        List<InventarioModelo> lista = new ArrayList<>();
        String sql = "SELECT nombre_producto, cantidad, fecha_vencimiento, estado FROM inventario WHERE nombre_producto LIKE ?";
                     
        try (Connection con = new Conection().getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
             
            ps.setString(1, "%" + nombre + "%");
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                InventarioModelo inv = new InventarioModelo();
                inv.setNombreProducto(rs.getString("nombre_producto"));
                inv.setCantidad(rs.getInt("cantidad"));
                inv.setFechaVencimiento(rs.getDate("fecha_vencimiento"));
                inv.setEstado(rs.getString("estado"));
                lista.add(inv);
            }
        } catch (SQLException e) {
            System.err.println("Error en búsqueda de inventario: " + e.getMessage());
        }
        return lista;
    }
    
    public List<InventarioModelo> listarTodos() {
        List<InventarioModelo> lista = new ArrayList<>();
        String sql = "SELECT nombre_producto, cantidad, fecha_vencimiento, estado FROM inventario";

        try (Connection con = new Conection().getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                InventarioModelo inv = new InventarioModelo();
                inv.setNombreProducto(rs.getString("nombre_producto"));
                inv.setCantidad(rs.getInt("cantidad"));
                inv.setFechaVencimiento(rs.getDate("fecha_vencimiento"));
                inv.setEstado(rs.getString("estado"));
                lista.add(inv);
            }
        } catch (SQLException e) {
            System.err.println("Error al listar inventario: " + e.getMessage());
        }
        return lista;
    }
    
}
