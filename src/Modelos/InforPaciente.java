package Modelos;
public abstract class InforPaciente {
    //atributos
    private String nombres;
    private String apellidos;
    private String correo;
    private String celular;
    private String sede;
    //constructor
    public InforPaciente(String nombres, String apellidos, String correo, String celular, String sede) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.celular = celular;
        this.sede = sede;
    }
    //metodos getter y setter
    public String getNombres()                 {return nombres;}
    public void setNombres(String nombres)     {this.nombres = nombres;}
    public String getApellidos()               {return apellidos;}
    public void setApellidos(String apellidos) {this.apellidos = apellidos;}
    public String getCorreo()                  {return correo;}
    public void setCorreo(String correo)       {this.correo = correo;}
    public String getCelular()                 {return celular;}
    public void setCelular(String celular)     {this.celular = celular;}
    public String getSede()                    {return sede;}
    public void setSede(String sede)           {this.sede = sede;}
    //metodos no abstractos
    public abstract double PrecioBase();
    public abstract double Descuentos();
    //metodos no abstractos
    public double PrecioFinal(){ return PrecioBase()- Descuentos();}
    public String MostrarAtributos(){
    return "\nNombres                  : "+nombres+
           "\nApellidos                : "+apellidos+
           "\nCorreo                   : "+correo+
           "\nCelular                  : "+celular+
           "\nSede                     : "+sede;
    }
    public String MostrarCalculos(){
    return "\nPrecioBase               : "+PrecioBase()+
           "\nDescuento                : "+Descuentos()+
           "\nPrecio Total             : "+PrecioFinal()+
           "\n-----------------------------------------------------------------";
    }
}
