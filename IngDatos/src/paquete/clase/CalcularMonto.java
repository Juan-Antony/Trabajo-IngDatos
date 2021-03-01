/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.clase;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.OracleTypes;
import paquete.conexion.DataBaseConnection;

/**
 *
 * @author Juan Antony
 */
public class CalcularMonto {
    private int monto_t;
    
    public int CalcularMonto(String ruc)
    {
        try{
        Connection conn = DataBaseConnection.getConnection();  
        String llamado = "{? = call CALCULAR_MONTO_TOTAL(?)}";
        CallableStatement cst = conn.prepareCall(llamado);
        cst.setString(2, ruc);
        cst.registerOutParameter(1, OracleTypes.NUMBER);
        cst.execute();
        monto_t = ((OracleCallableStatement)cst).getInt(1);
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
            System.out.println("Error");
        }
        return monto_t;
    }
}
