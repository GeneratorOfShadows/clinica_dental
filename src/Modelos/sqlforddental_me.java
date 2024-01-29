/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import DAO.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aless
 */
public class sqlforddental_me extends Conexion{
    public boolean registrar_me(forddental_medico usrme){
        PreparedStatement ps = null;
        Connection con=getConexion();
        String sql = 
                "INSERT INTO usuario_medico (usuario_medico, contraseña_medico, nombres_medico, apellidos_medico, sede, celular_medico, especialidad_medico, correo_medico , id_tipo) VALUES(?,?,?,?,?,?,?,?,,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usrme.getUsuario_medico());
            ps.setString(2, usrme.getContraseña_medico());
            ps.setString(3, usrme.getNombres_medico());
            ps.setString(4, usrme.getApellidos_medico());
            ps.setString(5, usrme.getSede());
            ps.setString(6, usrme.getCelular_medico());
            ps.setString(7, usrme.getEspecialidad_medico());
            ps.setString(8, usrme.getCorreo_medico());
            ps.setInt(9, usrme.getId_tipo());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(sqlforddental_pa.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
