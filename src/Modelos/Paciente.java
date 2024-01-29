
package Modelos;

import java.text.DecimalFormat;
import javax.swing.table.DefaultTableModel;

public class Paciente implements Impresiones_Doctor2 {
    private String codigo;
    private String nombres;
    private String apellidos;
    private String correo;
    private String celular;    
    private String sede;
    private String descripcion;
    private static int con=0;

    public Paciente() {
        con++;       
        DecimalFormat df =new DecimalFormat("P0000");
        codigo = df.format(con);
    }
        
    public String DescripEsp(){
        switch(descripcion){
            case "CUÑA DISTAL O MESIAL POR DIENTE": return "INTEGRAL";
            case "DESTARTRAJE CON ULTRA SONIDO": return "INTEGRAL";
            case "EXAMEN CLINICO Y ODONTOGRAMA": return "INTEGRAL";
            case "DFISIOTERAPIA ORAL": return "INTEGRAL";
            case "ION. DE VIDRIO FOTOCURADO (1 SUP.)": return "INTEGRAL";
            case "OBTURACION RESINA 1 SUP": return "INTEGRAL";
            case "OBTURACION RESINA 2 SUP": return "INTEGRAL";
            case "OBTURACION RESINA 3 SUP": return "INTEGRAL";
            case "PROFILAXIS": return "INTEGRAL";
            case "REPARACION DE PERFORACIONES": return "INTEGRAL";
            case "RESINA EN TEMPORALES POR SUPERFICIE": return "INTEGRAL";
            case "RETENEDORES POR ARCADA": return "INTEGRAL";
            case "SELLANTES POR PIEZA": return "INTEGRAL";
            
            case "RADIOGRAFIA PERIAPICAL": return "RADIOLOGIA";
            case "RADIOGRAFIA PANORAMICA": return "RADIOLOGIA";
            
            case "FLUOR GEL POR ARCADA": return "ODONTOPEDIATRIA";
            case "PULPOTOMIA": return "ODONTOPEDIATRIA";
            
            case "COLGAJO PERIODONTAL POR CUADRANTE": return "PERIODONCIA";
            case "GINGIVECTOMIAS/GINGIVOPLASTIAS POR CUADRANTE": return "PERIODONCIA";
            case "IMPLANTES DENTALES": return "PERIODONCIA";
            case "INJERTO OSEO": return "PERIODONCIA";
            case "REIMPLANTE DENTARIO": return "PERIODONCIA";
            case "REMOCION CALCULOS SUPRAGING. (INCLUYE PROFILAXIS)": return "PERIODONCIA";
            case "REMODELADO OSEO POR CUADRANTE (SIN EXOD.)": return "PERIODONCIA";
            
            case "ALARGAMIENTO CORONA CLINICA SIN OSTEOMIA": return "CIRUGÍA";
            case "ALARGAMIENTO DE CORONA CLINICA CON OSTEOMIA": return "CIRUGÍA";
            case "CAPUCHONES PERICORONARIOS": return "CIRUGÍA";
            case "CIRUGIA METODO ABIERTO (SEMI O INCLUIDOS)": return "CIRUGÍA";
            case "CIRUGIA MUCOGINGIVAL PARA CUBRIMIENTO DE RAICES": return "CIRUGÍA";
            case "CURETAJE A CAMPO ABIERTO POR CUADRANTE": return "CIRUGÍA";
            case "DRENAJE ABSCESO INTRAORAL": return "CIRUGÍA";
            case "ESCISION DEL TORUS (PALATINO O LINGUAL BILATERAL)": return "CIRUGÍA";
            case "EXODONCIA DIENTE TEMPORAL": return "CIRUGÍA";
            case "EXODONCIA SIMPLE": return "CIRUGÍA";
            case "EXTRACCION CON ODONTOSECCION (COMPLEJA)": return "CIRUGÍA";
            case "FERULIZACION POR CADA 3 PIEZAS": return "CIRUGÍA";
            case "FRENECTOMIA (LINGUAL O LABIAL)": return "CIRUGÍA";
            case "VENTANA QUIRURGICA ORTO (OSEA O MUCOSA)": return "CIRUGÍA";
            
            case "APEXOGENESIS CONVENCIONAL": return "CENDODONCIA"; 
            case "APICECTOMIA EN ANTERIORES": return "CENDODONCIA";
            case "APICECTOMIA EN POSTERIORES": return "CENDODONCIA";
            case "ENDODONCIA ANTERIOR": return "CENDODONCIA";
            case "ENDODONCIA EN ANTERIORES TEMPORALES": return "CENDODONCIA";
            case "ENDODONCIA EN POSTERIORES TEMPORALES": return "CENDODONCIA";
            case "ENDODONCIA MOLARES": return "CENDODONCIA";
            case "ENDODONCIA PREMOLARES": return "CENDODONCIA";
            
            case "BLANQUEAMIENTO CASERO": return "ESTÉTICA";
            case "BLANQUEAMIENTO CONSULTORIO LUZ DE PODER": return "ESTÉTICA";
            case "BLANQUEAMIENTO POR DIENTE": return "ESTÉTICA";
            case "CARILLA DE RESINA": return "ESTÉTICA";
            case "CARILLAS RESINA EN TEMPORALES": return "ESTÉTICA";
            
            case "CARILLA DE PORCELANA": return "REHABILITACIÓN ORAL";
            case "CORONA ACRILICO TERMOCURADO (PROVISIONAL)": return "REHABILITACIÓN ORAL";
            case "CORONA METAL PORCELANA": return "REHABILITACIÓN ORAL";
            case "CORONA METAL PORCELANA SOBRE IMPLANTE": return "REHABILITACIÓN ORAL";
            case "CORONA PORCELANA INCERAM": return "REHABILITACIÓN ORAL";
            case "INCRUSTACION DE METAL": return "REHABILITACIÓN ORAL";
            case "INCRUSTACION DE PORCELANA (REFRACTARIA)": return "REHABILITACIÓN ORAL";
            case "PERNO MUÑON COLADO": return "REHABILITACIÓN ORAL";
            case "PLACA MIORRELAJANTE EN ACETATO": return "REHABILITACIÓN ORAL";
            case "PPR ACRILICO UNA ARCADA": return "REHABILITACIÓN ORAL";
            case "PPR METAL/ACRILICO UNA ARCADA": return "REHABILITACIÓN ORAL";
            case "PROTESIS TOTAL DIENTES ACRILICOS UNA ARCADA": return "REHABILITACIÓN ORAL";
            case "REPARACION DE PROTESIS (NO INCLUYE DIENTES)": return "REHABILITACIÓN ORAL";
            
            case "MANTENEDOR DE ESPACIO REMOVIBLE": return "ORTODONCIA";
            case "ORTODONCIA CORRECTIVA 12 MESES": return "ORTODONCIA";
            case "ORTODONCIA CORRECTIVA 18 MESES": return "ORTODONCIA";
            case "ORTODONCIA CORRECTIVA 24 MESES": return "ORTODONCIA";
            case "PAQUETE DE ORTODONCIA (FOTOS, MODELOS, RX. PAN. Y CEF)": return "ORTODONCIA";
            case "TRATAMIENTO DE ORTODONCIA BRACKETS METALICOS 1 AÑO": return "ORTODONCIA";
            case "TRATAMIENTO DE ORTODONCIA BRACKETS METALICOS 1½ AÑOS": return "ORTODONCIA";
            case "TRATAMIENTO DE ORTODONCIA BRACKETS METALICOS 2 AÑOS": return "ORTODONCIA";                    
                        
            default: return "";
        }
    }      
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public void Imprimir2(DefaultTableModel dtm) {
        Object[] registro ={con,codigo,nombres,apellidos,correo,celular,sede,descripcion,
                            this.DescripEsp()};
        dtm.addRow(registro);
    }
    
    
}
