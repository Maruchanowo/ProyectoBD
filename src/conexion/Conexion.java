/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author elena
 */
public class Conexion {
    public Connection Conectar(){
        Connection conect=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
               conect = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/supermercado?characterEncoding=latin1","root","conejita1");
            }catch (Exception e){
                
        }
        return conect;
    }
}
