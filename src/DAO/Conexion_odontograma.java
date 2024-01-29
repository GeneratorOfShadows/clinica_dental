/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexion_odontograma {
    private Connection conexion=null ;
    
    public Connection getConexion()
    {
       return conexion;
    }
    public boolean crearConexion()
    {
       try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/forddental","root","");
          if(conexion!=null){
              return true;
          }
       }
       catch (SQLException ex) {
          System.out.println("error en conexion: "+ex);
       }
       catch (ClassNotFoundException ex) {
          System.out.println(ex);
       }
       return false;
    }
    
    public boolean ejecutarSQL(String sql)
    {
       try {
           PreparedStatement sentencia = conexion.prepareStatement(sql);
          sentencia.execute(sql);
          return true;
       } catch (SQLException ex) {
            return false;
       }
    }
    public ResultSet ejecutarSQLSelect(String sql)
    {
       ResultSet resultado;
       try {
          PreparedStatement sentencia = conexion.prepareStatement(sql);
          resultado = sentencia.executeQuery();
          return resultado;
       } catch (SQLException ex) {
          System.err.println("Error "+ex);
          return null;
       }
    }
        
}


