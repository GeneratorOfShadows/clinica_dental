/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import DAO.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aless
 */
public class sqlforddental_pa extends Conexion{ //el id_user_paciente es su DNI 
    public boolean registrar(forddental usr){
        PreparedStatement ps = null;
        Connection con=getConexion();
        String sql = "INSERT INTO usuario_paciente (usuario, contraseña, nombres, apellidos, correo, telefono, id_tipo) VALUES(?,?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getUsuario());
            ps.setString(2, usr.getContraseña());
            ps.setString(3, usr.getNombres());
            ps.setString(4, usr.getApellidos());
            ps.setString(5, usr.getCorreo());
            ps.setString(6, usr.getTelefono());
            ps.setInt(7, usr.getId_tipo());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(sqlforddental_pa.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    public boolean LOGIN(forddental usr){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con=getConexion();
        String sql = "SELECT id_user_paciente, usuario, contraseña, nombres, apellidos, correo, telefono, id_tipo FROM usuario_paciente where usuario = ?";//correcto
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getUsuario());
            rs = ps.executeQuery();
            if(rs.next()){
                if(usr.getContraseña().equals(rs.getString(3))){
                    String sqlUp = "UPDATE usuario_paciente SET fecha_creacion = ? WHERE id_user_paciente=? ";
                    usr.setId_user_paciente(rs.getInt(1));
                    usr.setNombres(rs.getString(4));
                    usr.setId_tipo(rs.getInt(8));
                    return true;
                }else{
                    return false;
                }                
            }
            return false;
            
        } catch (SQLException ex) {
            Logger.getLogger(sqlforddental_pa.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    
    public int UsuarioExistente(String usr){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con=getConexion();
        String sql = "SELECT count(id_user_paciente) FROM usuario_paciente where usuario = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr);
            rs = ps.executeQuery();
            if(rs.next()){
                return rs.getInt(1);
            }
            return 1;
            
        } catch (SQLException ex) {
            Logger.getLogger(sqlforddental_pa.class.getName()).log(Level.SEVERE, null, ex);
            return 1;
        }
        
    }
}
