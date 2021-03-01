/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.clase;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import paquete.conexion.DataBaseConnection;

/**
 *
 * @author USER
 */
public class RegistrarEvento 
{
    public void registrarEvento(Evento evento) {
        try {
             Connection conn = DataBaseConnection.getConnection();  
             System.out.println("me conecte");
             String llamado = "{call REGISTRAR_EVENTO(?,?,?,?)}";
             CallableStatement cst = conn.prepareCall(llamado);
             cst.setString(1, evento.getCodigo_evento());
             cst.setString(2, evento.getCodigo_proyecto());
             cst.setString(3, evento.getFecha());
             cst.setString(4, evento.getDescripcion());
             cst.executeUpdate();
             cst.close();
             conn.close();
             System.out.println("Registro exitoso");
             JOptionPane.showMessageDialog(null, "Registro exitoso");
         }
        catch(SQLException ex)
        {
            System.out.println(ex.getMessage());
            System.out.println("Error en el insert");
        }
    }
}
