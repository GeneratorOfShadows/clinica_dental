package DAO;

import java.sql.*;
import javax.swing.JOptionPane;
public class conexion_medico {
    //atributo
    Connection con = null;
    //constructor
    public Connection conexion_medico(){
        try{
            //1.PERMITE DEFINIR EL DRIVER DE CONEXION
            Class.forName("com.mysql.cj.jdbc.Driver");
            //la llamada al driver manage para que realice la conexion con ruta, usuario y contraseña. Retoma un conexion(Conection)
            con = DriverManager.getConnection("jdbc:mysql://localhost:3308/forddental","root","");                        
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Error en la conexion..."+ex);
        
        }
        return con;
    }
    
}