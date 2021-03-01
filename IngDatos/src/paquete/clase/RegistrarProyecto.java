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
public class RegistrarProyecto {
    
     public void registrarProyecto(Proyecto proyecto) {
         try {
             Connection conn = DataBaseConnection.getConnection();  
             System.out.println("me conecte");
             String llamado = "{call REGISTRAR_PROYECTO(?,?,?,?,?,?,?,?)}";
             CallableStatement cst = conn.prepareCall(llamado);
             cst.setString(1, proyecto.getCodigo_proyecto());
             cst.setString(2, proyecto.getNombre_proyecto());
             cst.setString(3, proyecto.getRUC());
             cst.setString(4, proyecto.getEstado());
             cst.setString(5, proyecto.getFecha_inicio());
             cst.setString(6, proyecto.getFecha_fin());
             cst.setInt(7, proyecto.getMonto());
             cst.setString(8, proyecto.getPrototipo());
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
            JOptionPane.showMessageDialog(null, "El codigo proyecto ya existe o el RUC no e ha registrado");
        }      
    }
}
