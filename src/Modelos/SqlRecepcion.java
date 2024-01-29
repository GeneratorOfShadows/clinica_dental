package Modelos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import DAO.*;
public class SqlRecepcion extends Conexion{
    public boolean registrar_rcp(Recepcion rcp) throws SQLException{
        PreparedStatement ps=null;
        Connection con= getConexion();
        
        String sql="INSERT INTO usuario_recepcion (usuario_recepcion, contraseña_recepcion, nombres_recepcion, apellidos_recepcion, sede_recepcion, celular_recepcion, correo_recepcion, id_tipo) VALUES(?,?,?,?,?,?,?,?)";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, rcp.getUsuario_rcp());
            ps.setString(2, rcp.getContraseña_rcp());
            ps.setString(3, rcp.getNombres_rcp());
            ps.setString(4, rcp.getApellidos_rcp());
            ps.setString(5, rcp.getSede_rcp());
            ps.setString(6, rcp.getCelular_rcp());
            ps.setString(7, rcp.getCorreo_rcp());
            ps.setInt(8, rcp.getId_tipo_rcp());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(sqlforddental_pa.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
     public int existeRecepcion(String rcp) throws SQLException{
        PreparedStatement ps=null;
        ResultSet rs= null;
        Connection con= getConexion();
        
        String sql= "SELECT count(id_user_recepcion) FROM usuario_recepcion where usuario_recepcion = ?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1,rcp);
            rs=ps.executeQuery();
            
            if(rs.next()){
                return rs.getInt(1);
            }
            return 1;
        } catch (SQLException ex) {
            Logger.getLogger(sqlforddental_pa.class.getName()).log(Level.SEVERE, null, ex);
            return 1;
        }
    }
    public boolean loginRecepcion(Recepcion rcp) throws SQLException{
        PreparedStatement ps=null;
        ResultSet rs= null;
        Connection con= getConexion();
        
        String sql= "SELECT id_user_recepcion, usuario_recepcion, contraseña_recepcion, nombres_recepcion, apellidos_recepcion, celular_recepcion, correo_recepcion, id_tipo FROM usuario_recepcion where usuario_recepcion = ?";;
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1,rcp.getUsuario_rcp());
            rs=ps.executeQuery();
            
            if(rs.next()){
                if(rcp.getContraseña_rcp().equals(rs.getString(3))){
                    String sqlupdate = "UPDATE usuario_recepcion SET fecha_creacion = ? WHERE id_user_recepcion=? ";
                    
                    ps= con.prepareStatement(sqlupdate);
                    ps.setString(1, rcp.getFecha_rcp());
                    ps.setInt(2, rs.getInt(1));
                    ps.execute();
                    
                    rcp.setId_rcp(rs.getInt(1));
                    rcp.setNombres_rcp(rs.getString(4));
                    rcp.setId_tipo_rcp(rs.getInt(8));
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
}
