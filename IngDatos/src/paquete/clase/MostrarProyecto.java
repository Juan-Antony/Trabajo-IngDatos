/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.clase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import paquete.conexion.DataBaseConnection;

/**
 *
 * @author USER
 */
public class MostrarProyecto 
{
    public ArrayList<Proyecto> ListProyectoNombre(String nombre_proyecto){
        ArrayList<Proyecto> proyecto = new ArrayList();
        try
        {
            
            Connection conn = DataBaseConnection.getConnection();  
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT P.CODIGO_PROYECTO, P.NOMBRE_PROYECTO, C.RUC, P.ESTADO, P.FECHA_INICIO, P.FECHA_FIN, P.MONTO, P.PROTOTIPO\n" +
                                           "FROM PROYECTO P, CLIENTE C\n" +
                                           "WHERE P.RUC = C.RUC\n" +
                                           "AND P.NOMBRE_PROYECTO = '" + nombre_proyecto + "'");
            
            while(rs.next())
            {
                Proyecto p = new Proyecto();
                p.setCodigo_proyecto(rs.getString("CODIGO_PROYECTO"));
                p.setNombre_proyecto(rs.getString("NOMBRE_PROYECTO"));
                p.setRUC(rs.getString("RUC"));
                p.setEstado(rs.getString("ESTADO"));
                p.setFecha_inicio(rs.getString("FECHA_INICIO"));
                p.setFecha_fin(rs.getString("FECHA_FIN"));
                p.setMonto(rs.getInt("MONTO"));
                p.setPrototipo(rs.getString("PROTOTIPO"));
                proyecto.add(p);
            }
        }
        catch(SQLException ex)
        {
            System.out.println(ex.getMessage());
            System.out.println("Error");
        }
        return proyecto;
    }
    
    public ArrayList<Proyecto> ListProyectoRUC(String RUC){
        ArrayList<Proyecto> proyecto = new ArrayList();
        try
        {
            Connection conn = DataBaseConnection.getConnection();  
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT P.CODIGO_PROYECTO, P.NOMBRE_PROYECTO, C.RUC, P.ESTADO, P.FECHA_INICIO, P.FECHA_FIN, P.MONTO, P.PROTOTIPO\n" +
                                           "FROM PROYECTO P, CLIENTE C\n" +
                                           "WHERE P.RUC = C.RUC\n" +
                                           "AND C.RUC = '" + RUC + "'");
            while(rs.next())
            {
                Proyecto p = new Proyecto();
                p.setCodigo_proyecto(rs.getString("CODIGO_PROYECTO"));
                p.setNombre_proyecto(rs.getString("NOMBRE_PROYECTO"));
                p.setRUC(rs.getString("RUC"));
                p.setEstado(rs.getString("ESTADO"));
                p.setFecha_inicio(rs.getString("FECHA_INICIO"));
                p.setFecha_fin(rs.getString("FECHA_FIN"));
                p.setMonto(rs.getInt("MONTO"));
                p.setPrototipo(rs.getString("PROTOTIPO"));
                proyecto.add(p);
            }
        }
        catch(SQLException ex)
        {
            System.out.println(ex.getMessage());
            System.out.println("Error");
        }
        return proyecto;
    }
}
