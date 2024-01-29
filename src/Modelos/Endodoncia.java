package Modelos;
import java.text.DecimalFormat;
public class Endodoncia extends InforPaciente implements Precios,Descuento,PrecioporMes{
    //atributos
    private String codigo;
    private String tratamiento;
    private int nromeses;
    private static int conted;
    //constructor
    public Endodoncia(String tratamiento, int nromeses, String nombres, String apellidos, String correo, String celular, String sede) {
        super(nombres, apellidos, correo, celular, sede);
        this.tratamiento = tratamiento;
        this.nromeses = nromeses;
        conted++;
        DecimalFormat df=new DecimalFormat("ED0000");
        codigo= df.format(conted);
    }
    //metodos getter y setter
    public String getCodigo() {return codigo;}
    public void setCodigo(String codigo) {this.codigo = codigo;}
    public String getTratamiento() {return tratamiento;}
    public void setTratamiento(String tratamiento) {this.tratamiento = tratamiento;}
    public int getNromeses() {return nromeses;}
    public void setNromeses(int nromeses) {this.nromeses = nromeses;}
    //implementamos metodos abstractos
    @Override
    public double PrecioBase() {
        if(tratamiento.equals("APEXOGENESIS CONVENCIONAL"))return APEXOGENESIS+(ENDODONCIA_MES*nromeses);
        if(tratamiento.equals("APICECTOMIA EN ANTERIORES"))return APICECTOMIA_ANTERIORES+(ENDODONCIA_MES*nromeses);
        if(tratamiento.equals("APICECTOMIA EN POSTERIORES"))return APICECTOMIA_POSTERIORES+(ENDODONCIA_MES*nromeses);
        if(tratamiento.equals("ENDODONCIA ANTERIOR"))return ENDODONCIA_ANTERIOR+(ENDODONCIA_MES*nromeses);
        if(tratamiento.equals("ENDODONCIA EN ANTERIORES TEMPORALES"))return ENDODONCIA_ANTERIOR_TEMPORAL+(ENDODONCIA_MES*nromeses);
        if(tratamiento.equals("ENDODONCIA EN POSTERIORES TEMPORALES"))return ENDODONCIA_POSTERIOR_TEMPORAL+(ENDODONCIA_MES*nromeses);
        if(tratamiento.equals("ENDODONCIA MOLARES"))return ENDODONCIA_MOLARES+(ENDODONCIA_MES*nromeses);
        if(tratamiento.equals("ENDODONCIA PREMOLARES"))return ENDODONCIA_PREMOLARES+(ENDODONCIA_MES*nromeses);
        return 0;
    }
    @Override
    public double Descuentos() {return ENDODONCIA*PrecioBase();}
    //metodos propios
    public String ImprimirDatos(){
        return "\nCodigo                   : "+codigo+
                super.MostrarAtributos()+
               "\nTratamiento              : "+tratamiento+
               "\nNumero de Meses          : "+nromeses+
               "\n**************** RESUMEN DE PAGOS ****************"+
                super.MostrarCalculos();
    }
}
