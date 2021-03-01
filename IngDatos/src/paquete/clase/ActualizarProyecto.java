/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.clase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import paquete.conexion.DataBaseConnection;

/**
 *
 * @author Juan Antony
 */
public class ActualizarProyecto {
    
    public void UpdateProyecto(Proyecto proyecto) {

        try {
            Connection conn = DataBaseConnection.getConnection();
            PreparedStatement pst = conn.prepareStatement(" UPDATE  PROYECTO SET "
                    + " NOMBRE_PROYECTO=?, RUC=?, ESTADO=?, FECHA_INICIO=?, FECHA_FIN=?, MONTO=?, PROTOTIPO=? WHERE CODIGO_PROYECTO=? ");
            pst.setString(1, proyecto.getNombre_proyecto());
            pst.setString(2, proyecto.getRUC());
            pst.setString(3, proyecto.getEstado());
            pst.setString(4, proyecto.getFecha_inicio());
            pst.setString(5, proyecto.getFecha_fin());
            pst.setInt(6, proyecto.getMonto());
            pst.setString(7, proyecto.getPrototipo());
            pst.setString(8, proyecto.getCodigo_proyecto());
           
            pst.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en actualizar datos");
        }

    }
}
