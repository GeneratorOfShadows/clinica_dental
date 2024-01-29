/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author aless
 */
public abstract class Pacientes {
    public String codigo;
    public String nombres;
    public String apellidos;
    public String correo;
    public String celular;
    public String especialidad;
    public String sede;
    public String fecha;
    public String hora;
    public String comentarios;

    public Pacientes() {
    }
    
    public Pacientes(String codigo, String nombres, String apellidos, String correo, String celular, String especialidad, String sede, String fecha, String hora, String comentarios) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.celular = celular;
        this.especialidad = especialidad;
        this.sede = sede;
        this.fecha = fecha;
        this.hora = hora;
        this.comentarios = comentarios;
    }

    public String getCodigo() {        return codigo;    }
    public void setCodigo(String codigo) {        this.codigo = codigo;    }
    public String getNombres() {        return nombres;    }
    public void setNombres(String nombres) {        this.nombres = nombres;    }
    public String getApellidos() {        return apellidos;    }
    public void setApellidos(String apellidos) {        this.apellidos = apellidos;    }
    public String getCorreo() {        return correo;    }
    public void setCorreo(String correo) {        this.correo = correo;    }
    public String getCelular() {        return celular;    }
    public void setCelular(String celular) {        this.celular = celular;    }
    public String getEspecialidad() {        return especialidad;    }
    public void setEspecialidad(String especialidad) {        this.especialidad = especialidad;    }
    public String getSede() {        return sede;    }
    public void setSede(String sede) {        this.sede = sede;    }
    public String getFecha() {        return fecha;    }
    public void setFecha(String fecha) {        this.fecha = fecha;    }
    public String getHora() {        return hora;    }
    public void setHora(String hora) {        this.hora = hora;    }
    public String getComentarios() {        return comentarios;    }
    public void setComentarios(String comentarios) {    this.comentarios = comentarios;    }
    
    //EN ESTE CASO NO SE SABE EL MALESTAR COMPLETO DEL PACIENTE YA QUE AUN NO ES REVISADO POR EL DOCTOR, PERO DEPENDE DE LA
    // ESPECIALIDAD SE APLICARA UN DESCUENTO EN ESPECIFICO
    abstract double Monto();
    
    
}
