
package Modelos;

import javax.swing.JTable;

public class Doctor implements Impresiones_Doctor{

    
    private int id_user_medico;
    private String usuario_medico;
    private String contraseña_medico;
    private String nombres_medico;
    private String apellidos_medico;
    private String sede;
    private String celular_medico;
    private String especialidad_medico;
    private String correo_medico;
    private String fecha_creacion;
    private int id_tipo;    
     

    public int getId_user_medico() {
        return id_user_medico;
    }

    public void setId_user_medico(int id_user_medico) {
        this.id_user_medico = id_user_medico;
    }

    public String getUsuario_medico() {
        return usuario_medico;
    }

    public void setUsuario_medico(String usuario_medico) {
        this.usuario_medico = usuario_medico;
    }

    public String getContraseña_medico() {
        return contraseña_medico;
    }

    public void setContraseña_medico(String contraseña_medico) {
        this.contraseña_medico = contraseña_medico;
    }

    public String getNombres_medico() {
        return nombres_medico;
    }

    public void setNombres_medico(String nombres_medico) {
        this.nombres_medico = nombres_medico;
    }

    public String getApellidos_medico() {
        return apellidos_medico;
    }

    public void setApellidos_medico(String apellidos_medico) {
        this.apellidos_medico = apellidos_medico;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getCelular_medico() {
        return celular_medico;
    }

    public void setCelular_medico(String celular_medico) {
        this.celular_medico = celular_medico;
    }

    public String getEspecialidad_medico() {
        return especialidad_medico;
    }

    public void setEspecialidad_medico(String especialidad_medico) {
        this.especialidad_medico = especialidad_medico;
    }

    public String getCorreo_medico() {
        return correo_medico;
    }

    public void setCorreo_medico(String correo_medico) {
        this.correo_medico = correo_medico;
    }

    public String getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(String fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public int getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(int id_tipo) {
        this.id_tipo = id_tipo;
    }
    
    public Object[] RegistroDoc(int num) {
       Object Registro[] = {id_user_medico,usuario_medico,contraseña_medico,nombres_medico,apellidos_medico,sede,celular_medico,
                            especialidad_medico,correo_medico,fecha_creacion,fecha_creacion};   
       return Registro;
    }   
   

    @Override
    public void Imprimir(JTable dtm) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
