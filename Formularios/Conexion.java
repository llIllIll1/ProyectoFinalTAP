/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author misae
 */
public class Conexion {
    public static  Connection getConexion()
    {
        
        String url = "jdbc:sqlserver://localhost:1433;"
                + "database=VentaDeComics;"
                + "user=sa;"
                + "password=zambrano13;";
        try
        {
            Connection con = DriverManager.getConnection(url);
            return con;
        }
        catch(SQLException e)
                {
                    System.out.println("Error:" + e.getMessage());
                    return null;
                }   
            
        }
    }
    
            

