
package Modelos;

import java.text.DecimalFormat;

 
public class Especialidad extends InforPaciente implements Precios,Descuento,PrecioporMes{

    public static int getConted() {
        return conted;
    }

    public static void setConted(int aConted) {
        conted = aConted;
    }
    private String codigo;
    private String tratamiento;
    private int nromeses;
    private static int conted=0;
    
    public Especialidad(String tratamiento, int nromeses, String nombres, String apellidos, String correo, String celular, String sede) {
        super(nombres, apellidos, correo, celular, sede);
        this.tratamiento = tratamiento;
        this.nromeses = nromeses;
        conted++;
        DecimalFormat df=new DecimalFormat("P0000");
        codigo= df.format(conted);
    }

   
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public int getNromeses() {
        return nromeses;
    }

    public void setNromeses(int nromeses) {
        this.nromeses = nromeses;
    }
    
    @Override
    public double PrecioBase() {
        if(tratamiento.equals("ALARGAMIENTO CORONA CLINICA SIN OSTEOMIA"))return ALARGAMIENTO_CORONA+(CIRUGIA_MES*nromeses);
        if(tratamiento.equals("ALARGAMIENTO DE CORONA CLINICA CON OSTEOMIA"))return ALARGAMIENTO_CORONA_OSTEOMIA+(CIRUGIA_MES*nromeses);
        if(tratamiento.equals("CIRUGIA METODO ABIERTO(SEMI O INCLUIDOS)"))return CIRUGIA_METODO_ABIERTO+(CIRUGIA_MES*nromeses);
        if(tratamiento.equals("CIRUGIA MUCOGINGIVAL PARA CUBRIMIENTO DE RAICES"))return CIRUGIA_MUCOGINGIVAL+(CIRUGIA_MES*nromeses);
        if(tratamiento.equals("EXODONCIA DIENTE TEMPORAL"))return EXODONCIA_TEMPORAL+(CIRUGIA_MES*nromeses);
        if(tratamiento.equals("EXODONCIA SIMPLE"))return EXODONCIA_SIMPLE+(CIRUGIA_MES*nromeses);
        if(tratamiento.equals("FRENECTOMIA(LINGUAL O LABIAL)"))return FRENECTOMIA+(CIRUGIA_MES*nromeses);
        if(tratamiento.equals("ESCISION DEL TORUS(PALATINO O LINGUAL BILATERAL)"))return ESCISION_TORUS+(CIRUGIA_MES*nromeses);
        
        if(tratamiento.equals("APEXOGENESIS CONVENCIONAL"))return APEXOGENESIS+(ENDODONCIA_MES*nromeses);
        if(tratamiento.equals("APICECTOMIA EN ANTERIORES"))return APICECTOMIA_ANTERIORES+(ENDODONCIA_MES*nromeses);
        if(tratamiento.equals("APICECTOMIA EN POSTERIORES"))return APICECTOMIA_POSTERIORES+(ENDODONCIA_MES*nromeses);
        if(tratamiento.equals("ENDODONCIA ANTERIOR"))return ENDODONCIA_ANTERIOR+(ENDODONCIA_MES*nromeses);
        if(tratamiento.equals("ENDODONCIA EN ANTERIORES TEMPORALES"))return ENDODONCIA_ANTERIOR_TEMPORAL+(ENDODONCIA_MES*nromeses);
        if(tratamiento.equals("ENDODONCIA EN POSTERIORES TEMPORALES"))return ENDODONCIA_POSTERIOR_TEMPORAL+(ENDODONCIA_MES*nromeses);
        if(tratamiento.equals("ENDODONCIA MOLARES"))return ENDODONCIA_MOLARES+(ENDODONCIA_MES*nromeses);
        if(tratamiento.equals("ENDODONCIA PREMOLARES"))return ENDODONCIA_PREMOLARES+(ENDODONCIA_MES*nromeses);       
        
        if(tratamiento.equals("BLANQUEAMIENTO CASERO"))return BLANQUEAMIENTO_CASERO+(ODONTOLOGIA_ESTETICA_MES*nromeses);
        if(tratamiento.equals("BLANQUEAMIENTO CONSULTORIO LUZ DE PODER"))return BLANQUEAMIENTO_LUZ+(ODONTOLOGIA_ESTETICA_MES*nromeses);
        if(tratamiento.equals("BLANQUEAMIENTO POR DIENTE"))return BLANQUEAMIENTO_DIENTE+(ODONTOLOGIA_ESTETICA_MES*nromeses);
        if(tratamiento.equals("CARILLA DE RESINA"))return CARILLA_RESINA+(ODONTOLOGIA_ESTETICA_MES*nromeses);
        if(tratamiento.equals("CARILLAS RESINA EN TEMPORALES"))return CARILLA_RESINA_TEMPORAL+(ODONTOLOGIA_ESTETICA_MES*nromeses);
        
        if(tratamiento.equals("CUÑA DISTAL"))return CUNA_DISTAL+(ODONTOLOGIA_INTEGRAL_MES*nromeses);
        if(tratamiento.equals("DESTARTRAJE CON ULTRA SONIDO"))return DESTARTRAJE_ULTRASONIDO+(ODONTOLOGIA_INTEGRAL_MES*nromeses);
        if(tratamiento.equals("REPARACION DE PERFORACIONES"))return REPARACION_PERFORACIONES+(ODONTOLOGIA_INTEGRAL_MES*nromeses);
        if(tratamiento.equals("PROFILAXIS"))return PROFILAXIS+(ODONTOLOGIA_INTEGRAL_MES*nromeses);
        if(tratamiento.equals("SELLANTES POR PIEZA"))return SELLANTES_PIEZAS+(ODONTOLOGIA_INTEGRAL_MES*nromeses);
        if(tratamiento.equals("FISIOTERAPIA ORAL"))return FISIOTERAPIA_ORAL+(ODONTOLOGIA_INTEGRAL_MES*nromeses);
        if(tratamiento.equals("OBTURACION RESINA 1 SUP"))return OBTURACION_RESINA_1SUP+(ODONTOLOGIA_INTEGRAL_MES*nromeses);
        if(tratamiento.equals("OBTURACION RESINA 2 SUP"))return OBTURACION_RESINA_2SUP+(ODONTOLOGIA_INTEGRAL_MES*nromeses);
        if(tratamiento.equals("OBTURACION RESINA 3 SUP"))return OBTURACION_RESINA_3SUP+(ODONTOLOGIA_INTEGRAL_MES*nromeses);
        
        if(tratamiento.equals("FLUOR GEL POR ARCADA"))return FLUOR_GEL_ARCADA+(ODONTOPEDIATRIA_MES*nromeses);
        if(tratamiento.equals("PULPOTOMIA"))return PULPOTOMIA+(ODONTOPEDIATRIA_MES*nromeses);

        if(tratamiento.equals("MANTENEDOR DE ESPACIO REMOVIBLE"))return MANTENEDOR_ESPACIO+(ORTODONCIA_MES*nromeses);
        if(tratamiento.equals("PAQUETE DE ORTODONCIA(FOTOS, MODELOS, RX. PAN. Y CEF)"))return PAQUETE_ORTODONCIA+(ORTODONCIA_MES*nromeses);
        if(tratamiento.equals("ORTODONCIA CORRECTIVA"))return ORTODONCIA_CORRECTIVA+(ORTODONCIA_MES*nromeses); 
        if(tratamiento.equals("TRATAMIENTO DE ORTODONCIA BRACKETS METALICOS")&&(nromeses<13))return TRATAMIENTO_BRACKETS_1+(ORTODONCIA_MES*nromeses);
        if(tratamiento.equals("TRATAMIENTO DE ORTODONCIA BRACKETS METALICOS")&&(nromeses<19))return TRATAMIENTO_BRACKETS_2+(ORTODONCIA_MES*nromeses);
        if(tratamiento.equals("TRATAMIENTO DE ORTODONCIA BRACKETS METALICOS")&&(nromeses<25))return TRATAMIENTO_BRACKETS_3+(ORTODONCIA_MES*nromeses);
        
        if(tratamiento.equals("COLGAJO PERIODONTAL POR CUADRANTE"))return COLGAJO_PERIODONTAL+(PERIODONCIA_MES*nromeses);
        if(tratamiento.equals("GINGIVECTOMIAS"))return GINGIVECTOMIAS+(PERIODONCIA_MES*nromeses);
        if(tratamiento.equals("INJERTO OSEO"))return INJERTO_OSEO+(PERIODONCIA_MES*nromeses);
        if(tratamiento.equals("IMPLANTES DENTALES"))return IMPLANTES_DENTALES+(PERIODONCIA_MES*nromeses);
        if(tratamiento.equals("REIMPLANTE DENTARIO"))return REIMPLANTE_DENTARIO+(PERIODONCIA_MES*nromeses);
        if(tratamiento.equals("REMOCION CALCULOS SUPRAGING(INCLUYE PROFILAXIS)"))return REMOCION_CALCULOS_SUPRAGING+(PERIODONCIA_MES*nromeses);
        if(tratamiento.equals("REMODELADO OSEO POR CUADRANTE(SIN EXOD)"))return REMODELADO_OSEO+(PERIODONCIA_MES*nromeses);
        
        if(tratamiento.equals("RADIOGRAFIA PERIAPICAL"))return RADIOGRAFIA_PERIAPICAL+(RADIOLOGIA_MES*nromeses);
        if(tratamiento.equals("RADIOGRAFIA PANORAMICA"))return RADIOGRAFIA_PANORAMICA+(RADIOLOGIA_MES*nromeses);
        
        if(tratamiento.equals("CARILLA DE PORCELANA"))return CARILLA_PORCELANA+(REHABILITACION_ORAL_MES*nromeses);
        if(tratamiento.equals("CORONA ACRILICO TERMOCURADO(PROVISIONAL)"))return CORONA_ACRILICO_TERMOCURADO+(REHABILITACION_ORAL_MES*nromeses);
        if(tratamiento.equals("INCRUSTACION DE METAL"))return INCRUSTACION_METAL+(REHABILITACION_ORAL_MES*nromeses);
        if(tratamiento.equals("INCRUSTACION DE PORCELANA(REFRACTARIA)"))return INCRUSTACION_PORCELANA+(REHABILITACION_ORAL_MES*nromeses);
        if(tratamiento.equals("PERNO MUÑON COLADO"))return PERNO_MUNON_COLADO+(REHABILITACION_ORAL_MES*nromeses);
        if(tratamiento.equals("PLACA MIORRELAJANTE EN ACETATO"))return PLACA_MIORRELAJANTE+(REHABILITACION_ORAL_MES*nromeses);
        if(tratamiento.equals("PPR ACRILICO UNA ARCADA"))return PPR_ACRILICO+(REHABILITACION_ORAL_MES*nromeses);
        if(tratamiento.equals("PROTESIS TOTAL DIENTES ACRILICOS UNA ARCADA"))return PROTESIS_TOTAL_DIENTES+(REHABILITACION_ORAL_MES*nromeses);
        if(tratamiento.equals("REPARACION DE PROTESIS"))return REPARACION_PROTESIS+(REHABILITACION_ORAL_MES*nromeses);
                
        return 0;
        
    }
    @Override
    public double Descuentos() {       
        if(tratamiento.equals("ALARGAMIENTO CORONA CLINICA SIN OSTEOMIA"))return CIRUGIA*PrecioBase();
        if(tratamiento.equals("ALARGAMIENTO DE CORONA CLINICA CON OSTEOMIA"))return CIRUGIA*PrecioBase();
        if(tratamiento.equals("CIRUGIA METODO ABIERTO(SEMI O INCLUIDOS)"))return CIRUGIA*PrecioBase();
        if(tratamiento.equals("CIRUGIA MUCOGINGIVAL PARA CUBRIMIENTO DE RAICES"))return CIRUGIA*PrecioBase();
        if(tratamiento.equals("EXODONCIA DIENTE TEMPORAL"))return CIRUGIA*PrecioBase();
        if(tratamiento.equals("EXODONCIA SIMPLE"))return CIRUGIA*PrecioBase();
        if(tratamiento.equals("FRENECTOMIA(LINGUAL O LABIAL)"))return CIRUGIA*PrecioBase();
        if(tratamiento.equals("ESCISION DEL TORUS(PALATINO O LINGUAL BILATERAL)"))return CIRUGIA*PrecioBase();
        
        if(tratamiento.equals("APEXOGENESIS CONVENCIONAL"))return ENDODONCIA*PrecioBase();
        if(tratamiento.equals("APICECTOMIA EN ANTERIORES"))return ENDODONCIA*PrecioBase();
        if(tratamiento.equals("APICECTOMIA EN POSTERIORES"))return ENDODONCIA*PrecioBase();
        if(tratamiento.equals("ENDODONCIA ANTERIOR"))return ENDODONCIA*PrecioBase();
        if(tratamiento.equals("ENDODONCIA EN ANTERIORES TEMPORALES"))return ENDODONCIA*PrecioBase();
        if(tratamiento.equals("ENDODONCIA EN POSTERIORES TEMPORALES"))return ENDODONCIA*PrecioBase();
        if(tratamiento.equals("ENDODONCIA MOLARES"))return ENDODONCIA*PrecioBase();
        if(tratamiento.equals("ENDODONCIA PREMOLARES"))return ENDODONCIA*PrecioBase();       
        
        if(tratamiento.equals("BLANQUEAMIENTO CASERO"))return ODONTOLOGIA_ESTETICA*PrecioBase();
        if(tratamiento.equals("BLANQUEAMIENTO CONSULTORIO LUZ DE PODER"))return ODONTOLOGIA_ESTETICA*PrecioBase();
        if(tratamiento.equals("BLANQUEAMIENTO POR DIENTE"))return ODONTOLOGIA_ESTETICA*PrecioBase();
        if(tratamiento.equals("CARILLA DE RESINA"))return ODONTOLOGIA_ESTETICA*PrecioBase();
        if(tratamiento.equals("CARILLAS RESINA EN TEMPORALES"))return ODONTOLOGIA_ESTETICA*PrecioBase();
        
        if(tratamiento.equals("CUÑA DISTAL"))return ODONTOLOGIA_INTEGRAL*PrecioBase();
        if(tratamiento.equals("DESTARTRAJE CON ULTRA SONIDO"))return ODONTOLOGIA_INTEGRAL*PrecioBase();
        if(tratamiento.equals("REPARACION DE PERFORACIONES"))return ODONTOLOGIA_INTEGRAL*PrecioBase();
        if(tratamiento.equals("PROFILAXIS"))return ODONTOLOGIA_INTEGRAL*PrecioBase();
        if(tratamiento.equals("SELLANTES POR PIEZA"))return ODONTOLOGIA_INTEGRAL*PrecioBase();
        if(tratamiento.equals("FISIOTERAPIA ORAL"))return ODONTOLOGIA_INTEGRAL*PrecioBase();
        if(tratamiento.equals("OBTURACION RESINA 1 SUP"))return ODONTOLOGIA_INTEGRAL*PrecioBase();
        if(tratamiento.equals("OBTURACION RESINA 2 SUP"))return ODONTOLOGIA_INTEGRAL*PrecioBase();
        if(tratamiento.equals("OBTURACION RESINA 3 SUP"))return ODONTOLOGIA_INTEGRAL*PrecioBase();
        
        if(tratamiento.equals("FLUOR GEL POR ARCADA"))return ODONTOPEDIATRIA*PrecioBase();
        if(tratamiento.equals("PULPOTOMIA"))return ODONTOPEDIATRIA*PrecioBase();

        if(tratamiento.equals("MANTENEDOR DE ESPACIO REMOVIBLE"))return ORTODONCIA*PrecioBase();
        if(tratamiento.equals("PAQUETE DE ORTODONCIA(FOTOS, MODELOS, RX. PAN. Y CEF)"))return ORTODONCIA*PrecioBase();
        if(tratamiento.equals("ORTODONCIA CORRECTIVA"))return ORTODONCIA*PrecioBase(); 
        if(tratamiento.equals("TRATAMIENTO DE ORTODONCIA BRACKETS METALICOS")&&(nromeses<13))return ORTODONCIA*PrecioBase();
        if(tratamiento.equals("TRATAMIENTO DE ORTODONCIA BRACKETS METALICOS")&&(nromeses<19))return ORTODONCIA*PrecioBase();
        if(tratamiento.equals("TRATAMIENTO DE ORTODONCIA BRACKETS METALICOS")&&(nromeses<25))return ORTODONCIA*PrecioBase();
        
        if(tratamiento.equals("COLGAJO PERIODONTAL POR CUADRANTE"))return PERIODONCIA*PrecioBase();
        if(tratamiento.equals("GINGIVECTOMIAS"))return PERIODONCIA*PrecioBase();
        if(tratamiento.equals("INJERTO OSEO"))return PERIODONCIA*PrecioBase();
        if(tratamiento.equals("IMPLANTES DENTALES"))return PERIODONCIA*PrecioBase();
        if(tratamiento.equals("REIMPLANTE DENTARIO"))return PERIODONCIA*PrecioBase();
        if(tratamiento.equals("REMOCION CALCULOS SUPRAGING(INCLUYE PROFILAXIS)"))return PERIODONCIA*PrecioBase();
        if(tratamiento.equals("REMODELADO OSEO POR CUADRANTE(SIN EXOD)"))return PERIODONCIA*PrecioBase();
        
        if(tratamiento.equals("RADIOGRAFIA PERIAPICAL"))return RADIOLOGIA*PrecioBase();
        if(tratamiento.equals("RADIOGRAFIA PANORAMICA"))return RADIOLOGIA*PrecioBase();
        
        if(tratamiento.equals("CARILLA DE PORCELANA"))return REHABILITACION_ORAL*PrecioBase();
        if(tratamiento.equals("CORONA ACRILICO TERMOCURADO(PROVISIONAL)"))return REHABILITACION_ORAL*PrecioBase();
        if(tratamiento.equals("INCRUSTACION DE METAL"))return REHABILITACION_ORAL*PrecioBase();
        if(tratamiento.equals("INCRUSTACION DE PORCELANA(REFRACTARIA)"))return REHABILITACION_ORAL*PrecioBase();
        if(tratamiento.equals("PERNO MUÑON COLADO"))return REHABILITACION_ORAL*PrecioBase();
        if(tratamiento.equals("PLACA MIORRELAJANTE EN ACETATO"))return REHABILITACION_ORAL*PrecioBase();
        if(tratamiento.equals("PPR ACRILICO UNA ARCADA"))return REHABILITACION_ORAL*PrecioBase();
        if(tratamiento.equals("PROTESIS TOTAL DIENTES ACRILICOS UNA ARCADA"))return REHABILITACION_ORAL*PrecioBase();
        if(tratamiento.equals("REPARACION DE PROTESIS"))return REHABILITACION_ORAL*PrecioBase();
                
        return 0;
        
    }        
    
    public String ImprimirDatos(){
        return "\nCodigo                   : "+codigo+
                super.MostrarAtributos()+
               "\nTratamiento              : "+tratamiento+
               "\nNumero de Meses          : "+nromeses+
               "\n**************** RESUMEN DE PAGOS ****************"+
                super.MostrarCalculos();

    }
}