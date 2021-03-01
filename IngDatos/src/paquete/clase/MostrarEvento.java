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
 * @author Juan Antony
 */
public class MostrarEvento {
    public ArrayList<Evento> ListEventoRUC(String RUC){
        ArrayList<Evento> evento = new ArrayList();
        try
        {
            Connection conn = DataBaseConnection.getConnection();  
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT E.CODIGO_EVENTO, P.CODIGO_PROYECTO, P.NOMBRE_PROYECTO, C.RUC, C.NOMBRE_EMPRESA, E.FECHA, E.DESCRIPCION\n" +
                                           "FROM EVENTO E, CLIENTE C, PROYECTO P\n" +
                                           "WHERE E.CODIGO_PROYECTO = P.CODIGO_PROYECTO\n" +
                                           "AND P.RUC = C.RUC\n" +
                                           "AND C.RUC = '" + RUC + "'");
            while(rs.next())
            {
                Evento e = new Evento();
                e.setCodigo_evento(rs.getString("CODIGO_EVENTO"));
                e.setCodigo_proyecto(rs.getString("CODIGO_PROYECTO"));
                e.setNombre_proyecto(rs.getString("NOMBRE_PROYECTO"));
                e.setNombre_empresa(rs.getString("NOMBRE_EMPRESA"));
                e.setRUC(rs.getString("RUC"));
                e.setFecha(rs.getString("FECHA"));
                e.setDescripcion(rs.getString("DESCRIPCION"));
                evento.add(e);
            }
        }
        catch(SQLException ex)
        {
            System.out.println(ex.getMessage());
            System.out.println("Error");
        }
        return evento;
    }
    
    public ArrayList<Evento> ListEventoCodigoP(String codigo_proyecto){
        ArrayList<Evento> evento = new ArrayList();
        try
        {
            Connection conn = DataBaseConnection.getConnection();  
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT E.CODIGO_EVENTO, P.CODIGO_PROYECTO, P.NOMBRE_PROYECTO, C.RUC, C.NOMBRE_EMPRESA, E.FECHA, E.DESCRIPCION\n" +
                                           "FROM EVENTO E, CLIENTE C, PROYECTO P\n" +
                                           "WHERE E.CODIGO_PROYECTO = P.CODIGO_PROYECTO\n" +
                                           "AND P.RUC = C.RUC\n" +
                                           "AND P.CODIGO_PROYECTO = '" + codigo_proyecto + "'");
            while(rs.next())
            {
                Evento e = new Evento();
                e.setCodigo_evento(rs.getString("CODIGO_EVENTO"));
                e.setCodigo_proyecto(rs.getString("CODIGO_PROYECTO"));
                e.setNombre_proyecto(rs.getString("NOMBRE_PROYECTO"));
                e.setNombre_empresa(rs.getString("NOMBRE_EMPRESA"));
                e.setRUC(rs.getString("RUC"));
                e.setFecha(rs.getString("FECHA"));
                e.setDescripcion(rs.getString("DESCRIPCION"));
                evento.add(e);
            }
        }
        catch(SQLException ex)
        {
            System.out.println(ex.getMessage());
            System.out.println("Error");
        }
        return evento;
    }
}
