/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;
import javax.swing.table.DefaultTableModel;

public class PacienteConvenio extends Pacientes implements Descuento,Impresion,ORTODONTOPEDIATRIA{

    public static int getCont() {        return cont;    }
    public static void setCont(int aCont) {        cont = aCont;    }
    
    private String descripcion;
    private static int cont=0;
    
    public PacienteConvenio() {        cont++;    }
    public PacienteConvenio(String descripcion, String codigo, String nombres, String apellidos, String correo, String celular, String especialidad, String sede, String fecha, String hora, String comentarios) {
        super(codigo, nombres, apellidos, correo, celular, especialidad, sede, fecha, hora, comentarios);
        this.descripcion = descripcion;
        cont++;
    }
    
    public double Descuento(){
        switch(especialidad){
            case "ODONTOLOGIA INTEGRAL": return ODONTOLOGIA_INTEGRAL;
            case "RADIOLOGIA": return RADIOLOGIA;
            case "ODONTOPEDIATRIA": return ODONTOPEDIATRIA;
            case "PERIODONCIA": return PERIODONCIA;
            case "CIRUGIA": return CIRUGIA;
            case "ENDODONCIA": return ENDODONCIA;
            case "ODONTOLOGIA ESTETICA": return ODONTOLOGIA_ESTETICA;
            case "REHABILITACION ORAL": return REHABILITACION_ORAL;
            case "ORTODONCIA": return ORTODONCIA;            
            default: return 0;
        }
    }

    @Override
    public void Imprimir(DefaultTableModel dtm) { //tabla
        Object[] registro={cont,super.getCodigo(),super.getNombres(),super.getApellidos(),super.getCorreo(),super.getCelular(),especialidad,super.getSede(),super.getHora(),super.getFecha(),super.getComentarios()};
        dtm.addRow(registro);
        
    }

    public String getDescripcion() {        return descripcion;    }
    public void setDescripcion(String descripcion) {        this.descripcion = descripcion;    }

    @Override
    double Monto() {
        switch(especialidad){
            case "ODONTOLOGIA INTEGRAL": return 500;
            case "RADIOLOGIA": return 324;
            case "ODONTOPEDIATRIA": return 232;
            case "PERIODONCIA": return 234;
            case "CIRUGIA": return 599;
            case "ENDODONCIA": return 434;
            case "ODONTOLOGIA ESTETICA": return 434;
            case "REHABILITACION ORAL": return 563;
            case "ORTODONCIA": return 600;            
            default: return 0;
        }
    }
    
    
    
}
