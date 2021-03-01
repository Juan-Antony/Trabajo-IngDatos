/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class DataBaseConnection {
    public static Connection getConnection(){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@129.151.103.165:1521/pdbulima.subnetpublica01.vncriccio.oraclevcn.com";
            String usuario = "ALUMNO8";
            String password = "PeruLima__2020";
            
            Connection conn = DriverManager.getConnection(url, usuario, password);
            
            return conn;
        }
        catch(SQLException ex)
        {
            System.out.println(ex.getMessage());
        }
        catch(ClassNotFoundException ex)
        {
            Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE,null, ex);
        }
        return null;
    }

}
